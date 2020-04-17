package Domain.Controllers;

import Domain.EntityManager;
import Domain.Game.Asset;
import Domain.Game.Season;
import Domain.Game.Stadium;
import Domain.Game.Team;
import Domain.Game.TeamAsset;
import Domain.Users.*;
import Domain.Exceptions.*;
import Service.UIController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TeamController {


    public static boolean addTeamOwner(String username, Team teamToOwn, TeamOwner owner)
            throws Exception {

        List<TeamOwner> teamOwners = teamToOwn.getTeamOwners();

        SystemUser newTeamOwnerUser = EntityManager.getInstance().getUser(username);

        if (newTeamOwnerUser == null) {
            throw new UserNotFoundException("Could not find a user by the given username" + username);
        }

        Role newTeamOwnerRole = newTeamOwnerUser.getRole(RoleTypes.TEAM_OWNER);
        TeamOwner teamOwner;
        if (newTeamOwnerRole == null) {
            teamOwner = new TeamOwner(newTeamOwnerUser);
        } else {

            teamOwner = (TeamOwner) newTeamOwnerRole;

            if (isAlreadyOwnedAnotherTeamInLeague(teamToOwn, teamOwner)) {
                throw new Exception("This User is already a team owner of a different team in same league");
            }
            if (teamOwners.contains(teamOwner)) {
                throw new alreadyTeamOwnerException("This User is already a team owner");
            }
        }
        teamOwner.addTeamToOwn(teamToOwn);
        teamToOwn.addTeamOwner(owner, teamOwner);


        return true;
    }

    /**
     * Add a player with playerUsername to the teamToAddPlayer by the teamOwner
     *
     * @param playerUsername  is the Username of the player to add
     * @param teamToAddPlayer is the Team to add the player to
     * @param teamOwner       is the Owner who asks to add the player
     * Adds asset with assetName and assetType to the teamToAddAsset by the teamOwner
     * asset can be one of the following:
     * <p>{@link Player}</p>
     * <p>{@link Coach}</p>
     * <p>{@link TeamManager}</p>
     * <p>{@link Stadium}</p>
     * @param assetName is the Name or Username of the asset to add
     * @param teamToAddAsset is the Team to add the asset to
     * @param teamOwner is the Owner who asks to add the asset
     * @param assetType is the type of the asset to add {@link TeamAsset}
     * @return true if the player was added successfully
     * @throws NoTeamExistsException
     * @throws NotATeamOwner
     * @throws NoSuchTeamAssetException
     * @throws UserNotFoundException
     * @throws PlayerIsAlreadyInThisTeamException
     */
    public static boolean addPlayer(String playerUsername, Team teamToAddPlayer, TeamOwner teamOwner) throws Exception {
        SystemUser playerUser = EntityManager.getInstance().getUser(playerUsername);
        if (playerUser == null) {
            throw new UserNotFoundException("Could not find a user by the given username" + playerUsername);
        }

        Role getRoleForPlayer = playerUser.getRole(RoleTypes.PLAYER);
        Player playerRole;
        if (getRoleForPlayer == null) {
            int fieldJobIndex = getEnumByRoleType("FiledJob for player", RoleTypes.PLAYER);
            PlayerFieldJobs filedJob = PlayerFieldJobs.values()[fieldJobIndex];
            Date bday = getPlayerBirthDate();
            playerRole = new Player(playerUser, filedJob, bday);
        } else {
            playerRole = (Player) getRoleForPlayer;
            if (teamToAddPlayer.getTeamPlayers().contains(playerRole)) {
                throw new PlayerIsAlreadyInThisTeamException("Player is already part of this team");
            }
        }

        return teamToAddPlayer.addTeamPlayer(teamOwner, playerRole);
    }

    /**
     * Get the player date of birth from the user
     *
     * @return the birth date of the player as java.util.Date
     * @throws StadiumNotFoundException
     */
    public static boolean addAssetToTeam(String assetName, Team teamToAddAsset, TeamOwner teamOwner, TeamAsset assetType)
            throws NoTeamExistsException,NotATeamOwner,NoSuchTeamAssetException,UserNotFoundException
            ,StadiumNotFoundException
    {
        if(teamToAddAsset == null)
        {
            throw new NoTeamExistsException("No Team was given");
        }
        if(assetType == null)
        {
            throw  new NoSuchTeamAssetException("No Asset Type was given");
        }
        if(!teamToAddAsset.isTeamOwner(teamOwner))
        {
            throw new NotATeamOwner("Not One of the Team Owners");
    private static Date getPlayerBirthDate() {
        UIController.printMessage("Please insert Player Birth Date in format dd/MM/yyyy");
        String bDate;
        do {
            bDate = UIController.receiveString();
        } while (!bDate.matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$"));

        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(bDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * Gets the player field job chosen by the user from the list of filed jobs
     *
     * @return the field job chosen for the suer
     * @see PlayerFieldJobs
     */
    private static int getEnumByRoleType(String msg, RoleTypes rt) {
        UIController.printMessage("Please Choose" + msg);
        List<Object> values = new ArrayList<>();
        if (rt == RoleTypes.PLAYER) {

            for (int i = 0; i < PlayerFieldJobs.values().length; i++) {
                values.add(PlayerFieldJobs.values()[i]);
            }

        } else if (rt == RoleTypes.COACH) {
            for (int i = 0; i < CoachQualification.values().length; i++) {
                values.add(CoachQualification.values()[i]);
            }
        } else {
            return -1;
        }

        return teamToAddAsset.addAsset(assetName,teamOwner,assetType);
    }
        for (int i = 0; i < values.size(); i++) {
            UIController.printMessage(i + ". " + values.get(i));
        }

        int index;

        do {
            index = UIController.receiveInt();
        } while (!(index >= 0 && index < PlayerFieldJobs.values().length));

        return index;
    }

    public static boolean addCoach(String coachUsername, Team teamToAddCoach, TeamOwner teamOwner) throws Exception {
        SystemUser coachUser = EntityManager.getInstance().getUser(coachUsername);
        if (coachUser == null) {
            throw new UserNotFoundException("Could not find a user by the given username" + coachUsername);
        }

        Role getRoleForUser = coachUser.getRole(RoleTypes.COACH);
        Coach coachRole;
        if (getRoleForUser == null) {
            int index = getEnumByRoleType("qualification for coach", RoleTypes.COACH);
            CoachQualification qlf = CoachQualification.values()[index];

            UIController.printMessage("what is the Coach JobTitle?");
            String jobTitle = UIController.receiveString();

            coachRole = new Coach(coachUser, qlf, teamToAddCoach, jobTitle);

        } else {
            coachRole = (Coach) getRoleForUser;
            if (teamToAddCoach.getTeamCoaches().contains(coachRole)) {
                throw new CoachIsAlreadyInThisTeamException("Coach is already in this team");
            }
        }

        return teamToAddCoach.addTeamCoach(teamOwner, coachRole);
    }

    public static boolean addTeamManager(String managerUsername, Team teamToAddManager, TeamOwner teamOwner) throws Exception {
        SystemUser managerUser = EntityManager.getInstance().getUser(managerUsername);
        if (managerUser == null) {
            throw new UserNotFoundException("Could not find a user by the given username" + managerUsername);
        }

        Role getRoleForUser = managerUser.getRole(RoleTypes.COACH);
        TeamManager managerRole;
        if (getRoleForUser == null) {


            managerRole = new TeamManager(managerUser);
        }
        return false;
    }

    public static boolean addStadium(String stadiumName, Team teamToAddStadium, TeamOwner teamOwner) throws Exception {
        return false;
    }


    public static boolean editAssets(Team chosenTeam) throws Exception {
        List<Asset> allAssetsTeam = chosenTeam.getAllAssets();
        if (allAssetsTeam.size() == 0) {

            throw new AssetsNotExistsException("There is not assets to team");

        }
        int assetIndex = TeamController.chooseAssetToModify(allAssetsTeam);
        List<String> properties = allAssetsTeam.get(assetIndex).getProperties();
        if (properties.size() == 0) {

            throw new AssetCantBeModifiedException("Nothing can be modify in this asset");

        }
        int propertyIndexToModify = choosePropertiesToModify(properties);
        if (allAssetsTeam.get(assetIndex).isListProperty(properties.get(propertyIndexToModify))) {
            int action = actionToDo();
            //FIXME!!
            if (action == 0) {
                boolean isAdded = addProperty(allAssetsTeam.get(assetIndex), properties.get(propertyIndexToModify));
                if (!isAdded) {

                    throw new AssetCantBeModifiedException("Can not modify asset");

                }
            } else {
                boolean isRemoved = removeProperty(allAssetsTeam.get(assetIndex), properties.get(propertyIndexToModify));
                if (!isRemoved) {

                    throw new AssetCantBeModifiedException("Can not modify asset");

                }
            }
        } else if (allAssetsTeam.get(assetIndex).isEnumProperty(properties.get(propertyIndexToModify))) {
            List<Enum> allEnumValues = allAssetsTeam.get(assetIndex).getAllValues(properties.get(propertyIndexToModify));
            int propertyNewValueIndex = changePropertyValue(allEnumValues);
            return allAssetsTeam.get(assetIndex).changeProperty(properties.get(propertyIndexToModify), allEnumValues.get(propertyNewValueIndex).toString());
        } else if (allAssetsTeam.get(assetIndex).isStringProperty(properties.get(propertyIndexToModify))) {
            UIController.printMessage("Enter new value: ");
            String newValue = UIController.receiveString();
            //todo: check string?
            return allAssetsTeam.get(assetIndex).changeProperty(properties.get(propertyIndexToModify), newValue);
        }
        return true;
    }

    //Fixme! need to see how to handel with list of property!  - in teamManger permissions
    private static boolean addProperty(Asset asset, String s) {
        return false;
    }

    private static boolean removeProperty(Asset asset, String s) {


        return false;
    }

    /**
     * User choose which asset he wants to modify
     *
     * @param allAssetsTeam - List<Asset>
     * @return assetIndex -int-
     */
    private static int chooseAssetToModify(List<Asset> allAssetsTeam) {

        UIController.printMessage("Choose Asset to modify: ");
        for (int i = 0; i < allAssetsTeam.size(); i++) {
            UIController.printMessage(i + 1 + ". " + allAssetsTeam.get(i));
        }
        int assetIndex;
        do {
            assetIndex = UIController.receiveInt();
        } while (!(assetIndex >= 1 && assetIndex <= allAssetsTeam.size()));
        return assetIndex-1;


    }


    /**
     * In case the user wants to modify EnumProperty - choose which new property he wants to change.
     *
     * @param allEnumValues
     * @return propertyNewValueIndex -int-
     */
    private static int changePropertyValue(List<Enum> allEnumValues) {
        UIController.printMessage("Choose Property new value ");
        for (int i = 0; i < allEnumValues.size(); i++) {
            UIController.printMessage(i + 1 + ". " + allEnumValues.get(i).toString());

        }
        int propertyNewValueIndex;
        do {
            propertyNewValueIndex = UIController.receiveInt()-1;
        } while (!(propertyNewValueIndex >= 0 && propertyNewValueIndex < allEnumValues.size()));
        return propertyNewValueIndex;
    }

    /**
     * @param properties - list of all properties
     * @return propertyIndex -int- the user wants to modify
     */
    private static int choosePropertiesToModify(List<String> properties) {
        UIController.printMessage("Choose Property Number to modify");
        for (int i = 0; i < properties.size(); i++) {
            UIController.printMessage(i+1 + ". " + properties.get(i));
        }
        int propertyIndex;
        do {
            propertyIndex = UIController.receiveInt()-1;
        } while (!(propertyIndex >= 0 && propertyIndex < properties.size()));

        return propertyIndex;
    }

    /**
     * In case the property ia a list - let the user to choose if he want to Add or Delete value to the list
     *
     * @return 0 - if to add value , 1 - if to remove value
     */
    private static int actionToDo() {
        UIController.printMessage("Choose which action: ");
        UIController.printMessage("1. Add");
        UIController.printMessage("2. Remove");
        int propertyIndex;
        do {
            propertyIndex = UIController.receiveInt() - 1;
        } while (!(propertyIndex >= 0 && propertyIndex <= 1));

        return propertyIndex;
    }


    /**
     * Check if the new team owner already owned a team in the same league the team he should be owned exist
     *
     * @param teamToOwn    the team he should be owned to
     * @param ownerToCheck the new team owner
     * @return true if the new team owner already owned a team in the same league
     */
    private static boolean isAlreadyOwnedAnotherTeamInLeague(Team teamToOwn, TeamOwner ownerToCheck) {

        Season currentSeason = teamToOwn.getCurrentSeason();
        List<Team> teamsInSeason = currentSeason.getTeams();

        for (Team team : teamsInSeason) {
            List<TeamOwner> teamOwners = team.getTeamOwners();

            if (teamOwners.contains(ownerToCheck)) {
                return true;
            }
        }
        return false;
    }

}
