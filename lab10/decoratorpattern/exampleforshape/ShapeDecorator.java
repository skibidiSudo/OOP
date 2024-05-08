package hus.oop.lab10.decoratorpattern.exampleforshape;

public class ShapeDecorator implements Shape{
    private Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(){
        shape.draw();
    }
}

