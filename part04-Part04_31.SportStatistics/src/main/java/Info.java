public class Info {
    private String firstTeam;
    private String secondTeam;
    private int firstTeamScore;
    private int secondTeamScore;
    private int wins;
    private int losses;
    private int games;

    public Info(String firstTeam, String secondTeam, int firstTeamScore, int secondTeamScore) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.firstTeamScore = firstTeamScore;
        this.secondTeamScore = secondTeamScore;
    }

    public String getFirstTeam() {
        return firstTeam;
    }
    
    public String getSecondTeam() {
        return secondTeam;
    }

    public int getFirstTeamScore() {
        return firstTeamScore;
    }

    public int getSecondTeamScore() {
        return secondTeamScore;
    }

    public int setGames() {
        return games += 1;
    }

    public int setLosses() {
        return losses += 1;
    }

    public int setWins() {
        return wins += 1;
    }

}


