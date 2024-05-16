package hus.oop.lab11.abstracfactorypattern.exercise1;

public class WinCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Checkbox in Window style.");
    }
}
