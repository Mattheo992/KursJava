package FunctionalHomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AverageOfNumbers {
    //Wykorzystaj Function do obliczenia średniej z listy liczb.
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 5, 7, 10, 12, 8);
        Function<List<Integer>, Double> averageFunction = AverageOfNumbers::average;
        System.out.println(averageFunction.apply(numbers));
    }

    public static double average(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }
}
