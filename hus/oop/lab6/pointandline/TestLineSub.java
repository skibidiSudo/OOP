package hus.oop.lab6.pointandline;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub line1 = new LineSub(1, 2, 3, 4);
        System.out.println(line1);

        line1.setBeginX(5);
        line1.setBeginY(6);
        line1.setEndX(7);
        line1.setEndY(8);
        System.out.println(line1);
        line1.setBegin(new Point(9, 10));
        line1.setEnd(new Point(11, 12));
        System.out.println(line1);

        line1.setBeginXY(13, 14);
        line1.setEndXY(15, 16);
        System.out.println(line1);

        System.out.println("Length of line1: " + line1.getLength());
        System.out.println("Gradient of line1: " + line1.getGradient());
    }
}
