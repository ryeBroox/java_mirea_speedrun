package practice_3;

public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle() {};

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.color = color;
        this.radius = radius;
        this.filled = filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "It is " + color + " circle " + "it is filled(" + filled + ") its area is " + this.getArea() + " its perimeter is " + this.getPerimeter();
    }
}
