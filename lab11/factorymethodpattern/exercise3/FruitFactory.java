package hus.oop.lab11.factorymethodpattern.exercise3;

public class FruitFactory {
    public Fruit provideFruit(String type) {
        if (type.equals("Banana")) {
            return new Banana();
        }
        if (type.equals("Orange")) {
            return new Orange();
        }
        if (type.equals("Apple")) {
            return new Apple();
        }
        return null;
    }
}
