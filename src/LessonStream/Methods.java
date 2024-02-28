package LessonStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
