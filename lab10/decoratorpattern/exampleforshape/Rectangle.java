package hus.oop.lab10.decoratorpattern.exampleforshape;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.print("Draw a rectangle");
    }
}
