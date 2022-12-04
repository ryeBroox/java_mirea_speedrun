package lab_3;

public class furnitureShop {
    private String name = "shop";

    public furniture[] showcase = new furniture[10];

    public void setElem(furniture elem, int number) {
        showcase[number] = elem;
    }

    public void getInfo () {
        System.out.println("shop " + name + "tou can buy: " + showcase);
    }

    public void getInfo (int number) {
        System.out.println("place " + number + ": " + showcase[number]);
    }
    public furnitureShop(String name) {
        this.name = name;
    }

}
