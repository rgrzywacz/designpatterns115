package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Publisher {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public boolean registerObserver(Observer observer) {
        return observers.add(observer);
    }

    @Override
    public boolean unregisterObserver(Observer observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyObservers(Object object) {
        observers.forEach(o -> o.update((String)object));
    }
}
