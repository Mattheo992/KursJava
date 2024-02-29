package Homework_Stream;

import java.util.ArrayList;
import java.util.List;

public class LimitedNumbers {
    public static void main(String[] args) {
        List<Integer> numbersToSkip = new ArrayList<>(List.of(1, 2 ,3 ,4 ,5 ,6 ,7, 8, 9, 10, 11, 12, 13, 14, 15));
        numbersToSkip.stream()
                .limit(10)
                .forEach(System.out::println);
    }
}
