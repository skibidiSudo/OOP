package hus.oop.lab7.resizable;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area of the circle: " + circle.getArea());
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
    }
}
