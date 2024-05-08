package hus.oop.lab10.decoratorpattern.exampleforshape;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.print(" with a red border");
    }
}
