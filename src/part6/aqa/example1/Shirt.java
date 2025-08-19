package part6.aqa.example1;

public class Shirt extends Clothes implements MenClothing, WomenClothing{

    public Shirt(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка надета");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка надета");
    }
}
