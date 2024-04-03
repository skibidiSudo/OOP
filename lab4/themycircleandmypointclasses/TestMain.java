package hus.oop.lab4.themycircleandmypointclasses;

public class TestMain {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle();
        MyCircle circle2 = new MyCircle(3, 4, 5);
        MyCircle circle3 = new MyCircle(new MyPoint(1, 2), 6);

        System.out.println("Center of circle2: " + circle2.getCenter());
        System.out.println("Radius of circle2: " + circle2.getRadius());
        circle2.setCenter(new MyPoint(2, 3));
        circle2.setRadius(7);
        System.out.println("Updated center of circle2: " + circle2.getCenter());
        System.out.println("Updated radius of circle2: " + circle2.getRadius());

        System.out.println("CenterX of circle2: " + circle2.getCenterX());
        System.out.println("CenterY of circle2: " + circle2.getCenterY());
        System.out.println("CenterXY of circle2: " + java.util.Arrays.toString(circle2.getCenterXY()));
        circle2.setCenterXY(4, 6);
        System.out.println("Updated centerXY of circle2: " + java.util.Arrays.toString(circle2.getCenterXY()));
        System.out.println("Area of circle2: " + circle2.getArea());
        System.out.println("Circumference of circle2: " + circle2.getCircumference());

        System.out.println("Distance between circle2 and circle3 centers: " + circle2.distance(circle3));
    }
}
