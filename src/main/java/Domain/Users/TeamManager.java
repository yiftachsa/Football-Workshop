package Domain.Users;

import Domain.Game.Asset;
import Domain.Game.Team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class TeamManager extends Role implements Asset {
    private List<Team> managedTeams;
    private HashMap<Team , List<TeamManagerPermissions>> permissionsPerTeam;

    public final String permissionsString = "Permissions";

    public TeamManager(SystemUser systemUser)
    {
        super(RoleTypes.TEAM_MANAGER, systemUser);
        managedTeams = new ArrayList<>();
        permissionsPerTeam = new HashMap<>();
    }


    public boolean addTeam(Team teamToMange, TeamOwner teamOwner)
    {
        if(teamToMange != null && teamToMange.isTeamOwner(teamOwner))
        {
            managedTeams.add(teamToMange);
            return teamToMange.addTeamManager(teamOwner,this);
        }
        return false;
    }

    private boolean addPermission(Team team , TeamManagerPermissions permission)
    {
        return false;
    }

    private boolean removePermission(Team team , TeamManagerPermissions permission)
    {
        return false;
    }

    private List<TeamManagerPermissions> allPermissionsPerTeam(Team team)
    {
        List<TeamManagerPermissions> permissions = new ArrayList<>();
        if(this.permissionsPerTeam.get(team) != null)
        {
            permissions = this.permissionsPerTeam.get(team);
        }
        return permissions;
    }

    //todo: add permissions!
    @Override
    public List<String> getProperties() {
        List<String> properties = new ArrayList<>();
        properties.add(permissionsString);
        return properties;
    }

    @Override
    public boolean changeProperty(String toChange, String property)
    {
        return false;
    }

    @Override
    public boolean isListProperty(String property) {
        return true;
    }

    @Override
    public boolean isStringProperty(String property) {
        return false;
    }

    @Override
    public boolean isEnumProperty(String property) {
        return false;
    }


    @Override
    public boolean addAllProperties() {
        return true;
    }

    @Override
    public boolean addProperty(String property) {
        return false;

    }

    @Override
    public boolean removeProperty(String property) {
        return false;
    }

    @Override
    public List<Enum> getAllValues(String property) {

        List<Enum> allEnumValues = new ArrayList<>();
        if (property.equals(permissionsString))
        {
            TeamManagerPermissions[] teamManagerPermissions = TeamManagerPermissions.values();
            for (int i = 0; i < teamManagerPermissions.length; i++) {
                //todo: check!
                allEnumValues.add(teamManagerPermissions[i]);
            }
            return allEnumValues;
        }
        return allEnumValues;
    }

    @Override
    public List<Enum> getAllPropertyList(Team team, String propertyName) {
        List<TeamManagerPermissions> permissions = this.allPermissionsPerTeam(team);
        List<Enum> enumList = new ArrayList<>();
        for (int i = 0; i < permissions.size(); i++) {
            enumList.add(permissions.get(i));
        }
        return enumList;
    }

    @Override
    public boolean addProperty(String propertyName, Enum anEnum , Team team) {
        if(propertyName.equals(this.permissionsString))
        {
            List<TeamManagerPermissions> permissions = this.allPermissionsPerTeam(team);
            permissions.add((TeamManagerPermissions) anEnum);
            this.permissionsPerTeam.put(team, permissions);
            return true;
        }
        return  false;
    }

    @Override
    public boolean removeProperty(String propertyName, Enum anEnum, Team team) {
        if(propertyName.equals(this.permissionsString))
        {
            List<TeamManagerPermissions> permissions = this.allPermissionsPerTeam(team);
            permissions.remove(anEnum);
            this.permissionsPerTeam.put(team, permissions);
            return true;
        }
        return  false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        TeamManager teamManager = (TeamManager) o;
        return this.getSystemUser().getName().equals(teamManager.getSystemUser().getName()) &&
                this.getSystemUser().getUsername().equals(teamManager.getSystemUser().getUsername());
    }


}
