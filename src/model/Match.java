package model;

public class Match {

    Team team1;
    Team team2;

    Stats stats;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.stats = new Stats();
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
