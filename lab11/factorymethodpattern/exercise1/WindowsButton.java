package hus.oop.lab11.factorymethodpattern.exercise1;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("A button in Windows style.");
    }

    @Override
    public void onClick() {
        System.out.println("WindowsButton on click!");
    }
}
