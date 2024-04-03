package hus.oop.lab4.themytriangleandmypointclasses;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public String toString(){
        return "MyTriangle[v1=" + v1.toString() +
                ",v2=" + v2.toString() +
                ",v3=" + v3.toString() + "]";
    }
    public double getPerimeter(){
        double edge1 = v1.distance(v2);
        double edge2 = v1.distance(v3);
        double edge3 = v2.distance(v3);
        return edge1 + edge2 + edge3;
    }
    public String getType(){
        double edge1 = v1.distance(v2);
        double edge2 = v1.distance(v3);
        double edge3 = v2.distance(v3);
        if ((edge3 == edge1) && (edge3 == edge2) && (edge1 == edge2)){
            return "Equilateral";
        } else if ((edge3 == edge1) || (edge3 == edge2) || (edge1 == edge2)){
            return "Isosceles";
        }
        return "Scalene";
    }
}
