package hus.oop.lab11.visitorpattern.exercise3;

public interface Visitor {
    void visit(Dot dot);
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(CompoundShape compoundShape);
}
