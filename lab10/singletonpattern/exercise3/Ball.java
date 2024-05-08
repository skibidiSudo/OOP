package hus.oop.lab10.singletonpattern.exercise3;

public class Ball {
    private static Ball ball;
    private String color;

    private Ball(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void bounce() {
        System.out.println("Boingg!");
    }

    public static Ball getInstance(String color) {
        if (ball == null) {
            ball = new Ball(color);
        }
        return ball;
    }
}
