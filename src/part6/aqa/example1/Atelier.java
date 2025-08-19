package part6.aqa.example1;

import java.util.ArrayList;

public class Atelier {

    public void toDressMan (ArrayList<Clothes> clothesForMan) {
        System.out.println("Мужская одежда");
        clothesForMan.forEach(clothe -> System.out.println(clothe.toString()));
    }

    public void toDressWoman (ArrayList<Clothes> clothesForWoman) {
        System.out.println("Женсккая одежда");
        clothesForWoman.forEach(clothe -> System.out.println(clothe.toString()));
    }
}
