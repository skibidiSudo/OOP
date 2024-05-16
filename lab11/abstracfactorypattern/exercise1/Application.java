package hus.oop.lab11.abstracfactorypattern.exercise1;

public class Application {
    private GUIFactory guiFactory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    public void createUI() {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
