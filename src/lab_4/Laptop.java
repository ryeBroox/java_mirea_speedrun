package lab_4;

public class Laptop implements Priceable {
    private double price = 0.0;
    public Laptop(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

