package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;

public class AtLeastOneNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(4, 11, 7, 23));
        boolean AtLeastOneNumber = numbers.stream()
                .anyMatch(n -> n > 10);
        System.out.println(AtLeastOneNumber);
    }
}
