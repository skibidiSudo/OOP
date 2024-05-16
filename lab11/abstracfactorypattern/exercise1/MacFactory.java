package hus.oop.lab11.abstracfactorypattern.exercise1;

public class MacFactory implements GUIFactory {
    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
