package Homework_Stream;

import java.util.ArrayList;
import java.util.List;

public class SkipNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        numbers.stream()
                .skip(3)
                .forEach(System.out::println);
    }
}
