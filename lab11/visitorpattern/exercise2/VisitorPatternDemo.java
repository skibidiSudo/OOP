package hus.oop.lab11.visitorpattern.exercise2;

import java.util.LinkedList;
import java.util.List;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPartVisitor computerPartVisitor = new ComputerPartDisplayVisitor();

        ComputerPart[] computerParts1 = {new Keyboard(), new Monitor(), new Mouse()};
        ComputerPart[] computerParts2 = {new Keyboard(), new Monitor()};
        ComputerPart[] computerParts3 = {new Mouse(), new Keyboard()};

        ComputerPart computer1 = new Computer(computerParts1);
        ComputerPart computer2 = new Computer(computerParts2);
        ComputerPart computer3 = new Computer(computerParts3);

        List<ComputerPart> computers = new LinkedList<>();
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);

        for (ComputerPart computer : computers) {
            computer.accept(computerPartVisitor);
            System.out.println();
        }
    }
}
