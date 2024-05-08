package hus.oop.lab10.strategypattern.exercise4;

public class RedheadDuck extends Duck{
    public RedheadDuck(){
        quackBehavior = new Queak();
        flyBehavior = new FlyWithWings();
    }
}
