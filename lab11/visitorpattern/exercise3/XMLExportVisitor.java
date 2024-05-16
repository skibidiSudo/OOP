package hus.oop.lab11.visitorpattern.exercise3;

public class XMLExportVisitor implements Visitor{
    @Override
    public void visit(Dot dot) {
        dot.draw();
        System.out.println("Current location: " + "(" + dot.x + "," + dot.y + ")");
    }

    @Override
    public void visit(Circle circle) {
        circle.draw();
        System.out.println("Current location: " + "(" + circle.x + "," + circle.y + ")");
    }

    @Override
    public void visit(Rectangle rectangle) {
        rectangle.draw();
        System.out.println("Current location: " + "(" + rectangle.x + "," + rectangle.y + ")");
    }

    @Override
    public void visit(CompoundShape compoundShape) {
        compoundShape.draw();
        System.out.println("Current location: " + "(" + compoundShape.x + "," + compoundShape.y + ")");
    }
}
