package hus.oop.lab11.visitorpattern.exercise1;

public class VisitorPatternExample {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();

        Book businessBook = new BusinessBook("VNUPRESS.");
        Book designPatternBook = new DesignPatternBook("Head First Design Patter.", "Design Pattern Resource.");
        Book javaCoreBook = new JavaCoreBook("Java A Beginner's Giude Eighth Edition.", "Java Core Resource.");

        businessBook.accept(visitor);
        designPatternBook.accept(visitor);
        javaCoreBook.accept(visitor);
    }
}
