import java.util.LinkedList;
import java.util.List;

public class RamDB extends DBobserverAbstract {
    private List<IPlayer> lPlayers;
    private List<ICoach> lCoaches;
    private List<IGame> lGame;
    RamDB(ITeam newT){
        super(newT);
        lPlayers=new LinkedList<>();
        lCoaches=new LinkedList<>();
        lGame=new LinkedList<>();
    }
    public void printPlayers(){
        lPlayers.forEach((IPlayer p)->{
            System.out.println(p.getName() + " -- From RamDB --");
        });
    }

    protected void  writePlayerToFile(IPlayer p){
        lPlayers.add(p);
    }
    protected void  writeCoachToFile(ICoach c){
        lCoaches.add(c);
    }
    protected void  writeGameToFile(IGame g){
        lGame.add(g);
    }
}
