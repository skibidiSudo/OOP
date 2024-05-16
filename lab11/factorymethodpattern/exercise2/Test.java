package hus.oop.lab11.factorymethodpattern.exercise2;

public class Test {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyStore.orderPizza("pepperoni");
        System.out.println("Nam ordered a " + pizza1.name + "\n");

        Pizza pizza2 = chicagoStore.orderPizza("pepperoni");
        System.out.println("Ánh ordered a " + pizza2.name + "\n");
    }
}
