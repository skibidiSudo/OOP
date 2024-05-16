package hus.oop.lab11.factorymethodpattern.exercise2;

import java.util.List;
import java.util.ArrayList;

public class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings;

    public Pizza() {
        this.toppings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public void perform() {
        prepare();
        bake();
        cut();
        box();
    }

    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("----- ").append(name).append(" -----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");
        for (String topping : toppings) {
            display.append(topping).append("\n");
        }
        return display.toString();
    }
}
