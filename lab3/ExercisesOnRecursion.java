package hus.oop.lab3;

import java.util.Scanner;

public class ExercisesOnRecursion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //testFactorial();
        //testFibonacci();
        //testLen();
        //testGcd();
    }
    public static int factorial(int n){
        if (n<=1)
            return 1;
        return n * factorial(n-1);
        //return (n==0) ? 1 : n * factorial(n-1);
    }
    public static void testFactorial(){
        System.out.print("Enter the number (positive integer): ");
        int num = sc.nextInt();
        System.out.println("Factorial(" + num + ") = " + factorial(num));
    }
    public static int fibonacci(int n){
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void testFibonacci(){
        System.out.print("Enter the number (positive integer): ");
        int num = sc.nextInt();
        System.out.println("Fibo(" + num + ") = " + fibonacci(num));
    }
    public static int numOfDigits(int n){
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static int len(int n){
        if (n==1) {
            return 1;
        }
        return len(n-1) + numOfDigits(n);
    }
    public static void testLen(){
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Length of S(" + length + ") is: " + len(length));
    }
    public static int gcd(int x, int y){
        if (y==0) return x;
        if (x % y == 0) return y;
        return gcd(y, x%y);
    }
    public static void testGcd(){
        System.out.print("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Greatest common divisor of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }
}
