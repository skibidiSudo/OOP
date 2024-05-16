package hus.oop.lab11.visitorpattern.exercise2;

public class Computer implements ComputerPart {
    protected ComputerPart[] parts;

    public Computer(ComputerPart[] parts) {
        this.parts = parts;
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
    }
}
