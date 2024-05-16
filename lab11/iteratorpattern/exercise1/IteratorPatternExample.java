package hus.oop.lab11.iteratorpattern.exercise1;

public class IteratorPatternExample {
    public static void main(String[] args) {
        String[] productCatalog = {"Nam", "Kiên", "Tú", "Việt", "Hưng", "Hải", "Ánh"};
        Iterable iterable = new ProductCatalog(productCatalog);
        Iterator iterator = iterable.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
