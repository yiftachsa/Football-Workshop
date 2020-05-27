package Domain.Users;


import Domain.EntityManager;
import Domain.Game.Game;
import Domain.UserComplaints;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class SystemUser extends User implements Fan {

    private List<Role> roles;
    private List<UserComplaints> complaints;
    protected List<Game> gamesAlert;
    protected String username;
    private String password; /**  password is in hash format */
    private String name;
    private String email;
    private boolean alertEmail;



    @Override
    public boolean removePageFromFollow() {
        return false;
    }

    @Override
    public boolean addPageToFollow() {
        return false;
    }

    public SystemUser(String username, String password, String name , String email, boolean alertEmail) {
        this.roles = new ArrayList<>();
        this.username = username;
        this.name = name;
        this.password = password;
        this.email = email;
        this.alertEmail = alertEmail;
        gamesAlert = new ArrayList<>();
        EntityManager.getInstance().addUser(this);
    }

    public String getEmail() {
        return email;
    }

    public boolean isAlertEmail() {
        return alertEmail;
    }

    public SystemUser(String username, String name)
    {
        this.roles = new ArrayList<>();
        this.username = username;
        this.name = name;
        this.gamesAlert = new ArrayList<>();
        this.password = "";
        this.email = "";
        this.alertEmail = false;
        EntityManager.getInstance().addUser(this);
    }

    public List<Game> getGamesAlert() {
        return gamesAlert;
    }

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
        if(role != null && !roles.contains(role))
        {
            roles.add(role);
            EntityManager.getInstance().addRole(role);
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
                getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getPassword(), getName());
    }

}
