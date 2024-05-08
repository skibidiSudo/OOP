package hus.oop.lab10.strategypattern.exercise4;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFLy() {
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
}
