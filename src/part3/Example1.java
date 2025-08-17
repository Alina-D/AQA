package part3;

public class Example1 {
    public static void main(String[] args) {
        int count = 60;
        if (count % 2 == 0) {
            System.out.println(Math.pow(count, 10));
        } else {
            System.out.println(Math.pow(count, 3));
        }
    }
}
