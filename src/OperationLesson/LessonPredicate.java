package OperationLesson;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LessonPredicate {
    public static void main(String[] args) {
        //Napisz predykat, ktory odfiltrowuje tylko liczby parzyste
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        Predicate<Integer> onlyOddNumbers = num -> num % 2 != 0;
        List<Integer> oddNumbers = filter(numbers, onlyOddNumbers);
        System.out.println(oddNumbers);

    }

    public static List<Integer> filter(List<Integer> numbers, Predicate<Integer> onlyOddNumbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (onlyOddNumbers.test(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
