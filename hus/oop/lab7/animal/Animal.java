package hus.oop.lab7.animal;

public abstract class Animal {
    private String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}
