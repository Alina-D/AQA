package part6.aqa.example1;

public class Skirt extends Clothes implements WomenClothing{
    public String name;
    public Skirt(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская юбка надета");
    }
}
