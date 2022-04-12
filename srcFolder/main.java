import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Random;

public class main {
    public static void main(String[] args){
        ITeam t = new Team("paradigmFC","soccer");

        IDBobserver db = new RamDB(t);
        t.addObserver(db);

        IPlayer p1 = new Player("striker","Dani",1000000, "soccer");
        IPlayer p2 = new Player("goalie","Tom",1000000, "soccer");
        IPlayer p3 = new Player("defender","Maiky",1000000, "soccer");
        ICoach c1 = new Coach("Head Coach","Ariel", 1, "soccer" );
        ICoach c2 = new Coach("Assistant Coach","Erez", 1, "soccer" );
        t.addPlayer(p1).addPlayer(p2).addPlayer(p3).addCoach(c1).addCoach(c2);

        //Observer
        ((RamDB)db).printPlayers();

        System.out.println("");

        //Iterator demonstration:
        System.out.println("Iterator: ");
        Iterator<ITeamMember> it = t.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getName());
        }

        System.out.println("");

        //Visitor
        System.out.println("Visitor:");
        IVisitorDrawer psg = new PrintScreenGUI();
        t.apply(psg);

        System.out.println("");




    }
}
