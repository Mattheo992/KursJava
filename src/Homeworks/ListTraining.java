package Homeworks;

import java.lang.reflect.Array;
import java.util.*;

public class ListTraining {
    public static void main(String[] args) {
        //łączenie list
        List<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("White");
        colours.add("Red");
        List<String> otherColours = new ArrayList<>();
        otherColours.add("Pink");
        otherColours.add("Green");
        colours.addAll(otherColours);
        for (String colour : colours) {
            System.out.println(colour);
        }
        //odwracanie listy
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        List<Integer> reversed = numbers.reversed();
        System.out.println(reversed);

        //Usuwanie duplikatów
        List<String> animals = Arrays.asList("bull", "dog", "cat", "horse", "elephant", "dog", "cat", "horse");
        Set<String> noDuplicates = new HashSet<>(animals);
        List<String> noDuplicatesAnimals = new ArrayList<>(noDuplicates);
        System.out.println(noDuplicatesAnimals);
        //obliczanie sumy elementów listy
        List<Integer> sumOfNumbers = new ArrayList<>();
        sumOfNumbers.add(12);
        sumOfNumbers.add(58);
        sumOfNumbers.add(3);
        sumOfNumbers.add(26);
        sumOfNumbers.add(17);
        int sum = 0;
        for (int number : sumOfNumbers) {
            sum += number;
        }
        System.out.println(sum);

        //Sprawdź, czy dwie listy są sobie równe, tj. czy mają te same elementy w tej samej kolejności.
        List<Integer> firstNumbersList = new ArrayList<>();
        firstNumbersList.add(23);
        firstNumbersList.add(11);
        firstNumbersList.add(7);
        firstNumbersList.add(9);
        List<Integer> secondNumbersList = new ArrayList<>();
        secondNumbersList.add(23);
        secondNumbersList.add(7);
        secondNumbersList.add(9);
        secondNumbersList.add(11);

        boolean equals = firstNumbersList.equals(secondNumbersList);
        if (equals) {
            System.out.println("Listy są równe");
        } else {
            System.out.println("Listy nie są równe");
        }

        //Wyszukiwanie największego i najmniejszego elementu:

        List<Integer> biggestSmallestNumber = new ArrayList<>();
        biggestSmallestNumber.add(23);
        biggestSmallestNumber.add(11);
        biggestSmallestNumber.add(7);
        biggestSmallestNumber.add(5);
        biggestSmallestNumber.add(1);
        biggestSmallestNumber.sort(Comparator.naturalOrder());
        System.out.println(biggestSmallestNumber.getFirst());
        System.out.println(biggestSmallestNumber.getLast());

        List<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("BWM");
        cars.add("Skoda");
        cars.add("Ferrari");
        Collections.swap(cars, 1, 3);
        System.out.println(cars);
    }


}

