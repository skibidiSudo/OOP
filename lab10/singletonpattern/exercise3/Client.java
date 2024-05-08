package hus.oop.lab10.singletonpattern.exercise3;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Ball> balls = new LinkedList<>();

        //Ball ball1 = new Ball("Red"); Error
        Ball ball1 = Ball.getInstance("Red");
        Ball ball2 = Ball.getInstance("Blue"); //ball2 color red.
        balls.add(ball1);
        balls.add(ball2);

        for (Ball ball : balls){
            System.out.println(ball.getColor());
            ball.bounce();
        }
    }
}
