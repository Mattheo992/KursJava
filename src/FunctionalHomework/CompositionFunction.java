package FunctionalHomework;

import java.util.function.Function;

public class CompositionFunction {
    //Zdefiniuj funkcję, która wykonuje kompozycję dwóch innych funkcji,
    // czyli wykonuje jedną funkcję, a następnie drugą na wyniku pierwszej.
    public static void main(String[] args) {
        Function<Integer, Integer> addThree = n -> n + 3;
        Function<Integer, Integer> doubleNumber = n -> n * 2;
        Function<Integer, Integer> compositionOfTwoFunctions = composition(addThree, doubleNumber);
        System.out.println(compositionOfTwoFunctions.apply(5));
    }
    public static Function<Integer, Integer> composition(Function<Integer, Integer> f1, Function<Integer, Integer> f2) {
        return f1.andThen(f2);
    }
}
