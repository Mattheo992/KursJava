package Homework_All_Functionals;

import java.util.function.BiFunction;

public class RatioOfTwoNumbers {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> ratioOfTwoNumbers = (a, b) -> a * b;
        double ratioOfNumbers = ratioOfTwoNumbers.apply(2.5, 7.0);
        System.out.println(ratioOfNumbers);
    }
}
