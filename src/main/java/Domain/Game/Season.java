package Domain.Game;

import Domain.Users.Referee;
import Domain.Users.SystemUser;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Season {

    private League league;
    private String years; //name
    private List<Team> teams;
    private List<Referee> referees;
    private boolean isUnderway; //whether the season has started
    private GamePolicy gamePolicy; //todo: initialize with default
    private PointsPolicy pointsPolicy; //todo: initialize with default

    /**
     * Constructor
     *
     * @param league - League - the league that the season belongs to
     * @param years  - String - the season's years in the format of "yyyy/yy"
     */
    public Season(League league, String years) {
        this.league = league;
        this.teams = new ArrayList<>();
        this.years = years;
        this.referees = new ArrayList<>();
        this.isUnderway = false;
    }

    /**
     * Getter for the main year of the season - the later year.
     *
     * @return - Year - the later year of the season
     */
    public Year getYear() {
        int[] yearsInt = splitYearsInt(years);
        return Year.parse("" + yearsInt[0] + yearsInt[2]);
    }

    /**
     * Getter for the years field.
     *
     * @return - String - the season's years in the format of "yyyy/yy"
     */
    public String getYears() {
        return years;
    }

    /**
     * Getter for the referees
     *
     * @return - List<Referee>
     */
    public List<Referee> getReferees() {
        return new ArrayList<>(referees);
    }

    public boolean addTeam(Team team) {
        if (!teams.contains(team)) {
            teams.add(team);
            return true;
        }
        return false;
    }

    public boolean removeTeam(Team team) {
        if (!teams.contains(team)) {
            return false;
        }
        return teams.remove(team);
    }

    public List<Team> getTeams() {
        return teams;
    }

    /**
     * Returns the number of referees assigned to this season
     * @return - int - the number of referees assigned to this season
     */
    public int refereesSize(){
        return this.referees.size();
    }

    /**
     * Verifies that a given string is a correct season format.
     * yyyy/yy where the first year is one year prior to the second.
     * ex.: 2020/21 represents the season of 2020-2021.
     *
     * @param years - String - the season's years in the format of "yyyy/yy"
     * @return - boolean - true if the given string is in the correct format, else false
     */
    public static boolean isGoodYearsFormat(String years) {
        if (years.matches("^\\d\\d\\d\\d\\/\\d\\d")) {
            int[] yearsInt = splitYearsInt(years);
            if (yearsInt[1] == yearsInt[2] - 1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Receives years in the format of "yyyy/yy" and splits it into an array of Strings.
     *
     * @param years String - In the format of "yyyy/yy"
     * @return - String[] - century(2-digits), firstYear(2-digits), secondYear(2-digits)
     */
    private static String[] splitYearsString(String years) {
        String century = years.substring(0, 2);
        String firstYear = years.substring(2, 4);
        String secondYear = years.substring(5);
        return new String[]{century, firstYear, secondYear};
    }

    /**
     * Receives years in the format of "yyyy/yy" and splits it into an array of int.
     *
     * @param years String - In the format of "yyyy/yy"
     * @return - int[] - century(2-digits), firstYear(2-digits), secondYear(2-digits)
     */
    private static int[] splitYearsInt(String years) {
        String[] splitYearsSt = splitYearsString(years);
        int centuryInt = Integer.parseInt(splitYearsSt[0]);
        int firstYearInt = Integer.parseInt(splitYearsSt[1]);
        int secondYearInt = Integer.parseInt(splitYearsSt[2]);
        return new int[]{centuryInt, firstYearInt, secondYearInt};
    }


    private boolean checkTeamsEquals(List<Team> teams1, List<Team> teams2) {
        for (Team team : teams1) {
            if (!teams2.contains(team)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if a given referee role is assigned to this season
     *
     * @param refereeRole - Referee - the referee to verify if he is assigned to this season
     * @return - boolean - true if th referee is assigned to this season.
     */
    public boolean doesContainsReferee(Referee refereeRole) {
        if (refereeRole != null) {
            if (this.referees.contains(refereeRole)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Assigns a referee to this season
     *
     * @param refereeRole - Referee - the referee to be assigned to the season
     */
    public void assignReferee(Referee refereeRole) {
        if (refereeRole != null) {
            this.referees.add(refereeRole);
        }
    }

    /**
     * Un-assigns a referee from this season
     *
     * @param referee - Referee - a referee role to be removed
     */
    public void unAssignReferee(Referee referee) {
        if (referee != null) {
            this.referees.remove(referee);
        }
    }

    /**
     * Officially start the season. Should be called after the game schedule is built.
     */
    public void startSeason(){
        this.isUnderway = true;
    }

    public boolean getIsUnderway() {
        return isUnderway;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Season)) return false;
        Season that = (Season) o;
        return this.getYears().equals(that.getYears()) && this.league.equals(that.league);
    }
}
