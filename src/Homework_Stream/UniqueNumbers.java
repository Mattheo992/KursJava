package Homework_Stream;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumbers {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>(List.of(1, 1, 3, 3, 5, 8, 8, 8, 9));
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}