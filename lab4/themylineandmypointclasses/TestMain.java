package hus.oop.lab4.themylineandmypointclasses;

public class TestMain {
    public static void main(String[] args) {
        // Create MyPoint instances
        MyPoint point1 = new MyPoint(1, 1);
        MyPoint point2 = new MyPoint(3, 4);

        // Test constructors
        MyLine line1 = new MyLine(1, 2, 3, 4);
        MyLine line2 = new MyLine(point1, point2);

        // Test getters and setters
        System.out.println("Begin X: " + line1.getBeginX());
        System.out.println("Begin Y: " + line1.getBeginY());
        System.out.println("End X: " + line1.getEndX());
        System.out.println("End Y: " + line1.getEndY());

        line1.setBeginX(5);
        line1.setBeginY(6);
        line1.setEndX(7);
        line1.setEndY(8);

        System.out.println("Updated Begin X: " + line1.getBeginX());
        System.out.println("Updated Begin Y: " + line1.getBeginY());
        System.out.println("Updated End X: " + line1.getEndX());
        System.out.println("Updated End Y: " + line1.getEndY());

        // Test getBegin and getEnd
        System.out.println("Begin Point: " + line1.getBegin());
        System.out.println("End Point: " + line1.getEnd());

        // Test getLength and getGradient
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());

        // Test toString
        System.out.println(line1);
        System.out.println(line2);
    }
}
