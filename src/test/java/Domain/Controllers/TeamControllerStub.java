package Domain.Controllers;

import Domain.Game.Team;
import Domain.Users.TeamOwner;

public class TeamControllerStub extends TeamController{

    private static int selector;


    public void setSelector(int selector) {
        TeamControllerStub.selector = selector;
    }



    public boolean addTeamOwner(String username, Team teamToOwn, TeamOwner owner)
            throws Exception{
        if(selector == 0)
        {
            return true;
        }

        throw new Exception("Fuck you all!");


    }

}
