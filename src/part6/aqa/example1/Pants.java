package part6.aqa.example1;

public class Pants extends Clothes implements MenClothing, WomenClothing {

    public Pants(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны надеты");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны надеты");
    }
}
