package part3;

public class Example2 {
    public static void main(String[] args) {
        int n = 50;
        int nums = 0;
        for (int i = 0; i < n; i++)
            if (i%2 != 0 && i%3 != 0 && i%5 != 0)
                nums += 1;
        System.out.println(nums);
    }

}
