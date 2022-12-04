package lab_4;

public class Smartphone implements Priceable{
    private double price = 0.0;
    public Smartphone(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
