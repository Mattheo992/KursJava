package OperationLesson;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Length {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ala");
        names.add("Karolina");
        names.add("Agnieszka");
        names.add("Ola");
        names.add("krystian");
        Predicate<String> moreThan5Dots = word -> word.length()>5;
        List<String> filteredNames = filterLongChains(names, moreThan5Dots);
        System.out.println(filteredNames);
List<String> chainsWithStream = names.stream().filter(moreThan5Dots).collect(Collectors.toList());
    }

    public static List<String> filterLongChains(List<String> text, Predicate<String> namesFiltre) {
        List<String> chains = new ArrayList<>();
        for (String word : text) {
            if (namesFiltre.test(word)) {
                chains.add(word);

            }
        }
        return chains;
    }
}
