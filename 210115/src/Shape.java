abstract class Shape {
    Point p;
    Shape() {
        this(new Point(0,0));
    }
    Shape(Point p) {
        this.p = p;
    }
    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
    Point getPosition() {
        return p;
    }
    void setPosition(Point p) {
        this.p = p;
    }
}
class Point {
    int x;
    int y;
    Point() {
        this(0,0);
    }
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public String toString() {
        return "["+x+","+y+"]";
    }
}

class Circle extends Shape{
    double r;

    Circle(double r){
        this.r = r;
    }

    @Override
    double calcArea() {
        return r*r*3.14;
    }
}

class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    boolean isSquare() {
        return width == height;
    }

    @Override
    double calcArea(){
        return width*height;
    }

    @Override
    public boolean equals(Object obj) {
        obj = (Rectangle)obj;

        return ((Rectangle) obj).width == this.width;
    }

}

