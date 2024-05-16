package hus.oop.lab11.abstracfactorypattern.exercise2;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory humanFactory = new HumanFactory();
        Soldier humanSoldier = humanFactory.createSoldier();
        Vehicle humanVehicle = humanFactory.createVehicle();
        humanSoldier.attack();
        humanVehicle.move();

        AbstractFactory alienFactory = new AlienFactory();
        Soldier alienSoldier = alienFactory.createSoldier();
        Vehicle alienVehicle = alienFactory.createVehicle();
        alienSoldier.attack();
        alienVehicle.move();
    }
}
