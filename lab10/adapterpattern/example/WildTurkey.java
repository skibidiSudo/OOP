package hus.oop.lab10.adapterpattern.example;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble!");
    }

    @Override
    public void fly() {
        System.out.println("FLying Flying!");
    }
}
