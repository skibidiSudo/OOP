package hus.oop.lab10.adapterpattern.example;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("FLying!");
    }
}
