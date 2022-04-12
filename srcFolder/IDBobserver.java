public interface IDBobserver extends IObserver {
    void addPlayerToTeam(String playerName);
    void addCoachToTeam(String coachName);
    void addGame(String gameName);
}
