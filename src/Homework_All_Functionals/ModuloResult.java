package Homework_All_Functionals;

import java.util.function.BiFunction;

public class ModuloResult {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> moduloResult = (a, b)-> a % b;
        double moduloOfTwoNumbers = moduloResult.apply(8, 3);
        System.out.println(moduloOfTwoNumbers);

    }
}
