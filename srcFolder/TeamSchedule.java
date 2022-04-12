import java.util.List;

public class TeamSchedule implements ITeamSchedule {
    List<IGame> games;
    @Override
    public List<IGame> getGames() {
        return null;
    }

    @Override
    public List<String> getGameLocations() {
        return null;
    }
    @Override
    public void addGame(IGame g){
        games.add(g);
    }
}
