import java.util.List;
import java.util.Map;

public class EvaluateByPlayers extends TeamEvaluator {
    EvaluateByPlayers(IDBTeamData data){
        super(data);
    }
    @Override
    public List<Map<IPlayer, Integer>> EvaluationAlgorithm(IDBTeamData data) {
        List<Map<IPlayer, Integer>> playersAndGoals =  data.getPlayersGoals();
        List<Map<IPlayer, Integer>> playersAndAssists =  data.getPlayersAssists();
        List<Map<IPlayer, Integer>> playersAppearances =  data.getAppearances();
        //combine the two lists by adding the goals and the assists for each player
        //sort the list by decreasing order and divide the sum of goal and assists by the number of appearances
        //return the sorted list with each player and its ratio
        return playersAndGoals;
    }
}
