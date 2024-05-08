package hus.oop.lab10.strategypattern.exercise4;

import java.util.LinkedList;
import java.util.List;

public class DuckSimulator {
    public static void main(String[] args) {
        List<Duck> ducks = new LinkedList<>();

        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck redheadDuck = new RedheadDuck();
        ducks.add(mallardDuck);
        ducks.add(redheadDuck);
        ducks.add(rubberDuck);

        for (Duck duck : ducks){
            duck.performFLy();
            duck.performQuack();
        }
    }
}
