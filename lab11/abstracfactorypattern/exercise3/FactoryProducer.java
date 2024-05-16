package hus.oop.lab11.abstracfactorypattern.exercise3;

public class FactoryProducer {
    public AbstractFactory getFactory(String factory) {
        if (factory.equals("ShapeFactory")) {
            return new ShapeFactory();
        }
        if (factory.equals("RoundedShapeFactory")) {
            return new RoundedShapeFactory();
        }
        return null;
    }
}
