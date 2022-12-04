package lab_3;

public class Sofa extends furniture {
    private  boolean firstVacant = true;
    private  boolean secondVacant = true;

    public void sitDown() {
        if (firstVacant) {
            System.out.println("you sat down");
        } else  if (secondVacant) {
            System.out.println("you sat down");
        } else {
            System.out.println("no place to sit down");
        }
    }

    public void standUp(int place) {
        if (place == 0) {
            if (firstVacant) {
                System.out.println("there was no one");
            } else {
                firstVacant = true;
                System.out.println("first place is now vacant");
            }
        }
        if (place == 1) {
            if (secondVacant) {
                System.out.println("there was no one");
            } else {
                secondVacant = true;
                System.out.println("second place is now vacant");
            }
        }
    }

    @Override
    public String toString() {
        return "This is Sofa, you can lie on it";
    }


}
