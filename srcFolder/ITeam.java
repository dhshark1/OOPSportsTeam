import java.util.List;

public interface ITeam extends Iterable<ITeamMember>, IObservable{
    void addGame(IGame g);
    String getName();
    String getSport();
    List<ICoach> getCoaches();
    List<IPlayer> getPlayers();
    ITeamSchedule getTeamSchedule();
    void setTeamSchedule(ITeamSchedule s);
    void apply(IVisitorDrawer d);
    ITeam addPlayer(IPlayer p);
    ITeam addCoach(ICoach c);

}
