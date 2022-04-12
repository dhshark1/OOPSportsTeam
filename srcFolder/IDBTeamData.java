import java.util.List;
import java.util.Map;

public interface IDBTeamData {
    /*
    Purpose: Enable convenient access to the DB.
     */
    List<Map<IPlayer, Integer>> getPlayersGoals();
    List<Map<IPlayer, Integer>> getPlayersAssists();
    List<String> getHistory();
    List<Map<IPlayer, Integer>> getAppearances();
    List<IPlayer> getPlayers();
}
