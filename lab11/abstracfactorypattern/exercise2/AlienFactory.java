package hus.oop.lab11.abstracfactorypattern.exercise2;

public class AlienFactory implements AbstractFactory{
    @Override
    public Vehicle createVehicle() {
        return new AlienVehicle();
    }

    @Override
    public Soldier createSoldier() {
        return new AlienSoldier();
    }
}
