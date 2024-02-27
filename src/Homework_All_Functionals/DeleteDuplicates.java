package Homework_All_Functionals;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DeleteDuplicates {
    public static void main(String[] args) {
        Consumer<List<Integer>> listWithoutDuplicates = n -> {
            List<Integer> withoutDuplicates = new ArrayList<>();
            for (Integer number : n) {
                if (!withoutDuplicates.contains(number)) {
                    withoutDuplicates.add(number);
                }
            }
            n.clear();
            n.addAll(withoutDuplicates);
        };
List<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(1);
numbers.add(3);
numbers.add(3);
numbers.add(5);
listWithoutDuplicates.accept(numbers);
        System.out.println(numbers);
    }
}

