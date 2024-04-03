package hus.oop.lab6.pointandline;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    // toString method
    public String toString() {
        return "Line[" + super.toString() + ", " + end + "]";
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }

    public void setBegin(Point begin) {
        setX(begin.getX());
        setY(begin.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return getX();
    }

    public void setBeginX(int x) {
        setX(x);
    }

    public int getBeginY() {
        return getY();
    }

    public void setBeginY(int y) {
        setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setBeginXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public int getLength() {
        int xDiff = end.getX() - super.getX();
        int yDiff = end.getY() - super.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = end.getX() - super.getX();
        int yDiff = end.getY() - super.getY();
        return Math.atan2(yDiff, xDiff);
    }
}
