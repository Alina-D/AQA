package part5.aqa.example2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Иванов", "Иван", "Иванович", "Иваново 2", 1111111, 17348394);
        Customer customer2 = new Customer("Петров", "Петр", "Пертович", "Петрово 6", 2222222, 27387924);
        Customer customer3 = new Customer("Кириллов", "Кирилл", "Кириллович", "Киролово 2", 5333333, 57348394);
        Customer customer4 = new Customer("Евегиев", "Евнений", "Евгеньевич", "Евгеньево 15", 4444444, 47348394);
        Customer customer5 = new Customer("Евегиев2", "Евнений2", "Евгеньевич", "Евгеньево 20", 5554444, 87348394);

        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

        task1(customers);
        task2(customers);
        task3(customers);

    }

    /*
    Вывести имя покупателя с самой длинной фамилией
    */
    private static void task1(List<Customer> customers) {

        List<Customer> newCustomers = customers.stream()
                .sorted(Comparator.comparing(Customer::getName))
                .max(Comparator.comparingInt(a -> a.getSurname().length())) // получаем максимум
                .map(max ->
                        customers.stream()
                        .filter(x -> x.getSurname().length() == max.getSurname().length())
                ) // отбираем покупателье с максимальным кол-вом букв в фамилии
                .get().toList();

        newCustomers.forEach(customer -> System.out.println(customer.getName()));
    }

    /*
    Адреса всех покупателей, у кого первая цифра номера кредитки 5.
    */
    private static void task2(List<Customer> customers) {

        List<Customer> newCustomers = customers.stream()
                .filter(customer -> {
                            String firstLetter = String.valueOf(String.valueOf(customer.getCardNumber()).charAt(0));
                            return firstLetter.equals("5");
                        })
                .toList();

        newCustomers.forEach(customer -> System.out.println(customer.getAddress()));
    }

    /*
    Всех покупателей с отчеством "Евгеньевич"
    */
    private static void task3(List<Customer> customers) {

        List<Customer> newCustomers = customers.stream()
                .filter(customer -> customer.getMiddleName().equals("Евгеньевич"))
                .toList();

        newCustomers.forEach(Customer::getData);
    }
}
