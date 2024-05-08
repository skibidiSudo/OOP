package hus.oop.lab10.decoratorpattern.exampleforicecream;

public class HoneyToppingDecorator extends ToppingDecorator{
    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + addTopping();
    }

    @Override
    public String addTopping() {
        return ", Honey";
    }
}
