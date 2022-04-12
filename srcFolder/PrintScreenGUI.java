public class PrintScreenGUI extends VisitorDrawer {
    @Override
    public void draw(IPlayer p) {
        System.out.println("I am a player and my name is "+p.getName());
    }

    @Override
    public void draw(ICoach c) {
        System.out.println("I am a coach and my name is "+c.getName());
    }

}
