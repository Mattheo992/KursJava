package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TryFindAny {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("banan", "cytryna", "cymbałki", "cola"));
        Optional<String> findAnyWords = words.stream()
                .filter(n -> n.toLowerCase().startsWith("c"))
                .findAny();
        findAnyWords.ifPresentOrElse(System.out::println, () -> System.out.println("Nie ma takiego wyrazu"));
    }
}
