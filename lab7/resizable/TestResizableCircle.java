package hus.oop.lab7.resizable;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizebleCircle circle = new ResizebleCircle(5.0);
        System.out.println("Before resizing: " + circle.toString());
        circle.resize(50);
        System.out.println("After resizing: " + circle.toString());
    }
}
