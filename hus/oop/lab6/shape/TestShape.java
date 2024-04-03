package hus.oop.lab6.shape;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape("blue", true);
        System.out.println(shape1);

        Circle circle1 = new Circle();
        System.out.println("Circle1 area: " + circle1.getArea());
        System.out.println("Circle1 perimeter: " + circle1.getPerimeter());

        Circle circle2 = new Circle(5.0);
        System.out.println("Circle2 area: " + circle2.getArea());
        System.out.println("Circle2 perimeter: " + circle2.getPerimeter());

        Circle circle3 = new Circle("green", false, 10.0);
        System.out.println("Circle3 area: " + circle3.getArea());
        System.out.println("Circle3 perimeter: " + circle3.getPerimeter());

        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle1 area: " + rectangle1.getArea());
        System.out.println("Rectangle1 perimeter: " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(3.0, 4.0);
        System.out.println("Rectangle2 area: " + rectangle2.getArea());
        System.out.println("Rectangle2 perimeter: " + rectangle2.getPerimeter());

        Rectangle rectangle3 = new Rectangle("yellow", true, 6.0, 8.0);
        System.out.println("Rectangle3 area: " + rectangle3.getArea());
        System.out.println("Rectangle3 perimeter: " + rectangle3.getPerimeter());

        Square square1 = new Square();
        System.out.println("Square1 area: " + square1.getArea());
        System.out.println("Square1 perimeter: " + square1.getPerimeter());

        Square square2 = new Square(5.0);
        System.out.println("Square2 area: " + square2.getArea());
        System.out.println("Square2 perimeter: " + square2.getPerimeter());

        Square square3 = new Square("red", false, 7.0);
        System.out.println("Square3 area: " + square3.getArea());
        System.out.println("Square3 perimeter: " + square3.getPerimeter());
    }
}

