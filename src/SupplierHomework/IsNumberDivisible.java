package SupplierHomework;

import java.util.List;
import java.util.function.Predicate;

public class IsNumberDivisible {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8, 12, 93);
        Predicate<Integer> isNumberDivisible = number -> number % 2 == 0 && number % 3 == 0 & number % 6 == 0;
        numberDivisible(numbers, isNumberDivisible);
        //zrobić na streamach
    }

    public static void numberDivisible(List<Integer> numbers, Predicate<Integer> isDivisible) {
        for (int number : numbers) {
            if (isDivisible.test(number)) {
                System.out.println(number + " jest podzielna ");
            } else {
                System.out.println(number + " nie jest podzielna");
            }
        }
    }
}
