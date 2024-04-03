package hus.oop.homework1;

import java.util.Scanner;

public class NestedLoopsExercise {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //testSquarePanttern();
        //testCheckerPanttern();
        //testTimeTable();
        //testTriangularPattern();
        testBoxPattern();
        //testHillPattern();
    }
    public static void squarePantternByFor(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                System.out.print("# ");
            System.out.println();
        }
    }
    public static void squarePatternByWhile(int size) {
        int row = 1;
        while (row <= size) {
            int col = 1;
            while (col <= size) {
                System.out.print("# ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
    public static void testSquarePanttern(){
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        while (size <= 0){
            System.out.println("Please enter a positive integer!");
            System.out.print("Enter the size: ");
            size = sc.nextInt();
        }
        //squarePantternByFor(size);
        squarePatternByWhile(size);
    }
    public static void checkerPattern(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row % 2 == 1){
                    System.out.print("# ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }
    public static void testCheckerPanttern(){
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        while (size <= 0){
            System.out.println("Please enter a positive integer!");
            System.out.print("Enter the size: ");
            size = sc.nextInt();
        }
        checkerPattern(size);
    }
    public static void timeTable(int n) {
        String firstCell = "*";
        System.out.printf("%4s |", firstCell);
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        String dash = "---";
        for (int i = 0; i < n; i++)
            dash+="----";
        System.out.printf("\n   %4s\n", dash);

        for (int row = 1; row <= n; row++) {
            System.out.printf("%4d |", row);
            for (int col = 1; col <= n; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }

    public static void testTimeTable() {
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        while (size <= 0){
            System.out.println("Please enter a positive integer!");
            System.out.print("Enter the size: ");
            size = sc.nextInt();
        }
        timeTable(size);
    }
    public static void triangularPatternA(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++)
                System.out.print("#  ");
            System.out.println();
        }
    }
    public static void triangularPatternB(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = row; col <= size; col++)
                System.out.print("#  ");
            System.out.println();
        }
    }
    public static void triangularPatternC(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++){
                if (col < row)
                    System.out.print("   ");
                else
                    System.out.print("#  ");
            }
            System.out.println();
        }
    }
    public static void triangularPatternD(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col > size - row)
                    System.out.print("#  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void testTriangularPattern(){
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        triangularPatternA(size);
        System.out.println();
        triangularPatternB(size);
        System.out.println();
        triangularPatternC(size);
        System.out.println();
        triangularPatternD(size);
    }
    public static void boxPatternA(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == 1 || col == size)
                    System.out.print("#  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void boxPatternB(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == row)
                    System.out.print("#  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void boxPatternC(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == size - row + 1)
                    System.out.print("#  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void boxPatternD(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == size - row + 1 || col == row)
                    System.out.print("#  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void testBoxPattern(){
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        boxPatternA(size);
        System.out.println();
        boxPatternB(size);
        System.out.println();
        boxPatternC(size);
        System.out.println();
        boxPatternD(size);
    }
    public static void hillPatternA(int rows){
        for (int row = 1; row <= rows; row++){
            for (int col = 1; col <= 2*rows-1; col++){
                if (col <= rows+row-1 && col >= rows-row+1)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void hillPatternB(int rows){
        for (int row = 1; row <= rows; row++){
            for (int col = 1; col <= 2*rows-1; col++){
                if (col <= 2*rows-row && col >= row)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void hillPatternC(int rows){
        for (int row = 1; row <= 2*rows-1; row++){
            for (int col = 1; col <= 2*rows-1; col++){
                if (row < rows){
                    if (col <= rows+row-1 && col >= rows-row+1)
                        System.out.print("# ");
                    else
                        System.out.print("  ");
                } else if (row == rows) {
                    System.out.print("# ");
                } else {
                    if (col > row-rows && col <= 3*rows-row-1)
                        System.out.print("# ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void hillPatternD(int rows){
        for (int row = 1; row <= 2*rows-1; row++){
            for (int col = 1; col <= 2*rows-1; col++){
                if (row < rows){
                    if (col < rows+row-1 && col > rows-row+1)
                        System.out.print("  ");
                    else
                        System.out.print("# ");
                } else if (row == rows) {
                    if (col == 1 || col == 2*rows-1)
                        System.out.print("# ");
                    else
                        System.out.print("  ");
                } else {
                    if (col > row-rows+1 && col < 3*rows-row-1)
                        System.out.print("  ");
                    else
                        System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
    public static void testHillPattern(){
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
        hillPatternA(rows);
        System.out.println();
        hillPatternB(rows);
        System.out.println();
        hillPatternC(rows);
        System.out.println();
        hillPatternD(rows);
    }
}
