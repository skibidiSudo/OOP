package hus.oop.lab5.biginteger;
import java.math.BigInteger;
public class TestBigInterger {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger num2 = new BigInteger("22222222222222222222222222222222222222222222222222");
        BigInteger add = num1.add(num2);
        BigInteger multiply = num1.multiply(num2);
        System.out.println("sum of two numbers: " + add);
        System.out.println("product of two numbers: " + multiply);
    }
}
