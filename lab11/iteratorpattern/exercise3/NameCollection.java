package hus.oop.lab11.iteratorpattern.exercise3;

public class NameCollection {
    protected String[] names;

    public NameCollection(String[] names) {
        this.names = names;
    }

    public Iterator getIterator() {
        return new NameIterator(this);
    }
}
