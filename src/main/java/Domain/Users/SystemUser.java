package Domain.Users;


import javax.security.auth.kerberos.KerberosTicket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class SystemUser {

    private List<Role> roles;

    protected String username;
    private String password;
    private String name;

    public SystemUser(String username,String password, String name) {
        this(username,name);
        this.password = password;
        //TODO: Add to database?????
    }

    public SystemUser(String username,String name)
    {
        this.roles = new ArrayList<>();
        this.username = username;
        this.name = name;
    }

//

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public boolean addNewRole(Role role)
    {
        if(role != null)
        {
            roles.add(role);
            return true;
        }
        return false;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean isType(RoleTypes roleType) {
        for(Role role : roles)
        {
            if(role.type.equals(roleType))
            {
                return true;
            }
        }
        return false;
    }

    public Role getRole(RoleTypes roleType)
    {
        for(Role role : roles)
        {
            if(role.type.equals(roleType))
            {
                return role;
            }
        }
        return null;
    }

    public boolean removeRole(Role role) {
        if(role != null)
        {
            roles.remove(role);
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SystemUser)) return false;
        SystemUser that = (SystemUser) o;
        return getRoles().size() == that.getRoles().size() &&
                getUsername().equals(that.getUsername()) &&
                getPassword().equals(that.getPassword()) &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getPassword(), getName());
    }
}
