package hus.oop.lab4.themyrectangleandmypointclasses;

public class TestMain {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle(0, 0, 5, 3);

        System.out.println("Rectangle 1:");
        System.out.println(rectangle1);
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        MyPoint topLeft = new MyPoint(1, 1);
        MyPoint bottomRight = new MyPoint(6, 4);
        MyRectangle rectangle2 = new MyRectangle(topLeft, bottomRight);

        System.out.println("\nRectangle 2:");
        System.out.println(rectangle2);
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
