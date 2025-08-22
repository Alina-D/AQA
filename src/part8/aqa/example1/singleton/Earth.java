package part8.aqa.example1.singleton;

public class Earth {
    private static Earth instance;
    public String value;

    private Earth(String value) {
        // Этот код эмулирует медленную инициализацию.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Earth getInstance(String value) {
        if (instance == null) {
            instance = new Earth(value);
        }
        return instance;
    }
}
