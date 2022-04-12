import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Team extends Observable
{
    private List<ICoach> coach;
    private List<IPlayer> players;
    private ITeamSchedule schedule;
    private String teamName;
    private String sport;
    public Team(String name, String sp){
        coach=new LinkedList<ICoach>();
        players=new LinkedList<IPlayer>();
        schedule=null;
        teamName=name;
        sport = sp;
    }

    @Override
    public ITeam addCoach(ICoach c) {
        coach.add(c);
        notifyObservers("New Coach",c.getName());
        return this;
    }
    public ITeam addPlayer(IPlayer p){
        players.add(p);
        notifyObservers("New Player",p.getName());
        return this;
    }
    @Override
    public void addGame(IGame g){
        schedule.addGame(g);
        notifyObservers("New Game",g.getGameName());
    }

    @Override
    public String getName() {
        return teamName;
    }
    @Override
    public String getSport() {
        return sport;
    }
    @Override
    public List<ICoach> getCoaches() {
        return coach;
    }
    @Override
    public List<IPlayer> getPlayers() {
        return players;
    }
    public ITeamSchedule getTeamSchedule(){
        return schedule;
    }
    public void setTeamSchedule(ITeamSchedule s){
        schedule=s;
    }
    @Override
    public Iterator<ITeamMember> iterator() {
        return new TeamIterator();
    }


    private class TeamIterator implements Iterator<ITeamMember>{
        int pos_players, pos_coaches;
        //ITeamMember current;
        TeamIterator(){
            pos_players=0;
            pos_coaches=0;
            //current=teamMembers.get(0);
        }
        @Override
        public boolean hasNext() {
            if (pos_players>(players.size()-1) && pos_coaches > (coach.size()-1))
                return false;
            return true;
        }

        @Override
        public ITeamMember next() {
            if(pos_players<=players.size()-1){
                return players.get(pos_players++);
            }
            else if(pos_coaches<=coach.size()-1){
                return coach.get(pos_coaches++);
            }
            return null;
        }
    }
    @Override
    public void apply(IVisitorDrawer d){
        d.draw(this);
    }

}
