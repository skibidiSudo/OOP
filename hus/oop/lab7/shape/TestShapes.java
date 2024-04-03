package hus.oop.lab7.shape;

public class TestShapes {
    public static void main(String[] args) {
        Shape shape1 = new Circle("red", false, 3.0); // Upcast Circle to Shape
        System.out.println(shape1); // Circle version
        System.out.println(shape1.getArea()); // Circle version
        System.out.println(shape1.getPerimeter()); // Shape version
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        //System.out.println(shape1.getRadius()); // This line will not compile because the getRadius() method is not defined in the Shape class

        if (shape1 instanceof  Circle){
            Circle circle1 = (Circle) shape1; // Downcast back to Circle
            System.out.println(circle1);
            System.out.println(circle1.getArea());
            System.out.println(circle1.getPerimeter());
            System.out.println(circle1.getColor());
            System.out.println(circle1.isFilled());
            System.out.println(circle1.getRadius());
        }

        Shape shape2 = new Rectangle("red", false, 1.0, 2.0); // Upcast
        System.out.println(shape2);
        System.out.println(shape2.getArea());
        System.out.println(shape2.getPerimeter());
        System.out.println(shape2.getColor());
        //System.out.println(shape3.getLength()); // This line will not compile because the getLength() method is not defined in the Shape class

        if (shape2 instanceof Rectangle){
            Rectangle rectangle1 = (Rectangle) shape2; // Downcast
            System.out.println(rectangle1);
            System.out.println(rectangle1.getArea());
            System.out.println(rectangle1.getColor());
            System.out.println(rectangle1.getLength());
        }

        Shape shape3 = new Square(6.6); // Upcast
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getColor());
        //System.out.println(shape4.getSide()); // This line will not compile because the getSide() method is not defined in the Shape class

        Rectangle rectangle2 = new Rectangle();
        if (shape3 instanceof Rectangle){
            rectangle2 = (Rectangle) shape3; // Downcast to Rectangle instead of Square
            System.out.println(rectangle2);
            System.out.println(rectangle2.getArea());
            System.out.println(rectangle2.getColor());
            //System.out.println(rectangle2.getSide()); // This line will not compile because the getSide() method is not defined in the Rectangle class
            System.out.println(rectangle2.getLength());

            if (rectangle2 instanceof Square){
                Square square1 = (Square) rectangle2; // Downcast Rectangle to Square
                System.out.println(square1);
                System.out.println(square1.getArea());
                System.out.println(square1.getColor());
                System.out.println(square1.getSide());
                System.out.println(square1.getLength());
            }
        }
    }
}
