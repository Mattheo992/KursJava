package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class IterateAllElements {
    public static void main(String[] args) {
        List<String> wordsToUpperCase = new ArrayList<>(List.of("banan", "yeti", "krasnal", "tytka"));

        AtomicReference<String> toUpperCase = new AtomicReference<>(" + ");
        wordsToUpperCase.
                forEach(n->System.out.println(n.toUpperCase()));

    }


    }

