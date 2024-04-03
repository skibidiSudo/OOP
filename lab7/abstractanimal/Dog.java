package hus.oop.lab7.abstractanimal;

public class Dog extends Animal {
    public Dog() {
    }

    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        System.out.println("Wooooof!");
    }
}
