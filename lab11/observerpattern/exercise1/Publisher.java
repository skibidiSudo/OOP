package hus.oop.lab11.observerpattern.exercise1;

import java.util.LinkedList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers;
    protected String mainState;

    public Publisher() {
        subscribers = new LinkedList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    public void mainBusinessLogic(String mainState) {
        this.mainState = mainState;
        notifySubscribers();
    }
}
