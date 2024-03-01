package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;

public class TryNoneMatch {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(4, 5, 6, 7));
        boolean isNoneMatch = numbers.stream()
                .noneMatch(n -> n < 4);
        System.out.println(isNoneMatch);
    }
}
