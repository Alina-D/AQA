package part7.aqa.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем ИЗМЕНЯЕМЫЙ список
        List<Integer> listInteger = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        swapAndPrintList(listInteger, 1,2);

        List<String> listString = new ArrayList<>(Arrays.asList("a","b", "c", "d"));
        swapAndPrintList(listString, 3, 1 );

    }

    public static <Type> void swapAndPrintList(List<Type> list, int indexA, int indexB) {
        System.out.println("До обмена:");
        SwapUtils.printList(list);

        SwapUtils.swap(list, indexA, indexB);

        System.out.println("После обмена элементов:");
        SwapUtils.printList(list);
    }
}
