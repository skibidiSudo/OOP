package hus.oop.lab7.movablecircle;

public class TestMovable {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0, 0, 2, 3, 5);
        MovablePoint point = new MovablePoint(1, 1, 2, 2);

        System.out.println("Before moving:");
        System.out.println("MovableCircle: " + circle);
        System.out.println("MovablePoint: " + point);

        System.out.println("\nAfter moving:");
        circle.moveUp();
        point.moveLeft();
        System.out.println("MovableCircle: " + circle);
        System.out.println("MovablePoint: " + point);
    }
}
