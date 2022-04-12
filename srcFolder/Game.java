public class Game implements IGame {
    private String gameName;
    private ITeam homeTeam, awayTeam;
    private String location;
    private String date;
    private String score;
    public Game(ITeam hT, ITeam aT, String lc, String da, String sc){
        homeTeam=hT;
        awayTeam=aT;
        location=lc;
        date=da;
        score=sc;
        gameName = homeTeam.getName() + "-" + awayTeam.getName() + date;
    }
    @Override
    public String getHomeTeam() {
        return homeTeam.getName();
    }

    @Override
    public String getAwayTeam() {
        return awayTeam.getName();
    }

    @Override
    public String getGameDate() {
        return date;
    }

    @Override
    public String getScore() {
        return score;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getGameName() {
        return gameName;
    }


}
