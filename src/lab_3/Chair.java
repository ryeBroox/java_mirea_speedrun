package lab_3;

public class Chair extends furniture {
    private boolean vacant = true;

    public void sitDown() {
        if (vacant) {
            System.out.println("you sat down");
            vacant = false;
        } else {
            System.out.println("it is not vacant");
        }
    }

    public void standUp() {
        vacant = true;
        System.out.println("chair is now vacant");
    }

    @Override
    public String toString() {
        return "This is Chair, you can sit on it";
    }

}
