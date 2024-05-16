package hus.oop.lab11.factorymethodpattern.exercise1;

public class Test {
    public static void main(String[] args) throws Exception{
        Application application = new Application();

        application.create("Windows");

        System.out.println();
        application.create("Web");

        //application.create("Linux"); Unknown operating system.
    }
}
