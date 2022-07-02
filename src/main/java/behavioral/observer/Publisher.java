package behavioral.observer;

public interface Publisher {
    boolean registerObserver(Observer observer);
    boolean unregisterObserver(Observer observer);
    void notifyObservers(Object object);
}
