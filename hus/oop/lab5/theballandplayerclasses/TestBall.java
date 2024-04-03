package hus.oop.lab5.theballandplayerclasses;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1, 2, 3);
        System.out.println(ball);
        ball.setXYZ(4, 5, 6);
        System.out.println(ball);
    }
}
