package hus.oop.lab10.strategypattern.exercise4;

public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithRocket();
    }
}
