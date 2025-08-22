package part7.aqa.example3;

/**
 * Главный класс для демонстрации работы метода division с обработкой исключений
 */
public class Main {
    public static void main(String[] args) {

        //Нормальное деление
        testNormalDivision();

        //Деление на ноль
        testDivisionByZero();

        //Сравнение разных методов деления
        testDifferentMethods();
    }

    /**
     * Тест нормального деления
     */
    private static void testNormalDivision() {
        System.out.println("Нормальное деление");
        MathUtils.division(10, 2);
        MathUtils.division(15, 3);
        MathUtils.division(100, 7);
        System.out.println();
    }

    /**
     * Тест деления на ноль
     */
    private static void testDivisionByZero() {
        System.out.println("Деление на ноль");
        MathUtils.division(10, 0);
        MathUtils.division(5.5, 0);
        MathUtils.division(-7, 0);
        System.out.println();
    }

    /**
     * Тест дженерик метода с разными типами чисел
     */
    private static void testDifferentMethods() {
        System.out.println("Дженерик метод с разными типами");
        
        System.out.println("С типом Double:");
        MathUtils.division(20.0, 4.0);
        
        System.out.println("\nС типом Integer:");
        MathUtils.division(20, 4);
        
        System.out.println("\nС типом Float:");
        MathUtils.division(15.5f, 3.1f);
        
        System.out.println("\nС типом Long:");
        MathUtils.division(100L, 7L);
                
        System.out.println("Integer на ноль:");
        MathUtils.division(10, 0);
        
        System.out.println("Float на ноль:");
        MathUtils.division(7.5f, 0.0f);
        
        System.out.println();
    }
}
