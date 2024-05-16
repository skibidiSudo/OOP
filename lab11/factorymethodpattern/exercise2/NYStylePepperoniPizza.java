package hus.oop.lab11.factorymethodpattern.exercise2;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        this.name = "NY Style Pepperoni Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";
        this.toppings.add("Grated Reggiano Cheese");
        this.toppings.add("Sliced Pepperoni");
        this.toppings.add("Garlic");
        this.toppings.add("Onion");
        this.toppings.add("Mushrooms");
        this.toppings.add("Red Pepper");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into 8 slices");
    }
}

