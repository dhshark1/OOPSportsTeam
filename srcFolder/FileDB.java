import java.io.File;

public class FileDB extends DBobserverAbstract {
    File f;
    FileDB(Team newTeam){
        super(newTeam);
        f = new File("./newFile.txt");
    }


    protected void writePlayerToFile(IPlayer p){
        /*...*/
    }

    protected void writeCoachToFile(ICoach c){
        /*...*/
    }

    protected void writeGameToFile(IGame g){
        /*...*/
    }
}
