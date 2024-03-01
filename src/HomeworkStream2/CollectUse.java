package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectUse {
    public static void main(String[] args) {
        List<String> lowerCase = new ArrayList<>(List.of("jabłko", "samochód", "wypłata"));
        List<String> UpperCase = lowerCase.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(UpperCase);
    }
}
