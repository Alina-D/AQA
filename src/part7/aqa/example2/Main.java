package part7.aqa.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        swapAndPrintList(listInteger, 1,2);

        List<String> listString = new ArrayList<>(Arrays.asList("a","b", "c", "d"));
        swapAndPrintList(listString, 3, 1 );

    }
/**
     * Дженерик выводит начальный список, конечный результат списка после обмена
     *
     * @param <Type> тип элементов в списке
     * @param list список с элементами типа T
     * @param indexA индекс первого элемента для обмена
     * @param indexB индекс второго элемента для обмена
     */
    public static <Type> void swapAndPrintList(List<Type> list, int indexA, int indexB) {
        System.out.println("До обмена:");
        SwapUtils.printList(list);

        SwapUtils.swap(list, indexA, indexB);

        System.out.println("После обмена элементов:");
        SwapUtils.printList(list);
    }
}
