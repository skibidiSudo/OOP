package hus.oop.lab11.iteratorpattern.exercise3;

public class Demo {
    public static void main(String[] args) {
        String[] names = {"Nam", "Kiên", "Tú", "Việt", "Hưng", "Hải", "Ánh"};
        NameCollection nameCollection = new NameCollection(names);
        Iterator iterator = nameCollection.getIterator();

        print(iterator);
    }

    public static void print(Iterator iterator){
        while (iterator.hasNext()) {
            System.out.println("Name: " + iterator.next());
        }
    }
}
