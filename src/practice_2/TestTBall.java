package practice_2;

public class TestTBall {
    public static void main(String[] args) {
        TBall Ball = new TBall(10.0, 20.0);
        Ball.setXY(12.0, 20.0);
        System.out.println(Ball);
        Ball.move(2.0, 56.0);
        System.out.println(Ball);
    }
}
