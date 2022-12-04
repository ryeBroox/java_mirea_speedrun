package lab_1;

public class TestTaskL1 {
    public static void main(String[] args) {
        TaskL1 a = new TaskL1(10);
        TaskL1 b = new TaskL1(20);
        a.setN(0);
        a.Forloop();
        a.Whileloop();
        a.DoWhileloop();
        b.Forloop();
        b.Whileloop();
        b.DoWhileloop();
    }
}
