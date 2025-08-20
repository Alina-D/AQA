package part6.aqa.example2;

/**
 * Главный класс для демонстрации работы с интерфейсом Printable
 */
public class Main {
    public static void main(String[] args) {
        // Создаем массив типа Printable, содержащий книги и журналы
        Printable[] library = {
            new Book("Война и мир", "Лев Толстой"),
            new Magazine("Наука и жизнь", 3),
            new Book("Преступление и наказание", "Федор Достоевский"),
            new Magazine("Популярная механика", 7),
            new Book("Мастер и Маргарита", "Михаил Булгаков"),
            new Magazine("Вокруг света", 12),
            new Book("1984", "Джордж Оруэлл")
        };

        // В цикле проходим по массиву и вызываем метод print() для каждого объекта
        System.out.println("=== Вся библиотека ===");
        for (Printable item : library) {
            item.print();
        }

        // Используем статический метод для печати только книг
        Book.printBooks(library);

        // Используем статический метод для печати только журналов
        Magazine.printMagazines(library);

        // Дополнительная демонстрация работы с instanceof
        System.out.println("\n=== Подсчет объектов ===");
        int bookCount = 0;
        int magazineCount = 0;

        for (Printable item : library) {
            if (item instanceof Book) {
                bookCount++;
            } else if (item instanceof Magazine) {
                magazineCount++;
            }
        }

        System.out.println("Всего книг: " + bookCount);
        System.out.println("Всего журналов: " + magazineCount);
        System.out.println("Общее количество изданий: " + library.length);
    }
}
