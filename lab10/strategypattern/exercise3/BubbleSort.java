package hus.oop.lab10.strategypattern.exercise3;

public class BubbleSort implements Sort{
    public BubbleSort() {

    }

    @Override
    public int[] sort(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length - i - 1; j++) {
                if (ar[j + 1] < ar[j]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        return ar;
    }
}
