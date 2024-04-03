package hus.oop.lab7.abstractanimal;


public class Cat extends Animal {
    public Cat() {
    }

    @Override
    public void greeting() {
        System.out.println("Meow!");
    }
}
