package hus.oop.lab6.pointandline;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println("Line l1: " + l1);

        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 6);
        Line l2 = new Line(p1, p2);
        System.out.println("Line l2: " + l2);
    }
}

