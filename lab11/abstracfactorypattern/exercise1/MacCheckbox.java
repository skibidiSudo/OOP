package hus.oop.lab11.abstracfactorypattern.exercise1;

public class MacCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Checkbox in MacOS style.");
    }
}
