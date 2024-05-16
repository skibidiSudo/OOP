package hus.oop.lab11.abstracfactorypattern.exercise3;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equals("Rectangle")) {
            return new Rectangle();
        }
        if (type.equals("Square")) {
            return new Square();
        }
        return null;
    }
}
