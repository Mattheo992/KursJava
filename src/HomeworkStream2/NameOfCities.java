package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;

public class NameOfCities {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>(List.of("Łódź", "Łomża", "Łagiewniki"));
        boolean allCities = cities.stream()
                .allMatch(n-> n.charAt(0) == cities.getFirst().charAt(0));
        System.out.println(allCities);
    }
}