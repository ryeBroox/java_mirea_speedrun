package practice_3;

public abstract class Shape {

    protected String color = "white";
    protected boolean filled = true;

    public Shape() {}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString() {
        return "The shape is " + color + "-colored and filled(" + filled + ")";
    }

    abstract double getArea();

    abstract double getPerimeter();
}

