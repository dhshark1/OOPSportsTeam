public class Coach implements ICoach {
    String role;
    String name;
    int salary;
    String sport;
    public Coach(String r, String n, int s, String sa){
        role = r;
        name = n;
        salary = s;
        sport = sa;
    }
    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String r) {
        role = r;
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
