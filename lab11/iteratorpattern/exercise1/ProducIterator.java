package hus.oop.lab11.iteratorpattern.exercise1;

public class ProducIterator implements Iterator {
    private ProductCatalog productCatalog;
    private int position;

    public ProducIterator(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public boolean hasNext() {
        return position < productCatalog.size();
    }

    @Override
    public Object next() {
        Object nextOb = productCatalog.getProducCatalog()[position++];
        return nextOb;
    }
}
