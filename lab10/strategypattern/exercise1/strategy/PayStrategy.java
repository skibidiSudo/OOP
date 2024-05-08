package hus.oop.lab10.strategypattern.exercise1.strategy;

public interface PayStrategy {
    boolean pay(int paymenAmout);

    void collectPaymentDetails();
}
