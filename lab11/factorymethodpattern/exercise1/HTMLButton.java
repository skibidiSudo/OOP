package hus.oop.lab11.factorymethodpattern.exercise1;

public class HTMLButton implements Button {
    @Override
    public void onClick() {
        System.out.println("HTMLButton on click!");
    }

    @Override
    public void render() {
        System.out.println("A button in Web");
    }
}
