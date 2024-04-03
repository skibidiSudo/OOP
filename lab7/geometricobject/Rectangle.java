package hus.oop.lab7.geometricobject;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    @Override
    public String toString(){
        return "Rectangle[width=" + width + ",lenght=" + length + "]";
    }
    @Override
    public double getArea(){
        return width * length;
    }
    @Override
    public double getPerimeter(){
        return (width + length) * 2;
    }
}
