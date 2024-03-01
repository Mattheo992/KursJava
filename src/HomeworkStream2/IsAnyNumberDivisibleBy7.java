package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class IsAnyNumberDivisibleBy7 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(4, 7, 9, 14, 21));
        Predicate<Integer> isDivisibleBy7 = n -> n % 7 == 0;
        Optional<Integer> isAnyDivisible = numbers.stream()
                .filter(isDivisibleBy7)
                .findAny();
        isAnyDivisible.ifPresentOrElse(System.out::println, () -> System.out.println("Nie ma takiej liczby"));
    }
}
