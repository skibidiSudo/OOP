package hus.oop.lab10.decoratorpattern.exampleforicecream;

public abstract class ToppingDecorator implements IceCream {
    protected IceCream iceCream;

    @Override
    public abstract String getDescription();

    public abstract String addTopping();
}
