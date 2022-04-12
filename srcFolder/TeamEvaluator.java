import java.util.List;
import java.util.Map;

public abstract class TeamEvaluator {
    private IDBTeamData data;
    TeamEvaluator(IDBTeamData tdata){
        data=tdata;
    }

    public abstract List<Map<IPlayer, Integer>> EvaluationAlgorithm(IDBTeamData data);
}
