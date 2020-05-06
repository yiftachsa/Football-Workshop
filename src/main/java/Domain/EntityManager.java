package Domain;

import DB.DBManager;
import DB.Table;
import Domain.Game.League;
import Domain.Game.Stadium;
import Domain.Users.Role;
import Domain.Users.RoleTypes;
import Domain.Users.SystemUser;
import Domain.Game.Stadium;
import Domain.Game.Team;
import Domain.Users.*;
import Domain.Game.Stadium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EntityManager {
    private static EntityManager entityManagerInstance = null;

    private List<SystemUser> allUsers;
    private List<Team> allTeams;
    private List<Stadium> allStadiums;
    private HashSet<League> allLeagues;

    private EntityManager() {
        allUsers = new ArrayList<>();
        allLeagues = new HashSet<>();
        allTeams = new ArrayList<>();
        allStadiums = new ArrayList<>();
    }

    /**
     * Returns an instance of dbManager. part of the Singleton design
     *
     * @return - DBManager - an instance of dbManager
     */
    public static EntityManager getInstance() {
        if (entityManagerInstance == null) {
            entityManagerInstance = new EntityManager();
        }
        return entityManagerInstance;
    }


    public void initSystem() throws Exception {
        Table systemUsersTable = DBManager.getInstance().getSystemUsers();
        for (int i = 0; i < systemUsersTable.size(); i++) {
            String username = systemUsersTable.getRecordValue(i, "username");
            String name = systemUsersTable.getRecordValue(i, "name");
            String[] roles = systemUsersTable.getRecordValue(i, "role").split(";");

            SystemUser newUser = new SystemUser(username, name);
            for (String role : roles) {
                switch (role) {
                    case "fan":
                        newUser.addNewRole(recreateRoleFromDB(username, RoleTypes.FAN));
                        break;
                    case "player":
                        newUser.addNewRole(recreateRoleFromDB(username, RoleTypes.PLAYER));
                        break;
                    case "coach":
                        newUser.addNewRole(recreateRoleFromDB(username, RoleTypes.COACH));
                        break;
                    case "team manager":
                        newUser.addNewRole(recreateRoleFromDB(username, RoleTypes.TEAM_MANAGER));
                        break;
                    case "team owner":
                        newUser.addNewRole(recreateRoleFromDB(username, RoleTypes.TEAM_OWNER));
                        break;
                    case "system admin":
                        newUser.addNewRole(recreateRoleFromDB(username, RoleTypes.SYSTEM_ADMIN));
                        break;
                    case "referee":
                        newUser.addNewRole(recreateRoleFromDB(username, RoleTypes.REFEREE));
                        break;
                    case "association representative":
                        newUser.addNewRole(recreateRoleFromDB(username, RoleTypes.ASSOCIATION_REPRESENTATIVE));
                        break;
                    default:
                        throw new Exception("Error in Role type in the DB");
                }

            }
            allUsers.add(newUser);

        }
    }

    private Role recreateRoleFromDB(String username, RoleTypes roleType) {
        Role newRole;

        try {
            Table roleRecords = DBManager.getInstance().getRelevantRecords(username, roleType);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public List<League> getLeagues() {
        return new ArrayList<League>(allLeagues);
    }

    /**
     * Returns a SystemUser by his username
     * @param username
     * @return The SystemUser with the username, if exists in the system.
     */
    public SystemUser getUser(String username) {
        for (SystemUser su : allUsers) {
            if (su.getUsername().equals(username)) {
                return su;
            }
        }
        return null;
    }

    /**
     * Returns a Team by its team name
     * @param teamName
     * @return The team with the given team name, if exists in the system.
     */
    public Team getTeam(String teamName) {
        for (Team team : allTeams) {
            if (team.getTeamName().toLowerCase().equals(teamName.toLowerCase())) {
                return team;
            }
        }
        return null;
    }

    /**
     * Returns a Stadium by its stadium name
     * @param stadiumName
     * @return The Stadium with the given stadium name, if exists in the system.
     */
    public Stadium getStadium(String stadiumName) {
        for (Stadium std: allStadiums) {
            if (std.getName().equals(stadiumName)) {
                return std;
            }
        }
        return null;
    }

    /**
     * Checks if a team with a name that matches the given name already exists.
     * @param name - String - name
     * @return - boolean - True if a team with a name that matches the given name already exists, else false
     */
    public boolean doesTeamExists(String name){
        for (Team team : allTeams) {
            if (team.getTeamName().toLowerCase().equals(name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a league with a name that matches the given name already exists.
     * @param name - String - name
     * @return - boolean - True if a league with a name that matches the given name already exists, else false
     */
    public boolean doesLeagueExists(String name){
        for (League league : allLeagues) {
            if (league.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a given SystemUser to the user's list of the system.
     * @param systemUser User to add
     * @return true if successfully added the SystemUser to the system.
     */
    public boolean addUser(SystemUser systemUser) {
        if (!(this.allUsers.contains(systemUser))) {
            this.allUsers.add(systemUser);
            return true;
        }
        return false;
    }

    /**
     * Removes a SystemUser by a given reference to the SystemUser to remove.
     * @param systemUser - SystemUser - the SystemUser to remove.
     * @return - boolean - true if the SystemUser removed successfully, else false
     */
    public boolean removeUserByReference(SystemUser systemUser) {
        return this.allUsers.remove(systemUser);
    }

    /**
     * Removes a SystemUser by a given username
     * @param username - String - a name of the user to be removed
     * @return - boolean - true if the SystemUser removed successfully, else false
     */
    public boolean removeUserByName(String username) {
        for (SystemUser su : allUsers) {
            if (su.getUsername().equals(username)) {
                this.allUsers.remove(su);
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a given Team to the team's list of the system.
     * @param team Team to add
     * @return true if successfully added the Team to the system.
     */
    public boolean addTeam(Team team) {
        if (!(this.allTeams.contains(team))) {
            this.allTeams.add(team);
            return true;
        }
        return false;
    }

    /**
     * Adds a given Stadium to the stadium's list of the system.
     * @param stadium Stadium to add
     * @return true if successfully added the Stadium to the system.
     */
    public boolean addStadium(Stadium stadium) {
        if (!(this.allStadiums.contains(stadium))) {
            this.allStadiums.add(stadium);
            return true;
        }
        return false;
    }

    /**
     * Checks if a given Stadium exists in the system.
     * @param stadium
     * @return true if the given Stadium exists in the system.
     */
    public boolean isStadiumExists(Stadium stadium){
        return allStadiums.contains(stadium);
    }

    /**
     * Removes a Team by a given reference to the Team to remove.
     * @param team - Team - the Team to remove.
     * @return - boolean - true if the Team removed successfully, else false
     */
    public boolean removeTeamByReference(Team team) {
        return this.allTeams.remove(team);
    }

    /**
     * Removes a league by a given name
     * @param leagueName - String - a name of the league to be removed
     * @return - boolean - true if the league removed successfully, else false
     */
    public boolean removeLeagueByName(String leagueName) {
        League leagueToRemove = null;
        for (League league : allLeagues) {
            if (league.getName().equals(leagueName)) {
                leagueToRemove = league;
            }
        }
        if (leagueToRemove == null) {
            return false;
        }
        return this.allLeagues.remove(leagueToRemove);
    }

    /**
     * Adds a new league. Responsible only for creating and adding a new league, doesn't do any farther checks.
     * @param leagueName - String - A unique leagueName
     */
    public void addLeague(String leagueName) {
        League league = new League(leagueName);
        allLeagues.add(league);
    }

    /**
     * Adds a new team. Responsible only for creating and adding a new team, doesn't do any farther checks.
     * @param teamName - String - A unique leagueName
     */
    public void addTeam(String teamName, TeamOwner to) {
        Team team = new Team(teamName, to);
        allTeams.add(team);
    }

    public void clearAll() {
        allStadiums = new ArrayList<>();
        allLeagues = new HashSet<>();
        allUsers = new ArrayList<>();
        allTeams = new ArrayList<>();
    }

    /**
     * Removes a Stadium by a given reference to the Stadium to remove.
     * @param st - Stadium - the Stadium to remove.
     * @return - boolean - true if the Stadium removed successfully, else false
     */
    public boolean removeStadiumByReference(Stadium st) {
        return allStadiums.remove(st);
    }

    /**
     * Returns a list of all the system users that are referees.
     * @return - List<SystemUser> - A list of all the system users that are referees
     */
    public List<SystemUser> getReferees() {
        List<SystemUser> referees = new ArrayList<>();
        for (SystemUser user : this.allUsers) {
            if (user.isType(RoleTypes.REFEREE)) {
                referees.add(user);
            }
        }
        return referees;
    }
}
