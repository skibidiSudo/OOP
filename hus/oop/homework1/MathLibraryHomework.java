package hus.oop.homework1;

import java.util.Scanner;

public class MathLibraryHomework {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //testTrigonometric();
        //testSpecialSeries();
        //testFactorial();
        //testFibonacci();
        testNumberConversion();
    }
    public static double sin(double x, int numTerms){
        if(x > 2 * Math.PI) {
            x = x - 2 * Math.PI * Math.floor(x / (2 * Math.PI));
        }
        double sin = x;
        double nextNum = x;
        for(int i = 2; i <= numTerms; i++) {
            nextNum = nextNum * (-1) * (x * x) / (2 * i - 1) / (2 * i - 2);
            sin += nextNum;
        }
        return sin;
    }
    public static double cos(double x, int numTerms){
        if(x > 2 * Math.PI) {
            x = x - 2 * Math.PI * Math.floor(x / (2 * Math.PI));
        }
        double cos = 1;
        double nextNum = 1;
        int sign = -1;
        for (int i = 2; i < numTerms; i+=2){
            nextNum *= x * x / i / (i - 1);
            cos += sign * nextNum ;
            sign *= -1;
        }
        return cos;
    }
    public static void testTrigonometric(){
        System.out.print("Enter the angle measurements (radian): ");
        double x = sc.nextDouble();
        System.out.print("Enter the number term (positive integer): ");
        int numTerm = sc.nextInt();
        System.out.print("Sin of method: ");
        System.out.println(sin(x, numTerm));
        System.out.print("Sin of library Math: ");
        System.out.println(Math.sin(x));
        System.out.print("Cos of method: ");
        System.out.println(cos(x, numTerm));
        System.out.print("Cos of library Math: ");
        System.out.println(Math.cos(x));
    }
    public static double specialSeries(double x, int numTerms){
        double sum = x;
        double Sk = x;

        for(int i=1; i<= numTerms; i++){
            Sk *= (x*x*(2*i-1)*(2*i-1))/(2*i*(2*i+1));
            sum+=Sk;
        }
        return sum;
    }

    public static void testSpecialSeries(){
        System.out.print("Enter x value: ");
        double x = sc.nextDouble();
        System.out.print("Enter numTerms value: ");
        int numTerms = sc.nextInt();
        System.out.println("The sum of the series is: " + specialSeries(x, numTerms));
    }
    public static void factorialInt(int num){
        final int MAX_VALUE = Integer.MAX_VALUE;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            if (factorial < (double) (MAX_VALUE / i)) {
                factorial *= i;
                System.out.println("The factorial of " + i + " is " + factorial);
            } else {
                System.out.println("The factorial of " + i + " is out of range");
            }
        }
    }
    public static void factorialLong(int num){
        final long MAX_VALUE = Long.MAX_VALUE;
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            if (factorial < (double) (MAX_VALUE / i)) {
                factorial *= i;
                System.out.println("The factorial of " + i + " is " + factorial);
            } else {
                System.out.println("The factorial of " + i + " is out of range");
            }
        }
    }
    public static void testFactorial(){
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        factorialInt(num);
        //factorialLong(num);
    }
    public static void fibonacciInt(int num){
        final int MAX_VALUE = Integer.MAX_VALUE;
        int fibo[] = new int[num];
        fibo[0] = 1; fibo[1] = 1;
        System.out.println("F(0) = 1 \nF(1) = 1");
        for (int i = 2; i < num; i++){
            if (fibo[i-2] < MAX_VALUE - fibo[i-1]){
                fibo[i] = fibo[i-1] + fibo[i-2];
                System.out.println("F(" + i + ") = " + fibo[i]);
            } else {
                System.out.println("F(" + i + ") is out of range of int");
            }
        }
    }
    public static void testFibonacci(){
        System.out.print("Enter the number of fibonanci: ");
        int num = sc.nextInt();
        fibonacciInt(num);
    }
    public static String toRadix(String in, int inRadix, int outRadix){
        int base10 = 0;
        int power = 0;
        // Convert inRadix number system to decimal number system
        for (int i = in.length() - 1; i >= 0; i--){
            char digits = in.charAt(i);
            int value;
            if (digits >= '0' && digits <= '9'){
                value = digits - '0';
            } else {
                value = digits - 'A' + 10;
            }
            base10 += value * Math.pow(inRadix, power);
            power++;
        }
        String numBaseRadix = "";
        // Convert decimal number system to outRadix number system
        while (base10 > 0){
            int number = base10 % outRadix;
            char charNum;
            if (number < 10)
                charNum = (char) (number + '0');
            else
                charNum = (char) (number + 'A' - 10);
            numBaseRadix = charNum + numBaseRadix;
            base10 /= outRadix;
        }
        return numBaseRadix;
    }
    public static void testNumberConversion(){
        System.out.print("Enter a number and radix: ");
        String in = sc.next();
        System.out.print("Enter the input radix: ");
        int inRadix = sc.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = sc.nextInt();
        System.out.println("\"" + in + "\" in radix " + inRadix + " is \"" + toRadix(in, inRadix, outRadix) + "\" in radix " + outRadix);
    }
}
