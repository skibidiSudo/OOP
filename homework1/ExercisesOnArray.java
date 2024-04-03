package hus.oop.homework1;

import java.util.Scanner;

public class ExercisesOnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //printArrayStars(sc);
        testMatrix(sc);
    }
    public static void printArrayStars(Scanner sc){
        final int NUM_ITEMS;
        int items[];
        System.out.print("Enter the number of items: ");
        int numItem = sc.nextInt();
        while (numItem <= 0){
            System.out.println("Please enter a non-negative integer");
            System.out.print("Enter the number of items: ");
            numItem = sc.nextInt();
        }
        NUM_ITEMS = numItem;
        items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < items.length; i++)
            items[i] = sc.nextInt();
        for (int idx = 0; idx < items.length; idx++){
            System.out.print(idx + ": ");
            for (int starNo = 0; starNo < items[idx]; starNo++)
                System.out.print("*");
            System.out.println("(" + items[idx] + ")");
        }
    }
    public static void print(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] arr1, int[][] arr2) {
        return (arr1.length == arr2.length && arr1[0].length == arr2[0].length);
    }

    public static boolean haveSameDimension(double[][] arr1, double[][] arr2) {
        return (arr1.length == arr2.length && arr1[0].length == arr2[0].length);
    }

    public static int[][] add(int[][] arr1, int[][] arr2) {
        if(!haveSameDimension(arr1, arr2)) return null;

        final int NUM_ROWS = arr1.length;
        final int NUM_COLS = arr1[0].length;

        int arr[][] = new int[NUM_ROWS][NUM_COLS];
        for(int i = 0; i < NUM_ROWS; i++) {
            for(int j = 0; j < NUM_COLS; j++) {
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr;
    }

    public static double[][] add(double[][] arr1, double[][] arr2) {
        if(!haveSameDimension(arr1, arr2)) return null;

        final int NUM_ROWS = arr1.length;
        final int NUM_COLS = arr1[0].length;

        double[][] arr = new double[NUM_ROWS][NUM_COLS];
        for(int i = 0; i < NUM_ROWS; i++) {
            for(int j = 0; j < NUM_COLS; j++) {
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr;
    }

    public static int[][] subtract(int[][] arr1, int[][] arr2) {
        if(!haveSameDimension(arr1, arr2)) return null;

        final int NUM_ROWS = arr1.length;
        final int NUM_COLS = arr1[0].length;

        int arr[][] = new int[NUM_ROWS][NUM_COLS];
        for(int i = 0; i < NUM_ROWS; i++) {
            for(int j = 0; j < NUM_COLS; j++) {
                arr[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        return arr;
    }

    public static double[][] subtract(double[][] arr1, double[][] arr2) {
        if(!haveSameDimension(arr1, arr2)) return null;

        final int NUM_ROWS = arr1.length;
        final int NUM_COLS = arr1[0].length;

        double arr[][] = new double[NUM_ROWS][NUM_COLS];
        for(int i = 0; i < NUM_ROWS; i++) {
            for(int j = 0; j < NUM_COLS; j++) {
                arr[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        return arr;
    }

    public static int multipleRowCol(int x, int y, int[][] arr1, int[][] arr2) {
        int[] arr1Row = arr1[x];
        int[] arr2Col = new int[arr2.length];
        for(int i = 0; i < arr2.length; i++) {
            arr2Col[i] = arr2[i][y];
        }

        int calculateSum = 0;
        for(int i = 0; i < arr2.length; i++) {
            calculateSum += (arr1Row[i] * arr2Col[i]);
        }
        return calculateSum;
    }

    public static double multipleRowCol(int x, int y, double[][] arr1, double[][] arr2) {
        double[] arr1Row = arr1[x];
        double[] arr2Col = new double[arr2.length];
        for(int i = 0; i < arr2.length; i++) {
            arr2Col[i] = arr2[i][y];
        }

        double calculateSum = 0;
        for(int i = 0; i < arr2.length; i++) {
            calculateSum += (arr1Row[i] * arr2Col[i]);
        }
        return calculateSum;
    }

    public static int[][] multiply(int[][] arr1, int[][] arr2) {
        if(arr1[0].length != arr2.length) return null;

        int arr[][] = new int[arr1.length][arr2[0].length];

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2[0].length; j++) {
                arr[i][j] = multipleRowCol(i, j, arr1, arr2);
            }
        }
        return arr;
    }

    public static double[][] multiply(double[][] arr1, double[][] arr2) {
        if(arr1[0].length != arr2.length) return null;

        double arr[][] = new double[arr1.length][arr2[0].length];

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2[0].length; j++) {
                arr[i][j] = multipleRowCol(i, j, arr1, arr2);
            }
        }
        return arr;
    }

    public static void testMatrix(Scanner sc) {
        System.out.print("Enter the row of array 1: ");
        int row1 = sc.nextInt();
        System.out.print("Enter the column of array 1: ");
        int col1 = sc.nextInt();
        double[][] arr1 = new double[row1][col1];
        System.out.print("Enter the element of array 1: ");
        for (int i = 0; i < row1; i++)
            for (int j = 0; j < col1; j++)
                arr1[i][j] = sc.nextDouble();
        System.out.print("Enter the row of array 2: ");
        int row2 = sc.nextInt();
        System.out.print("Enter the column of array 2: ");
        int col2 = sc.nextInt();
        double[][] arr2 = new double[row2][col2];
        System.out.print("Enter the element of array 2: ");
        for (int i = 0; i < row2; i++)
            for (int j = 0; j < col2; j++)
                arr2[i][j] = sc.nextDouble();
        if (row1 != row2 || col2 != col1)
            System.out.println("Can not add or subtract two matrices");
        else {
            System.out.println("Array 1 add array 2");
            print(add(arr1, arr2));
            System.out.println("Array 1 subtract array 2");
            print(subtract(arr1, arr2));
        }
        if (col1 != row2)
            System.out.println("Can not multiply two matrices");
        else {
            System.out.println("Array 1 multiply array 2");
            print(multiply(arr1, arr2));
        }
    }
}
