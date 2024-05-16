package hus.oop.lab11.iteratorpattern.exercise1;

public class ProductCatalog implements Iterable {
    private String[] producCatalog;

    public ProductCatalog(String[] producCatalog) {
        this.producCatalog = producCatalog;
    }

    public int size() {
        return producCatalog.length;
    }

    public String[] getProducCatalog() {
        return producCatalog;
    }

    @Override
    public Iterator getIterator() {
        return new ProducIterator(this);
    }
}
