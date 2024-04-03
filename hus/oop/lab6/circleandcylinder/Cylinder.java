package hus.oop.lab6.circleandcylinder;

public class Cylinder {
    private Circle base;
    private double height;
    public Cylinder(){
        base = new Circle();
        height = 1.0;
    }
    public Cylinder(String color, double radius, double height){
        base = new Circle(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + base.toString() + " height=" + height;
    }
}
