package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FindAnyNumberWitchIsPowerOf2 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(4, 8, 12, 7, 9));
        Predicate<Integer> isNumberPowerOf2 = n -> n > 0 && (n & (n - 1)) == 0;
        Optional<Integer> findAnyNumber = numbers.stream()
                .filter(isNumberPowerOf2)
                .findAny();
        System.out.println(findAnyNumber);

    }
}