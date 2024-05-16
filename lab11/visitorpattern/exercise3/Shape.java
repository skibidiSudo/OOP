package hus.oop.lab11.visitorpattern.exercise3;

public interface Shape {
    void move(int x, int y);

    void draw();

    void accept(Visitor visitor);
}
