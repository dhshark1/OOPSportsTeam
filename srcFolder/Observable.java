import java.util.LinkedList;
import java.util.List;

public abstract class Observable implements ITeam{
    private List<IObserver> observers=new LinkedList<>();
    public void addObserver(IObserver o){
        observers.add(o);
    }
    public void removeObserver(IObserver o){
        observers.remove(o);
    }
    public void notifyObservers(String event, String arg){
        for(IObserver o : observers){
            o.update(event, arg);
        }
    }
}
