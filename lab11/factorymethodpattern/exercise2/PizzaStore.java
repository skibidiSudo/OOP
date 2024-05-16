package hus.oop.lab11.factorymethodpattern.exercise2;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.perform();

        return pizza;
    }
}
