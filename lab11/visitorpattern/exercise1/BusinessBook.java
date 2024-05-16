package hus.oop.lab11.visitorpattern.exercise1;

public class BusinessBook implements Book {
    private String publisher;

    public BusinessBook(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return publisher;
    }
}
