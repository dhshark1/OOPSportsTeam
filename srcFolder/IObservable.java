public interface IObservable {
    void addObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers(String event, String arg);
}
