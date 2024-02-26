package OperationLesson;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StringToNumber {
    public static void main(String[] args) {
        String number = "1234.6";
        Function<String, Double> convertedFunction = Double::parseDouble;
Function<Double, Double> squareFunction  = x -> x * x;
Function<String, Double> doubleFunction = convertedFunction.andThen(squareFunction);

        try {
            Double convertedNumber = convertedFunction.apply(number);
            System.out.println(convertedNumber);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());

    }
        }
}
