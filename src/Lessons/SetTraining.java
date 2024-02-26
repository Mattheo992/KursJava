package Lessons;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTraining {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(25);
        numbers.add(11);
        Set<Integer> listNumbers = Set.of(1, 2, 3, 4);
        var newNumbers = new HashSet<Integer>();
        Set<String> text = new HashSet<>(Arrays.asList("Audi", "BMW"));
        Set<String> bikes = new HashSet<>(Arrays.asList("yamaha", "kawasaki"));
//czy jest pusty
        boolean isEmpty = numbers.isEmpty();
        if (isEmpty) {
            System.out.println("Zbiór jest pusty");
        } else {
            System.out.println("Zbiór nie jest pusty");
        }
        System.out.println(isEmpty);
        //sprawdzenie czy są takie same
        boolean equals = numbers.equals(listNumbers);
        if (equals) {
            System.out.println("Zbiory są równe");
        } else {
            System.out.println("Zbiory nie są równe");
        }
//usuwanie elementu ze zbioru
        text.remove("Audi");
        System.out.println(text);
//zbiór niemodyfikowalny
        Set<Integer> bezModyfikacji = Set.of(1, 2, 3, 4);
        try {
            bezModyfikacji.add(3);
        } catch (UnsupportedOperationException e) {
            System.out.println("Zbiór jest niemodyfikowalny");
        }
//utworzenie trzeciego zbioru
        Set<String> text3 = new HashSet<>(text);
        text.addAll(bikes);
// sprawdzenie czy jest podzbiorem
        boolean contains = text3.contains(bikes);
        if (contains) {
            System.out.println("Zbiór jest podzbiorem drugiego");
        } else {
            System.out.println("Zbiór nie jest podzbiorem drugiego");
        }
Set<Integer> number1 = new HashSet<>();
        number1.add(5);
        number1.add(2);
        number1.add(4);
        number1.add(9);

        Set<Integer> number2 = new HashSet<>();
        number2.add(5);
        number2.add(3);
        number2.add(4);
        number2.add(8);

        Set<Integer> containsNumbers = new HashSet<>(number1);
        containsNumbers.retainAll(number2);
        System.out.println(containsNumbers);

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(27);
        set2.add(3);
        set2.add(9);

        set1.removeAll(set2);
        System.out.println(set1);
    }
}

