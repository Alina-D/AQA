package part6.aqa.example1;

public class Tie extends Clothes implements MenClothing {

    public Tie(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужской галстук надет");
    }
}
