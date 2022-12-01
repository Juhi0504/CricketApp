import model.Cricketer;
import model.Match;
import model.Team;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class CricketTournament {

    List<Team> teams;
    HashMap<String, List<Match>> matchesByTeam;

    Date start;
    Date end;

    public CricketTournament()
    {
        teams = new ArrayList<>();
        matchesByTeam = new HashMap<>();
    }
    public void addTeam(Team team)
    {
        teams.add(team);
    }

    public void addMatch(Match match)
    {
        Team team1 = match.getTeam1();
        Team team2 = match.getTeam2();

        if(matchesByTeam.containsKey(team1.getId()))
        {
            matchesByTeam.get(team1.getId()).add(match);
        }
        else
        {
            List<Match> matchList= new ArrayList<>();
            matchList.add(match);
            matchesByTeam.put(team1.getId(), matchList);
        }

        if(matchesByTeam.containsKey(team2.getId()))
        {
            matchesByTeam.get(team2.getId()).add(match);
        }
        else
        {
            List<Match> matchList= new ArrayList<>();
            matchList.add(match);
            matchesByTeam.put(team2.getId(), matchList);
        }
    }
}
