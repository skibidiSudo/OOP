package hus.oop.lab10.observerpattern.exercise1;

public class ConcreteSubscribers2 implements Subscriber {

    @Override
    public void update(Publisher publisher) {
        String state = publisher.mainState;
        System.out.println("ConcreteSubscriber2 update. New update: " + state);
    }
}
