package hus.oop.lab11.visitorpattern.exercise1;

public class DesignPatternBook implements ProgramingBook {
    private String recourse;
    private String bestSeller;

    public DesignPatternBook(String bestSeller, String resource) {
        this.recourse = resource;
        this.bestSeller = bestSeller;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return recourse;
    }

    public String getBestSeller() {
        return bestSeller;
    }
}
