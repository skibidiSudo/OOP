package hus.oop.lab11.factorymethodpattern.exercise2;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String style) {
        if (style.equals("pepperoni"))
            return new ChicagoStylePepperoniPizza();
        return null;
    }
}

