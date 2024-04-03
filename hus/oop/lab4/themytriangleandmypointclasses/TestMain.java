package hus.oop.lab4.themytriangleandmypointclasses;

public class TestMain {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 0, 4);

        System.out.println("Triangle 1:");
        System.out.println(triangle1);
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Type: " + triangle1.getType());

        MyPoint v1 = new MyPoint(1, 2);
        MyPoint v2 = new MyPoint(3, 4);
        MyPoint v3 = new MyPoint(5, 6);
        MyTriangle triangle2 = new MyTriangle(v1, v2, v3);

        System.out.println("\nTriangle 2:");
        System.out.println(triangle2);
        System.out.println("Perimeter: " + triangle2.getPerimeter());
        System.out.println("Type: " + triangle2.getType());
    }
}
