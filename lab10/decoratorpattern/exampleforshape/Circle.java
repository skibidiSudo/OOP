package hus.oop.lab10.decoratorpattern.exampleforshape;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.print("Draw a circle");
    }
}
