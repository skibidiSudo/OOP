package hus.oop.lab11.visitorpattern.exercise3;

public class CompoundShape implements Shape{
    protected int x, y;

    public CompoundShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Compound shape.");
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
