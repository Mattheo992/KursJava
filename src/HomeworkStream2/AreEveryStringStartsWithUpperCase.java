package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;

public class AreEveryStringStartsWithUpperCase {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Andrzej", "Barbakan", "Książka"));
        boolean areEveryStartsWithUpperCase = words.stream()
                .allMatch(n -> Character.isUpperCase(n.charAt(0)));
        System.out.println(areEveryStartsWithUpperCase);
    }
}
