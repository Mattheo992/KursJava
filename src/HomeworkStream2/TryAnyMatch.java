package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;

public class TryAnyMatch {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("banan", "kasztan", "cytryna"));
        boolean isAnyStartsWithA = words.stream()
                .anyMatch(s -> s.toLowerCase().startsWith("a"));
        System.out.println(isAnyStartsWithA);
    }
}
