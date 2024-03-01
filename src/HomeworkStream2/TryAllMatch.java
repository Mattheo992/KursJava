package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;

public class TryAllMatch {
    public static void main(String[] args) {
        List<String> wordsLength = new ArrayList<>(List.of("banan", "koral", "bywać"));
        boolean areAllWordsLength5 = wordsLength.stream()
                .allMatch(n->n.length() == 5);
        System.out.println(areAllWordsLength5);
    }
}
