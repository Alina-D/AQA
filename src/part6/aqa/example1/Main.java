package part6.aqa.example1;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(Size.L.getDescription());
        System.out.println(Size.L.getEuroSize());


        ArrayList<Clothes> clothesForMan = new ArrayList<>();
        clothesForMan.add(new Shirt(Size.L.getEuroSize(), 1000, "синий"));
        clothesForMan.add(new Pants(Size.M.getEuroSize(), 1500, "голубой"));
        clothesForMan.add(new Tie(Size.L.getEuroSize(), 110, "черный"));

        ArrayList<Clothes> clothesForWoman = new ArrayList<>();
        clothesForWoman.add(new Shirt(Size.S.getEuroSize(), 1000, "красный"));
        clothesForWoman.add(new Pants(Size.M.getEuroSize(), 1500, "розовый"));
        clothesForWoman.add(new Skirt(Size.L.getEuroSize(),549, "фиолетовый"));

        Atelier atelier = new Atelier();
        atelier.toDressMan(clothesForMan);
        atelier.toDressWoman(clothesForWoman);

    }
}
