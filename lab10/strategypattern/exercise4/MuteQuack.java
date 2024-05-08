package hus.oop.lab10.strategypattern.exercise4;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Silent...");
    }
}
