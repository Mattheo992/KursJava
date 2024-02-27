package Homework_All_Functionals;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class numberToString {
    public static void main(String[] args) {
        Function<Integer, String> changeNumberToText = number ->{
            if(number <= 10){
                return numberWordsMap.get(number);
            }
            else return "Nieobsługiwana liczba";
        };

        String numberAsText = changeNumberToText.apply(7);
        System.out.println(numberAsText);
    }

    private static final Map<Integer, String> numberWordsMap = new HashMap<>();

    static {
        numberWordsMap.put(0, "zero");
        numberWordsMap.put(1, "jeden");
        numberWordsMap.put(2, "dwa");
        numberWordsMap.put(3, "trzy");
        numberWordsMap.put(4, "cztery");
        numberWordsMap.put(5, "pięć");
        numberWordsMap.put(6, "sześć");
        numberWordsMap.put(7, "siedem");
        numberWordsMap.put(8, "osiem");
        numberWordsMap.put(9, "dziewięć");
        numberWordsMap.put(10, "dziesięć");
    }
}
