package Domain;

import DB.DBManager;
import DB.Table;
import Domain.Game.Stadium;
import Domain.Users.Role;
import Domain.Users.RoleTypes;
import Domain.Users.SystemUser;

import java.util.ArrayList;
import java.util.List;

public class EntityManager {
    private static EntityManager entityManagerInstance = null;

    List<SystemUser> allUsers;
    List<Stadium> allStadiums;

    private EntityManager() {
        allUsers = new ArrayList<>();
    }

    /**
     * Returns an instance of dbManager. part of the Singleton design
     *
     * @return - DBManager - an instance of dbManager
     */
    public static EntityManager getInstance() {
        if (entityManagerInstance == null)
            entityManagerInstance = new EntityManager();
        return entityManagerInstance;
    }


    public SystemUser login(String usrNm, String pswrd) throws Exception {
        for (SystemUser su : allUsers) {
            if (su.getUsername().equalsIgnoreCase(usrNm)) {
                List<String> userDetails = DBManager.getInstance().getSystemUsers().getRecord(new String[]{"username"}, new String[]{usrNm});
                if (userDetails.get(2).equals(pswrd)) {
                    return su;
                }

            }
        }
        throw new Exception("Username or Password was incorrect!!!!!");

    }

    private void initSystem() throws Exception {
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

    public SystemUser getUser(String username) {
        for (SystemUser su : allUsers) {
            if (su.getUsername().equals(username)) {
                return su;
            }
        }
        return null;
    }
    public Stadium getStadium(String stadiumName) {
        for (Stadium std: allStadiums) {
            if (std.getStadName().equals(stadiumName)) {
                return std;
            }
        }
        return null;
    }

    public boolean addUser(SystemUser systemUser) {
        if (!(this.allUsers.contains(systemUser))) {
            this.allUsers.add(systemUser);
        }
        return true;
    }

    public boolean addStadium(Stadium newStadium)
    {
        if(!this.allStadiums.contains(newStadium))
        {
            this.allStadiums.add(newStadium);
        }
        return true;
    }
}
