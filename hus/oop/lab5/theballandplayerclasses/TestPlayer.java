package hus.oop.lab5.theballandplayerclasses;

public class TestPlayer {
    public static void main(String[] args) {
        Player player = new Player(10, 20.0f, 30.0f);
        System.out.println("Player Number: " + player.number);
        System.out.println("Initial Position (x, y, z): (" + player.x + ", " + player.y + ", " + player.z + ")");
        player.move(5.0f, -3.0f);
        System.out.println("New Position after movement (x, y, z): (" + player.x + ", " + player.y + ", " + player.z + ")");
        player.jump(10.0f);
        System.out.println("New Position after jumping (x, y, z): (" + player.x + ", " + player.y + ", " + player.z + ")");
        player.setXYZ(player.x, player.y, 0.0f);
        Ball ball = new Ball(100.0f, 350.0f, 0.0f);
        while (!player.near(ball)) {
            System.out.println("Player run to the ball");
            player.move((ball.getX() - player.x) / 5, (ball.getY() - player.y) / 5);
            System.out.println("New Position after run (x, y, z): (" + player.x + ", " + player.y + ", " + player.z + ")");
        }
        System.out.println("Kicking the ball...");
        player.kick(ball);
        System.out.println("New Position of the ball after kick (x, y, z): (" + ball.getX() + ", " + ball.getY() + ", " + ball.getZ() + ")");
    }
}
