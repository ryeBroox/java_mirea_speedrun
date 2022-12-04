package lab_3;

abstract public class furniture {
    private int invNumber = 0;

    private String color = "white";

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setInvNumber(int invNumber) {
        this.invNumber = invNumber;
    }

    public int getInvNumber() {
        return invNumber;
    }

    public furniture() {}

    public furniture(int number) {
        invNumber = number;
    }
}
