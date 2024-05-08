package hus.oop.lab10.strategypattern.exercise3;

public class InsertionSort implements Sort{
    public InsertionSort() {

    }

    @Override
    public int[] sort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int key = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > key) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = key;
        }
        return ar;
    }
}
