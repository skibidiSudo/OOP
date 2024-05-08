package hus.oop.lab10.observerpattern.exercise2;

public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void update() {
        System.out.println("BinaryObserver new update: " + subject.getState());
    }
}
