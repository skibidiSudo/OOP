package hus.oop.lab10.adapterpattern.example;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey1 = new WildTurkey();
        Duck wildTurkey2 = new TurkeyAdapter(new WildTurkey());
        List<Duck> ducks = new ArrayList<>();

        ducks.add(mallardDuck);
        //ducks.add(wildTurkey1); Invalid
        ducks.add(wildTurkey2); //Valid

        for (Duck duck : ducks){
            duck.quack();
            duck.fly();
            System.out.println();
        }
    }
}
