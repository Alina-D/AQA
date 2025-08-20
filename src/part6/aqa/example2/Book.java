package part6.aqa.example2;

/**
 * Класс, представляющий книгу
 */
public class Book implements Printable {
    private String title;
    private String author;

    /**
     * Конструктор для создания книги
     * @param title название книги
     * @param author автор книги
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Реализация метода print() для книги
     */
    @Override
    public void print() {
        System.out.println("Книга: \"" + title + "\" автор: " + author);
    }

    /**
     * Статический метод для печати только книг из массива Printable
     * @param printable массив объектов типа Printable
     */
    public static void printBooks(Printable[] printable) {
        System.out.println("\n=== Книги ===");
        for (Printable item : printable) {
            if (item instanceof Book) {
                item.print();
            }
        }
    }

    /**
     * Геттер для получения названия книги
     * @return название книги
     */
    public String getTitle() {
        return title;
    }

    /**
     * Геттер для получения автора книги
     * @return автор книги
     */
    public String getAuthor() {
        return author;
    }
}
