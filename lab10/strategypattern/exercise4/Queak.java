package hus.oop.lab10.strategypattern.exercise4;

public class Queak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Queak!");
    }
}
