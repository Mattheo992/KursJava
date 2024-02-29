package LessonStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class MatchLesson {
    public static void main(String[] args) {
        //od litery a
        List<String> words = new ArrayList<>(List.of("Antyk", "Bar", "Kreda"));
        boolean isAnyWordStartWithA = words.stream()
                .anyMatch(n -> n.toLowerCase()
                        .startsWith("a"));
        System.out.println(isAnyWordStartWithA);

        //Sprawdzic czy wszystkie stringi sa dlugosci 5

        List<String> words2 = new ArrayList<>(List.of("Basia", "Karty", "Bunkier"));
        boolean isAllMatch = words2.stream()
                .allMatch(n -> n.length() == 5);

        List<String> words3 = new ArrayList<>(List.of(""));
        boolean noneMatchString = words3.stream().noneMatch(Objects::isNull);
        System.out.println(noneMatchString);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        AtomicInteger max = new AtomicInteger(numbers.getFirst());
        numbers.forEach(n -> {
            if (n > max.get()) {
                max.set(n);
            }
        });

        List<String> text = new ArrayList<>(List.of("Mam", "tak", "samo", "jak", "Ty"));
        AtomicReference<String> concatenated = new AtomicReference<>(" ");
        text.forEach((n-> concatenated.updateAndGet(n1-> n1 + n + " ")));
        System.out.println(text);
    }
}
