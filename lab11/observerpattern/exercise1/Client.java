package hus.oop.lab11.observerpattern.exercise1;

public class Client {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber concreteSubscriber1 = new ConcreteSubscribers1();
        Subscriber concreteSubscriber2 = new ConcreteSubscribers2();
        Subscriber concreteSubscriber = new ConcreteSubscribers1();
        publisher.subscribe(concreteSubscriber1);
        publisher.subscribe(concreteSubscriber2);
        publisher.subscribe(concreteSubscriber);

        publisher.mainBusinessLogic("New State");
        publisher.mainBusinessLogic("Hi hi");
        publisher.unsubscribe(concreteSubscriber);

        System.out.println("After unsub: ");
        publisher.mainBusinessLogic("...");
    }
}
