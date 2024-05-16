package hus.oop.lab11.iteratorpattern.exercise3;

public class NameIterator implements Iterator{
    private NameCollection nameCollection;
    private int index;

    public NameIterator(NameCollection nameCollection) {
        this.nameCollection = nameCollection;
        index = 0;
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return nameCollection.names[index++];
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return index < nameCollection.names.length;
    }
}
