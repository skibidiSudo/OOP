package hus.oop.lab11.visitorpattern.exercise3;

public class Circle implements Shape{
    protected int x, y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Circle.");
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
