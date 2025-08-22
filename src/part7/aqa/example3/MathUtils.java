package part7.aqa.example3;

/**
 * Утилитарный класс для математических операций
 */
public class MathUtils {

    /**
     * Универсальный дженерик метод для деления двух чисел с обработкой исключения деления на ноль
     * Работает с любыми числовыми типами, наследующими от Number
     * 
     * @param <T> тип числового значения, должен наследовать от Number
     * @param a делимое
     * @param b делитель
     * @return результат деления a на b, или Double.NaN в случае деления на ноль
     */
    public static <T extends Number> double division(T a, T b) {
        try {
            // Преобразуем к double для вычислений
            double aValue = a.doubleValue();
            double bValue = b.doubleValue();
            
            // Проверяем деление на ноль
            if (bValue == 0.0) {
                throw new ArithmeticException("Деление на ноль невозможно");
            }
            
            // Выполняем деление
            double result = aValue / bValue;
            System.out.println(a + " / " + b + " = " + result);
            return result;
            
        } catch (ArithmeticException e) {
            // Отлавливаем ошибку деления на ноль
            System.out.println("Ошибка: произошло деление на ноль! (" + a + " / " + b + ")");
            return Double.NaN; // Возвращаем "Not a Number" как индикатор ошибки
        }
    }
}
