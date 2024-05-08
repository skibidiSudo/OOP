package hus.oop.lab10.strategypattern.exercise2;

public class ConcreteStrategyAdd implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
