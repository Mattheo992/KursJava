package Homework_All_Functionals;

import java.util.function.BiFunction;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> sumOfTwoNumbers = Double::sum;
        Double sumOfNumbers = sumOfTwoNumbers.apply(6.0, 11.5);
        System.out.println(sumOfNumbers);
    }
}
