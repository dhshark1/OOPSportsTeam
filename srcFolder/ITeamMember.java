public interface ITeamMember {
    void setName(String n);
    void setSport(String s);
    void setSalary(int sa);
    String getSport();
    int getSalary();
    String getName();
    void apply(IVisitorDrawer v);
}
