package Homework_All_Functionals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class SortedList {
    public static void main(String[] args) {
        Consumer<List<Integer>> numbers = Collections::sort;
List<Integer> numbersToSort = new ArrayList<>(List.of(1, 2, 22, 3, 9, 11));
        numbers.accept(numbersToSort);
        System.out.println(numbersToSort);

    }
}
