package Service;

import Domain.EntityManager;
import Domain.Exceptions.RoleExistsAlreadyException;
import Domain.Game.League;
import Domain.Game.Season;
import Domain.Users.AssociationRepresentative;
import Domain.Users.Referee;
import Domain.Users.RoleTypes;
import Domain.Users.SystemUser;

import java.util.List;

import static Service.UIController.*;

/**
 * Association Representative services controller
 */
public class ARController {

    /**
     * Controls the flow of Creating a new League.
     *
     * @param systemUser - SystemUser - the user who initiated the procedure, needs to be an association representative
     * @return - boolean - True if a new league was created successfully, else false
     */
    public static boolean addLeague(SystemUser systemUser) {
        if (!systemUser.isType(RoleTypes.ASSOCIATION_REPRESENTATIVE)) {
            return false;
        }
        AssociationRepresentative ARRole = (AssociationRepresentative) systemUser.getRole(RoleTypes.ASSOCIATION_REPRESENTATIVE);

        UIController.printMessage("Enter new league name:");
        String leagueName = UIController.receiveString();

        //delegate the operation responsibility to AssociationRepresentative
        try {
            ARRole.addLeague(leagueName);
        } catch (Exception e) {
            UIController.printMessage(e.getMessage());
            return false;
        }
        UIController.printMessage("The league was created successfully");
        return true;
    }

    /**
     * Controls the flow of Adding a new Season to a chosen league.
     *
     * @param systemUser - SystemUser - the user who initiated the procedure, needs to be an association representative
     * @return - True if a new season was created and added to a league successfully, else false
     */
    public static boolean addSeasonToLeague(SystemUser systemUser) {
        if (!systemUser.isType(RoleTypes.ASSOCIATION_REPRESENTATIVE)) {
            return false;
        }

        League chosenLeague = null;
        try {
            chosenLeague = getLeagueByChoice();
        } catch (Exception e) {
            UIController.printMessage(e.getMessage() + "\nPlease add a league before adding a season");
            return false;
        }

        String seasonYears = "";
        boolean seasonExists = true;

        while (seasonExists) {
            UIController.printMessage("Enter season years (yyyy/yy) ex. 2020/21:");
            seasonYears = UIController.receiveString();

            if (!Season.isGoodYearsFormat(seasonYears)) {
                do {
                    UIController.printMessage("wrong years format, please enter the season years (yyyy/yy) ex. 2020/21:");
                    seasonYears = UIController.receiveString();
                } while (!Season.isGoodYearsFormat(seasonYears));
            }

            if (!chosenLeague.doesSeasonExists(seasonYears)) {
                seasonExists = false;
            } else {
                UIController.printMessage("This season already exists in the chosen league. Please enter different years");
            }
        }

        chosenLeague.addSeason(seasonYears);
        UIController.printMessage("The season was created successfully");
        return true;
//        }
//        UIController.printMessage("The season creation failed");
//        return false;
    }

    private static League getLeagueByChoice() throws Exception {
        List<League> leagues = EntityManager.getInstance().getLeagues();
        if (leagues == null || leagues.isEmpty()) {
            throw new Exception("There are no leagues");
        }
        UIController.printMessage("Choose a League Number");
        for (int i = 0; i < leagues.size(); i++) {
            UIController.printMessage(i + ". " + leagues.get(i).getName());
        }
        int Index;
        do {
            Index = UIController.receiveInt();
        } while (!(Index >= 0 && Index < leagues.size()));

        return leagues.get(Index);
    }

    /**
     * Controls the flow of Adding a new Referee role to an existing user.
     *
     * @param systemUser - SystemUser - the user who initiated the procedure, needs to be an association representative
     * @return - boolean - True if a new referee was added successfully, else false
     */
    public static boolean addReferee(SystemUser systemUser) {
        if (!systemUser.isType(RoleTypes.ASSOCIATION_REPRESENTATIVE)) {
            return false;
        }
        AssociationRepresentative ARRole = (AssociationRepresentative) systemUser.getRole(RoleTypes.ASSOCIATION_REPRESENTATIVE);

        //receive the future referee username from ar
        String newRefereeUsername = getUsernameFromUser("referee");
        SystemUser refereeUser = null;
        do {
            refereeUser = EntityManager.getInstance().getUser(newRefereeUsername);
            if (refereeUser == null) {
                UIController.printMessage("Could not find a user by the given username\nPlease try again");
                newRefereeUsername = getUsernameFromUser("referee");
            }
        } while (refereeUser == null);
        //A user has been identified.

        UIController.printMessage("Enter the new referee's training:");
        String training = UIController.receiveString();

        boolean succeeded = false;
        try {
            succeeded = ARRole.addReferee(refereeUser, training);
        } catch (RoleExistsAlreadyException e) {
            UIController.printMessage("The user chosen is already a referee");
            return false;
        }

        if (succeeded) {
            //TODO: Send notification to newRefereeUUser
            UIController.printMessage("The referee has been added successfully");
        }
        return true;
    }
    
}