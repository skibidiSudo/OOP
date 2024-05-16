package hus.oop.lab11.abstracfactorypattern.exercise3;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory shapeFactory = factoryProducer.getFactory("ShapeFactory");
        Shape square = shapeFactory.getShape("Square");
        Shape rectangle = shapeFactory.getShape("Rectangle");
        square.draw();
        rectangle.draw();

        AbstractFactory roundedShapeFactory = factoryProducer.getFactory("RoundedShapeFactory");
        Shape roundedSquare = roundedShapeFactory.getShape("RoundedSquare");
        Shape roundedRectangle = roundedShapeFactory.getShape("RoundedRectangle");
        roundedRectangle.draw();
        roundedSquare.draw();
    }
}
