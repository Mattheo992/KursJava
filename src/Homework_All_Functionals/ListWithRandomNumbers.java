package Homework_All_Functionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class ListWithRandomNumbers {
    public static void main(String[] args) {
        Supplier<List<Integer>> randomListSupplier = () -> {
            int size = 15;
            List<Integer> randomList = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                randomList.add(random.nextInt(100));
            }
            return randomList;
        };

        List<Integer> randomNumbers = randomListSupplier.get();
        System.out.println(randomNumbers);
    }

}
