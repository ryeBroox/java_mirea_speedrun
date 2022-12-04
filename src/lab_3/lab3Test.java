package lab_3;

public class lab3Test {

    public static void main(String[] args) {
        furnitureShop shop = new furnitureShop("FurnituraLegend");
        shop.setElem(new Chair(), 1);
        shop.setElem(new Sofa(), 2);
        shop.getInfo(1);
        shop.getInfo(2);
    }

}
