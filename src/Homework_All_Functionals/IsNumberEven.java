package Homework_All_Functionals;

import java.util.function.Predicate;

public class IsNumberEven {
    public static void main(String[] args) {
        Predicate<Integer> isNumberEven = number -> number % 2 == 0;
        System.out.println(isNumberEven.test(6));
        System.out.println(isNumberEven.test(3));
    }
}
