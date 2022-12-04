package practice_3;

public class Square extends Rectangle{
    public Square() {}

    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    public Square(double side, String color, boolean filled) {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public double getSide() {
        return width;
    }

    @Override
    public String toString() {
        return "It is " + color + " square " + "it is filled(" + filled + ") its area is " + this.getArea() + " its perimeter is " + this.getPerimeter();
    }
}
