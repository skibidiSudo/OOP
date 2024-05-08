package hus.oop.lab10.strategypattern.exercise3;

public class SelectionSort implements Sort{
    public SelectionSort() {
    }

    @Override
    public int[] sort(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = ar[i];
                ar[i] = ar[minIndex];
                ar[minIndex] = temp;
            }
        }
        return ar;
    }
}
