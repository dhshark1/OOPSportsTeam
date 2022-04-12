import java.applet.AudioClip;

public abstract class DBobserverAbstract implements IDBobserver {
    protected ITeam t;
    DBobserverAbstract(ITeam newT){
        t=newT;
    }

    @Override
    public void addPlayerToTeam(String playerName) {
        t.getPlayers().forEach((IPlayer p) ->
        {if (p.getName().equals(playerName)) writePlayerToFile(p);
        });
    }

    @Override
    public void addCoachToTeam(String coachName) {
        t.getCoaches().forEach((ICoach c) ->
        {if (c.getName().equals(coachName)) writeCoachToFile(c);
        });
    }

    @Override
    public void addGame(String gameName) {
        t.getTeamSchedule().getGames().forEach((IGame g) -> {
            if(g.getGameName().equals(gameName)) writeGameToFile(g);
        });
    }

    protected abstract void  writePlayerToFile(IPlayer p);
    protected abstract void  writeCoachToFile(ICoach c);
    protected abstract void  writeGameToFile(IGame g);


    @Override
    public void update(String event, String arg){
        if (event.equals("New Player"))
            addPlayerToTeam(arg);
        else if (event.equals("New Coach"))
            addCoachToTeam(arg);
        else if (event.equals("New Game"))
            addGame(arg);
    }
}
