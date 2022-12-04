package practice_3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    @Override
    public double getArea(){
        return length * width;
    }
    @Override
    public double getPerimeter(){
        return 2*(length + width);
    }
    @Override
    public String toString() {
        return "It is " + color + " rectangle " + "it is filled(" + filled + ") its area is " + this.getArea() + " its perimeter is " + this.getPerimeter();
    }
}
