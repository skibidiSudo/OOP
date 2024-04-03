package hus.oop.lab6.point2dandpoint3d;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.5f, 4.2f);
        System.out.println("Point2D:");
        System.out.println("Coordinates: " + point2D);
        System.out.println("X coordinate: " + point2D.getX());
        System.out.println("Y coordinate: " + point2D.getY());
        point2D.setX(5.0f);
        point2D.setY(6.0f);
        System.out.println("New coordinates: " + point2D);
        System.out.println();

        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D:");
        System.out.println("Coordinates: " + point3D);
        System.out.println("X coordinate: " + point3D.getX());
        System.out.println("Y coordinate: " + point3D.getY());
        System.out.println("Z coordinate: " + point3D.getZ());
        point3D.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("New coordinates: " + point3D);
    }
}
