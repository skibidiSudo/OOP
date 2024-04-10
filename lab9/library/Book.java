package hus.oop.lab9.library;

public class Book extends Item{
    protected int pages;

    public Book(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book[" +
                "pages=" + pages +
                ", title=" + title +
                ", year=" + year +
                ']';
    }
}
