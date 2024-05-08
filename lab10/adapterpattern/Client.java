package hus.oop.lab10.adapterpattern;

public class Client {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println(hole.fits(roundPeg));

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);
        //System.out.println(hole.fits(smallSquarePeg)); Error


        RoundPeg smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        RoundPeg largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        System.out.println(hole.fits(smallSquarePegAdapter));
        System.out.println(hole.fits(largeSquarePegAdapter));
    }
}
