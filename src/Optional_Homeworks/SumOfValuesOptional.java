package Optional_Homeworks;

import java.util.List;
import java.util.Optional;

public class SumOfValuesOptional {
    public static void main(String[] args) {
        //Napisz metodę, która przyjmuje Optional zawierający listę liczb całkowitych.
        // Jeśli Optional zawiera listę, metoda powinna zwrócić sumę wszystkich elementów listy.
        // Jeśli Optional jest pusty, metoda powinna zwrócić sumę elementów listy domyślnej.
        List<Integer> numbers = List.of(5, 11, 7, 8, 10);
        Optional<List<Integer>> number = Optional.of(numbers);
        Optional<List<Integer>> empty = Optional.empty();
        System.out.println(calculateSumOfNumbersInList(empty, getDefaultValue()));
        System.out.println(calculateSumOfNumbersInList(number, getDefaultValue()));

    }

    public static int calculateSumOfNumbersInList(Optional<List<Integer>> optional, int defaultValue) {
        return optional.map(SumOfValuesOptional::getSumOfNumbers).orElseGet(SumOfValuesOptional::getDefaultValue);
    }

    public static int getDefaultValue() {
        List<Integer> defaultNumbers = List.of(1, 2, 3, 4, 5);
        int sum = 0;
        for (int number : defaultNumbers) {
            sum += number;
        }
        return sum;
    }

    public static int getSumOfNumbers(List<Integer> list) {
        int sumOfNumbers = 0;
        for (int number : list) {
            sumOfNumbers += number;
        }
        return sumOfNumbers;
    }
}
