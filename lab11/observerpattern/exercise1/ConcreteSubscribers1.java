package hus.oop.lab11.observerpattern.exercise1;

public class ConcreteSubscribers1 implements Subscriber {


    @Override
    public void update(Publisher publisher) {
        String state = publisher.mainState;
        System.out.println("ConcreteSubscriber1 update. New update: " + state);
    }
}
