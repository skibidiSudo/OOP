package hus.oop.lab7.movablerectangle;

public class MovableRectangle implements Movable {
    private MovablePoint topleft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topleft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() {
        return "[" + topleft.toString() + "], " + "[" + bottomRight.toString() + "]";
    }

    @Override
    public void moveUp() {
        topleft.y -= topleft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topleft.y += topleft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topleft.x -= topleft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topleft.x += topleft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
}
