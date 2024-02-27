package Homework_All_Functionals;

import java.util.function.Function;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Function<Integer, Integer> factorialOfNumber = n -> {
            int result =1;
            for (int i = 1; i <= n; i++){
                result  *= n;
            }
            return result;
        };
        int factorial = factorialOfNumber.apply(5);
        System.out.println(factorial);
    }
    }


