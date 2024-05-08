package hus.oop.lab10.observerpattern.exercise2;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer binObserver = new BinaryObserver(subject);
        Observer hexObserver = new HexaObserver(subject);
        Observer octObserver = new OctalObserver(subject);
        subject.attach(binObserver);
        subject.attach(hexObserver);
        subject.attach(octObserver);

        subject.setState(1);
        subject.setState(2);
        subject.setState(3);
    }
}
