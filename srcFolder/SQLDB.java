import java.sql.Connection;

public class SQLDB extends DBobserverAbstract {
    private Connection c;
    //create SQL connection as a class member
    public SQLDB(ITeam t, Connection c){
        super(t);
        this.c = c;
    }

    @Override
    protected void writePlayerToFile(IPlayer p) {
        //
    }

    @Override
    protected void writeCoachToFile(ICoach c) {
        //
    }

    @Override
    protected void writeGameToFile(IGame g) {
        //
    }
}
