package hus.oop.lab2;

import java.util.Scanner;

public class MethodExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        testExponent(sc);
        //testMagicSum(sc);
        //testPrint(sc);
        //testArrayToString(sc);
        //testContains(sc);
        //testSearch(sc);
        //testEquals(sc);
        //testCopyOf(sc);
        //testSwap(sc);
        //testReserve(sc);
    }
    public static void testExponent(Scanner sc){
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exp: ");
        int exp = sc.nextInt();
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }
    public static int exponent(int base, int exp){
        int product = 1;
        for (int i=0;i<exp;i++)
            product*=base;
        return product;
    }

    public static boolean hasEight(int number){
        while (number > 0){
            int lastdigit = number%10;
            if (lastdigit == 8)
                return true;
            number/=10;
        }
        return false;
    }

    public static void testMagicSum(Scanner sc){
        final int SENTINEL = -1;
        int magicsum = 0;
        System.out.print("Enter a positive integer (or -1 to end): ");
        int num = sc.nextInt();
        while (num != SENTINEL){
            if (hasEight(num))
                magicsum+=num;
            System.out.print("Enter a positive integer (or -1 to end): ");
            num = sc.nextInt();
        }
        System.out.print("The magic sum is: " + magicsum);
    }

    public static void print(int[] arr){
        System.out.print("[");
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1)
                    System.out.print(arr[i] + "]");
                else
                    System.out.print(arr[i] + ",");
            }
        } else
            System.out.print("]");
    }
    public static void print(float[] arr) {
        System.out.print("[");
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1)
                    System.out.print(arr[i] + "]");
                else
                    System.out.print(arr[i] + ",");
            }
        } else
            System.out.print("]");
    }
    public static void print(double[] arr) {
        System.out.print("[");
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1)
                    System.out.print(arr[i] + "]");
                else
                    System.out.print(arr[i] + ",");
            }
        } else
            System.out.print("]");
    }

    public static void testPrint(Scanner sc){
        System.out.print("Enter the array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        //double arr[] = new double[n];
        //float arr[] = new float[n];
        if (n > 0) {
            System.out.print("Enter the elements of array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                //arr[i] = sc.nextDouble();
                //arr[i] = sc.nextFloat();
            }
        }
        System.out.print("Array: ");
        print(arr);
    }

    public static String arrayToString(int[] arr){
        String s = "[";
        if (arr.length == 0)
            return "[]";
        else {
            for (int i=0;i<arr.length;i++) {
                if (i == arr.length - 1)
                    s += arr[i] + "]";
                else
                    s += arr[i] + ",";
            }
        }
        return s;
    }
    public static void testArrayToString(Scanner sc){
        System.out.print("Enter the array length: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        if (length > 0) {
            System.out.print("Enter the elements of array: ");
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.print("ArrayToString: " + arrayToString(arr));
    }
    public static boolean contains(int[] array, int key){
        for (int i=0;i<array.length;i++)
            if (array[i] == key)
                return true;
        return false;
    }
    public static void testContains(Scanner sc){
        System.out.print("Enter the array length: ");
        int length =  sc.nextInt();
        int array[] = new int[length];
        if (length == 0) {
            System.out.print("Enter the key value: ");
            int key = sc.nextInt();
            System.out.print("Not found the value");
        }
        else {
            System.out.print("Enter the elements of array: ");
            for (int i=0;i<length;i++)
                array[i] = sc.nextInt();
            System.out.print("Enter the key value: ");
            int key = sc.nextInt();
            if (contains(array, key))
                System.out.print("Found the value");
            else
                System.out.print("Not found the value");
        }
    }
    public static int search(int[] array, int key){
        for (int i=0;i<array.length;i++)
            if (array[i] == key)
                return i;
        return -1;
    }
    public static void testSearch(Scanner sc){
        System.out.print("Enter the array length: ");
        int length =  sc.nextInt();
        int array[] = new int[length];
        if (length == 0) {
            System.out.print("Enter the key value: ");
            int key = sc.nextInt();
            System.out.print("Not found the value");
        }
        else {
            System.out.print("Enter the elements of array: ");
            for (int i=0;i<length;i++)
                array[i] = sc.nextInt();
            System.out.print("Enter the key value: ");
            int key = sc.nextInt();
            if (search(array, key) != -1)
                System.out.print("Index of value in array is: " + search(array, key));
            else
                System.out.print("Not found the value");
        }
    }
    public static boolean equals(int[] array1, int[] array2){
        for (int i=0;i<array1.length;i++)
            if (array1[i] != array2[i])
                return false;
        return true;
    }
    public static void testEquals(Scanner sc){
        System.out.print("Enter the lengh of array 1: ");
        int length1 = sc.nextInt();
        System.out.print("Enter the lengh of array 2: ");
        int length2 = sc.nextInt();
        int[] array1 = new int[length1];
        int[] array2 = new int[length2];
        if (length1 == length2 && length1 == 0)
            System.out.print("Array 1 equals array 2");
        else if (length1 != length2) {
            System.out.print("Array 1 not equals array 2");
        } else {
            System.out.print("Enter the elements of array 1: ");
            for (int i=0;i<length1;i++)
                array1[i] = sc.nextInt();
            System.out.print("Enter the elements of array 2: ");
            for (int i=0;i<length2;i++)
                array2[i] = sc.nextInt();
            if (equals(array1, array2))
                System.out.print("Array 1 equals array 2");
            else
                System.out.print("Array 1 not equals array 2");
        }
    }
    public static int[] copyOf(int[] arr){
        int newArray[] = new int[arr.length];
        for (int i=0;i< arr.length;i++)
            newArray[i] = arr[i];
        return newArray;
    }
    public static int[] copyOf(int[] arr, int newLength){
        int newArray[] = new int[newLength];
        for (int i=0;i<newLength;i++) {
            if (i<arr.length)
                newArray[i] = arr[i];
            else
                newArray[i] = 0;
        }
        return newArray;
    }
    public static void testCopyOf(Scanner sc){
        System.out.print("Enter the array length: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.print("Enter the length of copy array: ");
        int newLength = sc.nextInt();
        if (length >= 0 && newLength > 0) {
            if (length > 0) {
                System.out.print("Enter the elements of array: ");
                for (int i = 0; i < length; i++)
                    arr[i] = sc.nextInt();
                System.out.print("The elements of array: ");
                for (int i = 0; i < length; i++)
                    System.out.print(arr[i] + " ");
                System.out.println("");
            } else {
                System.out.print("The elements of array: Null\n");
            }
            //int copyArray[] = copyOf(arr);
            int copyArray[] = copyOf(arr, newLength);
            System.out.print("The elements of copy array: ");
            for (int i = 0; i < copyArray.length; i++)
                System.out.print(copyArray[i] + " ");
        }
        else
            System.out.print("The elements of array: Null \nThe element of copy array: Null");
    }
    public static boolean swap(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length)
            return false;
        else {
            for (int i=0;i<arr1.length;i++){
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        }
        return true;
    }
    public static void testSwap(Scanner sc){
        System.out.print("Enter the length of array 1: ");
        int length1 = sc.nextInt();
        int arr1[] = new int[length1];
        System.out.print("Enter the length of array 2: ");
        int length2 = sc.nextInt();
        int arr2[] = new int[length2];
        if (length1 == 0 && length2 == 0)
            System.out.println("Two empty arrays");
        else {
            if (length1 != 0) {
                System.out.print("Enter the elements of array 1: ");
                for (int i = 0; i < length1; i++)
                    arr1[i] = sc.nextInt();
            }
            if (length2 != 0) {
                System.out.print("Enter the elements of array 2: ");
                for (int i = 0; i < length2; i++)
                    arr2[i] = sc.nextInt();
            }
            if (swap(arr1, arr2)){
                System.out.print("The elements of array 1 after swap: ");
                for (int i=0;i<length1;i++)
                    System.out.print(arr1[i]+" ");
                System.out.println("");
                System.out.print("The elements of array 2 after swap: ");
                for (int i=0;i<length2;i++)
                    System.out.print(arr2[i]+" ");
            } else {
                System.out.print("Cannot change the elements of the two arrays");
            }
        }
    }
    public static void reserve(int[] array){
        for (int firstI = 0, lastI = array.length - 1; firstI < lastI ; firstI++){
            int temp = array[firstI];
            array[firstI] = array[lastI];
            array[lastI] = temp;
            lastI--;
        }
        System.out.print("The elements of array after reserve: ");
        for (int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
    }
    public static void testReserve(Scanner sc){
        System.out.print("Enter the length of array: ");
        int length = sc.nextInt();
        if (length == 0)
            System.out.println("Array is Null");
        else {
            int array[] = new int[length];
            System.out.print("Enter the elements of array: ");
            for (int i = 0; i < length; i++)
                array[i] = sc.nextInt();
            reserve(array);
        }
    }
}

