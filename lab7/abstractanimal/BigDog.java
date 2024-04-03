package hus.oop.lab7.abstractanimal;


public class BigDog extends Dog {
    public BigDog() {
    }

    @Override
    public void greeting() {
        System.out.println("Wooow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooow!");
    }

    public void greeting(BigDog another) {
        System.out.println("Wooooooooow!");
    }
}
