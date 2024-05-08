package hus.oop.lab10.observerpattern.exercise2;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("HexaObserver new update: " + subject.getState());
    }
}
