package model;

import java.util.List;

public class Team {

    String id;
    String name;

    List<Cricketer> cricketerList;

    int totalMatches;
    int matchesWon;

    public Team(String id, String name, List<Cricketer> cricketerList) {
        this.id = id;
        this.name = name;
        this.cricketerList = cricketerList;
        this.totalMatches = 0;
        this.matchesWon = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cricketer> getCricketerList() {
        return cricketerList;
    }

    public void setCricketerList(List<Cricketer> cricketerList) {
        this.cricketerList = cricketerList;
    }

    public int getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    public void changeViceCaptain(Cricketer newCaptain)
    {
        for(int i=0; i<cricketerList.size(); i++)
        {
            if(cricketerList.get(i).isViceCaptain())
            {
                if(cricketerList.get(i).equals(newCaptain))
                {
                    continue;
                }
                else {
                    cricketerList.get(i).setViceCaptain(false);
                }
            }
            if(cricketerList.get(i).equals(newCaptain))
            {
                cricketerList.get(i).setViceCaptain(true);
            }
        }
    }

    public void getViceCaptain()
    {
        for(int i=0; i<cricketerList.size(); i++)
        {
            if(cricketerList.get(i).isViceCaptain())
            {
                System.out.println("Vice captain " + cricketerList.get(i).getName());
            }
        }
    }
}
