package hus.oop.lab6.circleandcylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder("blue", 2.0, 3.0);
        System.out.println(cylinder2);

        cylinder2.setHeight(4.0);
        System.out.println("Height of cylinder2: " + cylinder2.getHeight());

        // Test getVolume() method
        System.out.println("Volume of cylinder2: " + cylinder2.getVolume());
    }
}
