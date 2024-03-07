package Animal;

import java.util.*;
import java.util.stream.Collectors;

public class AnimalTest {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Cat", "Whiskers", 3, "Gray", true));
        animals.add(new Animal("Dog", "Buddy", 5, "Brown", true));
        animals.add(new Animal("Bird", "Tweety", 1, "Yellow", false));
        animals.add(new Animal("Fish", "Nemo", 2, "Orange", false));
        animals.add(new Animal("Horse", "Spirit", 7, "Black", true));
        animals.add(new Animal("Rabbit", "Fluffy", 4, "White", true));
        animals.add(new Animal("Snake", "Slinky", 6, "Green", false));
        animals.add(new Animal("Turtle", "Speedy", 10, "Brown", false));
        animals.add(new Animal("Hamster", "Nibbles", 2, "Brown", true));
        animals.add(new Animal("Elephant", "Dumbo", 8, "Gray", false));
        //Wybierz wszystkie zwierzęta, których wiek przekracza 5 lat.
        animals.stream()
                .filter(n -> n.getAge() > 5)
                .collect(Collectors.toSet());
        //Posortuj zwierzęta według wieku w kolejności malejącej.
        animals.stream()
                .sorted(Comparator.comparing(Animal::getAge).reversed())
                .collect(Collectors.toSet());
        //Znajdź najstarsze zwierzę.
        animals.stream()
                .max(Comparator.comparing(Animal::getAge))
                .orElse(null);
        //Znajdź wszystkie unikalne kolory zwierząt.
        animals.stream()
                .map(Animal::getColor)
                .distinct()
                .collect(Collectors.toSet());
        //Sprawdź, czy istnieje jakiekolwiek zwierzę o kolorze "czarnym"
        animals.stream()
                .anyMatch(colour-> "Black".equalsIgnoreCase(colour.getColor()));
        //Sprawdź, czy wszystkie zwierzęta są udomowione.
        animals.stream()
                .allMatch(Animal::isDomesticated);
        //Zlicz liczbę zwierząt każdego gatunku.
        Map<String, Long> collect = animals.stream()
                .collect(Collectors.groupingBy(Animal::getSpecies, Collectors.counting()));

//Wybierz trzy najmłodsze zwierzęta.
        animals.stream()
                .sorted(Comparator.comparing(Animal::getAge))
                .limit(3)
                .collect(Collectors.toSet());
        //Wybierz zwierzęta, których gatunek zaczyna się od litery "C".
        animals.stream()
                .filter(n->n.getSpecies().toUpperCase().startsWith("C"))
                .collect(Collectors.toSet());
        //Oblicz średni wiek wszystkich zwierząt.
        OptionalDouble average = animals.stream()
                .mapToDouble(Animal::getAge)
                .average();

    }
}
