package part3;

public class Example3 {
    public static void main(String[] args) {
        String str = " привет,   в этой    строке лишние   пробелы.  ";
        str = str.trim();
        while (str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        System.out.println(str);
    }
}
