package lab_4;

public class lab4Test {
    public static void main(String[] args) {
        Priceable obj1 = new Smartphone(52890.99);
        Priceable obj2 = new Laptop(234567.99);
        System.out.println("The price is " + obj1.getPrice());
        System.out.println("The price is " + obj2.getPrice());
    }
}
