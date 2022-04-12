import java.util.List;

public interface ITeamSchedule {
    List<IGame> getGames();
    List<String> getGameLocations();
    public void addGame(IGame g);
}
