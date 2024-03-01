package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("kaktus", "bark", "ananas", "arbuz"));
        Optional<String> findFirstWordWithA = words.stream()
                .filter(n -> n.toLowerCase()
                        .startsWith("a"))
                .findFirst();
        findFirstWordWithA.ifPresentOrElse(System.out::println,()-> System.out.println("nie ma takiego słowa"));
    }
}
