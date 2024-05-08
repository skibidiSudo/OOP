package hus.oop.lab10.strategypattern.exercise4;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
