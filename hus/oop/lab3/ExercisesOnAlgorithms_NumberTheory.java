package hus.oop.lab3;

import java.util.Scanner;

public class ExercisesOnAlgorithms_NumberTheory {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //PerfectNumberList();
        //PrimeList();
        //PerfectPrimeFactorList();
        testGcd();
    }
    public static boolean isPerfect(int aPosInt){
        if (aPosInt <= 1) {
            return false;
        }
        int sumDigit = 1;
        for (int i = 2; i*i <= aPosInt; i++){
            if (aPosInt % i == 0) {
                sumDigit += i;
                if (aPosInt / i != i)
                    sumDigit += aPosInt / i;
            }
        }
        return aPosInt == sumDigit;
    }
    public static boolean isDeficient(int aPosInt){
        if (aPosInt <= 1) {
            return false;
        }
        int sumDigit = 1;
        for (int i = 2; i*i <= aPosInt; i++){
            if (aPosInt % i == 0) {
                sumDigit += i;
                if (aPosInt / i != i)
                    sumDigit += aPosInt / i;
            }
        }
        return aPosInt > sumDigit;
    }
    public static void PerfectNumberList(){
        System.out.print("Enter the upper bound (positive integer): ");
        int upperBound = sc.nextInt();
        System.out.println("These numbers are perfect: ");
        int countPerfect = 0, countDeficient = 0;
        for (int i = 1; i <= upperBound; i++){
            if (isPerfect(i)){
                System.out.print(i + " ");
                countPerfect++;
            }
        }
        System.out.println();
        System.out.printf("[%d perfect numbers found (%.2f%%)]\n", countPerfect, ((double) countPerfect/upperBound) * 100);
        System.out.println("These numbers are neither deficient nor perfect :");
        for (int i = 1; i <= upperBound; i++){
            if (!isDeficient(i) && !isPerfect(i)){
                System.out.print(i + " ");
                countDeficient++;
            }
        }
        System.out.println();
        System.out.printf("[%d numbers found (%.2f%%)]", countDeficient, ((double) countDeficient/upperBound) * 100);
    }
    public static boolean isPrime(int num){
        for (int i = 2; i*i <= num; i++){
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void PrimeList(){
        System.out.print("Enter the upper bound (positive integer): ");
        int upperBound = sc.nextInt();
        int countPrime = 0;
        for (int i = 1; i <= upperBound; i++){
            if (isPrime(i)){
                System.out.println(i);
                countPrime++;
            }
        }
        System.out.printf("[%d primes found (%.2f%%)]", countPrime, ((double) countPrime / upperBound) * 100);
    }
    public static boolean isProductOfPrimeFactors(int num){
        if (num <= 1)
            return false;
        int originalNum = num, multiply = 1, count = 0;
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                multiply *= i;
                count++;
                while (num % i == 0){
                    num /= i;
                }
            }
        }
        if (num > 1) {
            multiply *= num;
            count++;
        }
        return (multiply == originalNum) && (count >= 2);
    }
    public static void PerfectPrimeFactorList(){
        System.out.print("Enter the upper bound (positive integer): ");
        int upperBound = sc.nextInt();
        int countPrimeFactor = 0;
        System.out.println("These numbers are equal to the product of prime factors :");
        for (int i = 1; i <= upperBound; i++){
            if (isProductOfPrimeFactors(i)){
                System.out.print(i + " ");
                countPrimeFactor++;
            }
        }
        System.out.printf("[%d numbers found (%.2f%%)]", countPrimeFactor, ((double) countPrimeFactor / upperBound) * 100);
    }
    public static int gcd(int a, int b){
        if (b==0)
            return a;
        while (b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void testGcd(){
        System.out.print("Enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Greatest common divisor of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }
}
