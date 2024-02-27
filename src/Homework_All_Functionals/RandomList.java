package Homework_All_Functionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class RandomList {
    public static void main(String[] args) {
        Function<Integer, List<Integer>> generateListWithRandomNumbers = (size) -> {
            List<Integer> list = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                list.add(random.nextInt(100));
            }
            return list;
        };
List<Integer>listWithRandomNumbers = generateListWithRandomNumbers.apply(9).stream().sorted().toList();

        System.out.println(listWithRandomNumbers);
    }
}