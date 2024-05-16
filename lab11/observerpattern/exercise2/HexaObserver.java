package hus.oop.lab11.observerpattern.exercise2;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("HexaObserver new update: " + subject.getState());
    }
}
