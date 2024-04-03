package hus.oop.lab6.shape;

import java.util.ArrayList;

public class ShapeManager {
    //Này là em làm thêm thôi nha chị :cc
    private ArrayList<Shape> shape;
    public ShapeManager() {
        this.shape = new ArrayList<>();
    }
    public void addShape(Shape shape1){
        shape.add(shape1);
    }

    public void printShapes(){
        for (Shape shape1 : shape){
            System.out.println(shape1.toString());
        }
    }

    public void getAreaOfShapes(){
        for (Shape shape1 : shape){
            System.out.println("Area: " + shape1.getArea());
        }
    }

    public void increaseArea(){
        ArrayList<Shape> newShape = shape;
        for (int i=0; i < newShape.size()-1;i++){
            for (int j=i+1;j<newShape.size();j++){
                if (newShape.get(i).getArea() > newShape.get(j).getArea()){
                    Shape x = newShape.get(i);
                    newShape.set(i, newShape.get(j));
                    newShape.set(j, x);
                }
            }
        }
    }

    public static void main(String[] args) {
        ShapeManager manager = new ShapeManager();

        manager.addShape(new Circle(3.0));
        manager.addShape(new Rectangle(4.0, 5.0));
        manager.addShape(new Square(2.0));

        System.out.println("Shapes:");
        manager.printShapes();
        manager.getAreaOfShapes();

        System.out.println("After swap:");
        manager.increaseArea();
        manager.getAreaOfShapes();
    }
}
