package hus.oop.lab11.factorymethodpattern.exercise1;

public class WindowDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
