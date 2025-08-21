package part7.aqa.example1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        System.out.println(filterByPrimeNumber(list));

    }

    public static <Type> List<Type> filterByParity(List<? extends Number> group) {
        List<Type> filterByParity = new ArrayList<>();
        group.forEach(el -> {
            if ((el.doubleValue() % 2) == 0) {
                filterByParity.add((Type) el);
            }
        });
        return filterByParity;
    }

    public static <Type> List<Type> filterByPrimeNumber(List<? extends Number> group) {
        List<Type> filterByPrimeNumber = new ArrayList<>();

        for (Number el : group) {
            boolean isPrime = true;
            int limit = (int) Math.sqrt((int) el);
            for (int i = 2; i <= limit; i++) {
                if ((int) el % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                filterByPrimeNumber.add((Type) el);
            }
        }
        return filterByPrimeNumber;
    }
}
