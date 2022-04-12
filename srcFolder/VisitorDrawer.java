import java.util.Iterator;

public abstract class VisitorDrawer implements IVisitorDrawer {
    @Override
    public void draw(ITeam t) {
        for (ITeamMember iTeamMember : t) {
            iTeamMember.apply(this);
        }
    }

//    @Override
//    public void draw(IPlayer p) {
//        System.out.println("I am a player and my name is "+p.getName());
//    }
//
//    @Override
//    public void draw(ICoach c) {
//        System.out.println("I am a coach and my name is "+c.getName());
//    }
}
