package hus.oop.lab11.abstracfactorypattern.exercise3;

public class RoundedShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String type) {
        if (type.equals("RoundedRectangle")) {
            return new RoundedRectangle();
        }
        if (type.equals("RoundedSquare")) {
            return new RoundedSquare();
        }
        return null;
    }
}
