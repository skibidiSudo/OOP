package hus.oop.lab10.strategypattern.exercise3;

public class App {
    public static void main(String[] args) {
        SortStrategy strategy = SortStrategy.getInstance();

        int[] ar = {1, -5, 4, 0, -12, -123, 43, 534};
        System.out.print("Before sort: ");
        printAr(ar);

        strategy.setSortee(new BubbleSort());
        System.out.print("Sort by BubbleSort: ");
        printAr(strategy.sort(ar.clone()));

        strategy.setSortee(new InsertionSort());
        System.out.print("Sort by InsertionSort: ");
        printAr(strategy.sort(ar.clone()));

        strategy.setSortee(new SelectionSort());
        System.out.print("Sort by SelectionSort: ");
        printAr(strategy.sort(ar.clone()));

    }

    public static void printAr(int[] ar){
        for (int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}
