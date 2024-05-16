package hus.oop.lab11.visitorpattern.exercise3;

public class Dot implements Shape {
    protected int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Dot.");
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
