package hus.oop.lab10.decoratorpattern.exampleforicecream;

public class NutsToppingDecorator extends ToppingDecorator{
    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + addTopping();
    }

    @Override
    public String addTopping() {
        return ", Nuts";
    }
}
