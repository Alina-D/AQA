package part7.aqa.example2;

import java.util.List;



/**
 * Утилитарный класс для работы с коллекциями
 */
public class SwapUtils {

    /**
     * Общий дженерик метод для обмена позициями двух элементов в списке
     *
     * @param <T> тип элементов в списке
     * @param list список с элементами типа T
     * @param indexA индекс первого элемента для обмена
     * @param indexB индекс второго элемента для обмена
     * @throws IndexOutOfBoundsException если любой из индексов выходит за границы списка
     * @throws IllegalArgumentException если список равен null
     */
    public static <T> void swap(List<T> list, int indexA, int indexB) {
        // Проверяем, что список не null
        if (list == null) {
            throw new IllegalArgumentException("Список не может быть null");
        }

        // Проверяем границы массива
        if (indexA < 0 || indexA >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс A (" + indexA + ") выходит за границы списка (размер: " + list.size() + ")");
        }

        if (indexB < 0 || indexB >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс B (" + indexB + ") выходит за границы списка (размер: " + list.size() + ")");
        }

        // Если индексы одинаковые, обмен не нужен
        if (indexA == indexB) {
            return;
        }

        // Выполняем обмен элементов
        T temp = list.get(indexA);
        list.set(indexA, list.get(indexB));
        list.set(indexB, temp);
    }

    /**
     * Вывод списка
     *
     * @param <T> тип элементов в списке
     * @param list список для вывода
     */
    public static <T> void printList(List<T> list) {
        System.out.println(list);
    }
}
