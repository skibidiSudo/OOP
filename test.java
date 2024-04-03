import java.util.Scanner;

public class test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        testBoxPattern();
    }
    public static void boxPatternA(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                if (row == 1 || row == size || col == 1 || col == size)
                    System.out.print("# ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void testBoxPattern(){
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        boxPatternA(size);
    }
}
