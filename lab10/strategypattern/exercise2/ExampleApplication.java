package hus.oop.lab10.strategypattern.exercise2;

import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter last number: ");
        int lastNumber = sc.nextInt();
        System.out.print("Enter the action (addition or subtraction or multiplication): ");
        String action = sc.next();

        if (action.equals("addition")) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (action.equals("subtraction")) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else if (action.equals("multiplication")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        int result = context.executeStrategy(firstNumber, lastNumber);

        System.out.println("Result: " + result);
    }
}

