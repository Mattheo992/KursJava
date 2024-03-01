package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FindFirstNumberOnList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(23, 17, 1, 3, 5, 7));
        Predicate<Integer> findFirstNumber = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        Optional<Integer> first = numbers.stream()
                .filter(findFirstNumber)
                .findFirst();
        first.ifPresentOrElse(System.out::println, () -> System.out.println("Nie ma takiej liczny"));


    }

}