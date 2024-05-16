package hus.oop.lab11.visitorpattern.exercise2;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Mouse mouse) {
        System.out.print(" Mouse");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.print(" Monitor");
    }

    @Override
    public void visit(Computer computer) {
        System.out.print("Computer with:");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.print(" Keyboard");
    }
}
