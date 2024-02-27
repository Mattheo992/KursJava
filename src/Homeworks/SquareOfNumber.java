package Homeworks;

import java.util.function.Function;

public class SquareOfNumber {
    public static void main(String[] args) {
        Function<Integer, Integer> squareOfNumber = number -> number * number;
        System.out.println(squareOfNumber.apply(5));
    }
}