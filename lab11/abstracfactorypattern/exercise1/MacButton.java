package hus.oop.lab11.abstracfactorypattern.exercise1;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Button in MacOS style.");
    }
}
