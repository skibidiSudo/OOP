package hus.oop.lab11.visitorpattern.exercise1;

public class VisitorImpl implements Visitor{
    @Override
    public void visit(BusinessBook book) {
        System.out.println("Business book published by: " + book.getPublisher());
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println("Favorite java book is: " + book.getFavouriteBook());
        System.out.println("Java core book resource: " + book.getResource());
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println("Best seller of design pattern book is: " + book.getBestSeller());
        System.out.println("Design pattern book resource: " + book.getResource());
    }
}
