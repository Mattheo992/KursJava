package FunctionalHomework;

import java.util.List;
import java.util.function.Function;

public class Srednia {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8);

        System.out.println(average(numbers));
    }

    public static double average(List<Integer> list) {
        Function<List<Integer>, Double> averageOfNumbers = numberList -> {
            double sum = 0;
            for (int number : numberList) {
                sum += number;
            }
            return sum / list.size();
        };
        return averageOfNumbers.apply(list);
    }
}
