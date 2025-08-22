package part8.aqa.example1.singleton;

public class Main {
    public static void main(String[] args) {

        Earth singleton = Earth.getInstance("FOO");
        Earth anotherSingleton = Earth.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
