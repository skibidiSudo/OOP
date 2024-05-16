package hus.oop.lab11.factorymethodpattern.exercise3;

public class CallingClass {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();

        fruitFactory.provideFruit("Banana").produceJuice();
        fruitFactory.provideFruit("Orange").produceJuice();
        fruitFactory.provideFruit("Apple").produceJuice();

        fruitFactory.provideFruit("Peach").produceJuice(); //Error
    }
}
