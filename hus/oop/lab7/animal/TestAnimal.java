package hus.oop.lab7.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal cat = new Cat("Whiskers");
        System.out.print("Cat greets: ");
        cat.greets();

        Animal dog = new Dog("Buddy");
        System.out.print("Dog greets: ");
        dog.greets();

        Animal bigDog = new BigDog("Max");
        System.out.print("BigDog greets: ");
        bigDog.greets();

        Animal anotherDog = new Dog("Rex");
        if (anotherDog instanceof Dog){
            System.out.print("Dog greets another Dog: ");
            ((Dog) dog).greets((Dog) anotherDog);
        }

        Animal anotherBigDog = new BigDog("Brutus");
        if (anotherBigDog instanceof BigDog) {
            System.out.print("BigDog greets another BigDog: ");
            ((BigDog) bigDog).greets((BigDog) anotherBigDog);
        }
    }
}
