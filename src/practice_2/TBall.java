package practice_2;

public class TBall {
    // variables
    private double x;
    private double y;

    // constructors
    public TBall(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public TBall() {
        x = 0.0;
        y = 0.0;
    }

    // setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // other
    @Override
    public String toString() {
        return "Ball @ (" + x + ", " + y + ")";
    }

    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }
}
