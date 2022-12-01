import model.Cricketer;
import model.CricketerType;
import model.Match;
import model.Team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cricket {

    public static void main(String[] args)
    {
        //List<Cricketer> cricketerList = new ArrayList<>();

        Cricketer cricketer1 = new Cricketer("1", "Dhoni", CricketerType.WICKETKEEPER);
        cricketer1.setCaptain(true);

        Cricketer cricketer2 = new Cricketer("2", "Sachin", CricketerType.BATSMAN);
        cricketer2.setCaptain(false);

        Cricketer cricketer3 = new Cricketer("3", "Kohli", CricketerType.BATSMAN);
        Cricketer cricketer4 = new Cricketer("4", "Dravid", CricketerType.BOWLER);
        Cricketer cricketer5 = new Cricketer("5", "Gambhir", CricketerType.BOWLER);

        List<Cricketer> cricketerList1 = new ArrayList<>(Arrays.asList(cricketer1, cricketer2, cricketer3, cricketer4, cricketer5));

        Team team1 = new Team("1", "India", cricketerList1);

        Cricketer cricketer6 = new Cricketer("6", "A", CricketerType.WICKETKEEPER);
        cricketer6.setCaptain(true);

        Cricketer cricketer7 = new Cricketer("7", "B", CricketerType.BATSMAN);
        cricketer7.setCaptain(false);

        Cricketer cricketer8 = new Cricketer("8", "C", CricketerType.BATSMAN);
        Cricketer cricketer9 = new Cricketer("9", "D", CricketerType.BOWLER);
        Cricketer cricketer10 = new Cricketer("10", "E", CricketerType.BOWLER);

        List<Cricketer> cricketerList2 = new ArrayList<>(Arrays.asList(cricketer6, cricketer7, cricketer8, cricketer9, cricketer10));
        Team team2 = new Team("2", "England", cricketerList2);

        CricketTournament tournament = new CricketTournament();

        tournament.addTeam(team1);
        tournament.addTeam(team2);

        Match match = new Match(team1, team2);

        tournament.addMatch(match);

        team1.changeViceCaptain(cricketer3);

        team1.getViceCaptain();
    }
}
