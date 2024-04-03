package hus.oop.lab7.resizable;

public class ResizebleCircle extends Circle implements Resizable {
    public ResizebleCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[" +
                super.toString() +
                ']';
    }

    @Override
    public void resize(int percent) {
        super.radius *= percent / 100.0;
    }
}
