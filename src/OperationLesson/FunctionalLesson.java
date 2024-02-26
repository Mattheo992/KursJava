package OperationLesson;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalLesson {
    public static void main(String[] args) {
        //Napisz funkcję, która pobiera listę liczb całkowitych i podnosi je do kwadratu.
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5);
        applyFunction(numbers, x -> x * x);
    }

    public static void applyFunction(List<Integer> numbers, Function<Integer, Integer> function) {
        for (Integer number : numbers) {
            int result = function.apply(number);
            System.out.println("Liczba " + number + " jej kwadrat to " + result);

        }
    }
}
