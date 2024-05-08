package hus.oop.lab10.strategypattern.exercise3;

public class SortStrategy {
    private static SortStrategy instance;
    private Sort sortee;
    private SortStrategy() {

    }

    public static SortStrategy getInstance() {
        if (instance == null) {
            instance = new SortStrategy();
        }
        return instance;
    }

    public void setSortee(Sort sortee) {
        this.sortee = sortee;
    }

    public int[] sort(int[] data) {
        return sortee.sort(data);
    }
}
