package hus.oop.lab11.abstracfactorypattern.exercise2;

public class HumanFactory implements AbstractFactory{
    @Override
    public Soldier createSoldier() {
        return new HumanSoldier();
    }

    @Override
    public Vehicle createVehicle() {
        return new HumanVehicle();
    }
}
