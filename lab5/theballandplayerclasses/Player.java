package hus.oop.lab5.theballandplayerclasses;

public class Player {
    protected int number;
    protected float x, y, z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Ball ball) {
        float xBall = ball.getX(), yBall = ball.getY(), zBall = ball.getZ();
        float distance = (float) Math.sqrt((x - xBall) * (x - xBall) + (y - yBall) * (y - yBall) + (z - zBall) * (z - zBall));
        return distance < 8;
    }

    public void kick(Ball ball) {
        if (near(ball)) {
            float newZBall = ball.getZ() + 20;
            float newXBall = ball.getX() + 50;
            float newYBall = ball.getY() + 40;
            ball.setXYZ(newXBall, newYBall, newZBall);
        }
    }
}
