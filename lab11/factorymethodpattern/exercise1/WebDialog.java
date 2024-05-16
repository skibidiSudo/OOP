package hus.oop.lab11.factorymethodpattern.exercise1;

public class WebDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
