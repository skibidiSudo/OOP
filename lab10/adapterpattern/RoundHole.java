package hus.oop.lab10.adapterpattern;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg){
        return this.radius >= peg.getRadius();
    }
}
