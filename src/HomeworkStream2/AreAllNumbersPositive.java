package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;

public class AreAllNumbersPositive {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 5, 7));
        boolean areAllNumbersPositive = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println(areAllNumbersPositive);

    }
}
