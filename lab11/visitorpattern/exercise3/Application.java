package hus.oop.lab11.visitorpattern.exercise3;

import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        Shape circle = new Circle(1, 2);
        Shape rectangle = new Rectangle(3, 4);
        Shape dot = new Dot(-1, 2);
        Shape compoundShape = new CompoundShape(0, 0);
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(dot);
        shapes.add(compoundShape);

        Visitor exportVisitor = new XMLExportVisitor();

        for (Shape shape : shapes) {
            shape.accept(exportVisitor);
            System.out.println();
        }
    }
}
