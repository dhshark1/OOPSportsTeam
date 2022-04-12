public class Player implements IPlayer {
    String position;
    String name;
    int salary;
    String sport;
    public Player(String p, String n, int s, String sp){
        position = p;
        name = n;
        salary = s;
        sport = sp;
    }
    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String p) {
        position = p;
    }

    @Override
    public void setName(String n) {
        name = n;
    }

    @Override
    public void setSport(String s) {
        sport = s;
    }

    @Override
    public void setSalary(int sa) {
        salary = sa;
    }

    @Override
    public String getSport() {
        return sport;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void apply(IVisitorDrawer v) {
        v.draw(this);
    }
}
