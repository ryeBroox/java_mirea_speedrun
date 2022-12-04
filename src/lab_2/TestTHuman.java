package lab_2;

public class TestTHuman {
    public static void main(String[] args) {
        THuman Human = new THuman();
        Human.getState();
        Human.setLegInjured(true);
        Human.getState();
    }
}
