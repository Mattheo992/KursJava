package Homework_All_Functionals;

import java.util.function.Predicate;

public class IsNumberPositive {
    public static void main(String[] args) {
        Predicate<Integer> isNumberPositive = number -> number > 0;
        System.out.println(isNumberPositive.test(7));
        System.out.println(isNumberPositive.test(-2));
    }
}
