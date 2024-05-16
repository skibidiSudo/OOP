package hus.oop.lab11.visitorpattern.exercise1;

public class JavaCoreBook implements ProgramingBook {
    private String favouriteBook;
    private String resource;

    public JavaCoreBook(String favouriteBook, String resource) {
        this.favouriteBook = favouriteBook;
        this.resource = resource;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return resource;
    }

    public String getFavouriteBook() {
        return favouriteBook;
    }
}
