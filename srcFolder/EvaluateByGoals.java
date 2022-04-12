import java.util.List;
import java.util.Map;

public class EvaluateByGoals extends TeamEvaluator {
    EvaluateByGoals(IDBTeamData data){
        super(data);
    }
    @Override
    public List<Map<IPlayer, Integer>> EvaluationAlgorithm(IDBTeamData data) {
        List<Map<IPlayer, Integer>> playersAndGoals =  data.getPlayersGoals();
        //sort by goals in decreasing order and return the list of players in sorted fashion
        return playersAndGoals;
    }
}
