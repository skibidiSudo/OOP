package hus.oop.lab4.thecustomerandaccountclasses;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer.toString() + " balance = $" + Math.round(balance * 100.0) / 100.0;
    }

    public String getCustomeerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        return new Account(id, customer, balance + amount);
    }

    public Account withdraw(double amount) {
        Account newAccount = new Account(id, customer, balance);
        if (newAccount.getBalance() >= amount) {
            newAccount.setBalance(balance - amount);
        } else {
            System.out.println("amount withdrawn exceeds te current balance!");
        }
        return newAccount;
    }
}
