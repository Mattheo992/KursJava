package FunctionalHomework;

import java.util.function.Function;

public class MixComposition {
    public static void main(String[] args) {
        Function<Integer, Integer> addTwo = n-> n+2;
        Function<Integer, Integer> tripleNumber = n-> n * 3;
        Function<Integer, Integer> mixComposition = mixComposition(addTwo, tripleNumber);
        System.err.println( mixComposition.apply(8));
    }
    public static <T> Function<T, T> mixComposition(Function<T, T> f1, Function<T, T> f2){
        return f1.andThen(f2);
    }
}
