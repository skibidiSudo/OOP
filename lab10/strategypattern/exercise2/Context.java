package hus.oop.lab10.strategypattern.exercise2;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b){
        return strategy.execute(a, b);
    }
}
