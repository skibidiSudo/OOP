package hus.oop.lab10.strategypattern.exercise4;

public class FlyWithRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly with rocket");
    }
}
