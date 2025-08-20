package part6.aqa.example2;

/**
 * Класс, представляющий журнал
 */
public class Magazine implements Printable {
    private String title;
    private int issueNumber;

    /**
     * Конструктор для создания журнала
     * @param title название журнала
     * @param issueNumber номер выпуска
     */
    public Magazine(String title, int issueNumber) {
        this.title = title;
        this.issueNumber = issueNumber;
    }

    /**
     * Реализация метода print() для журнала
     */
    @Override
    public void print() {
        System.out.println("Журнал: \"" + title + "\" выпуск №" + issueNumber);
    }

    /**
     * Статический метод для печати только журналов из массива Printable
     * @param printable массив объектов типа Printable
     */
    public static void printMagazines(Printable[] printable) {
        System.out.println("\n=== Журналы ===");
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                item.print();
            }
        }
    }

    /**
     * Геттер для получения названия журнала
     * @return название журнала
     */
    public String getTitle() {
        return title;
    }

    /**
     * Геттер для получения номера выпуска
     * @return номер выпуска
     */
    public int getIssueNumber() {
        return issueNumber;
    }
}
