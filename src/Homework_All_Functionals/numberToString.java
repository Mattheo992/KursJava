package Homework_All_Functionals;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class numberToString {
    public static void main(String[] args) {
        Function<Integer, String> changeNumberToText = number ->{
            if(number <= 10){
                return numberToString.changeNumberToText.get(number);
            }
            else return "Nieobsługiwana liczba";
        };

        String numberAsText = changeNumberToText.apply(7);
        System.out.println(numberAsText);
    }

    private static final Map<Integer, String> changeNumberToText = new HashMap<>();

    static  {
        changeNumberToText.put(0, "zero");
        changeNumberToText.put(1, "jeden");
        changeNumberToText.put(2, "dwa");
        changeNumberToText.put(3, "trzy");
        changeNumberToText.put(4, "cztery");
        changeNumberToText.put(5, "pięć");
        changeNumberToText.put(6, "sześć");
        changeNumberToText.put(7, "siedem");
        changeNumberToText.put(8, "osiem");
        changeNumberToText.put(9, "dziewięć");
        changeNumberToText.put(10, "dziesięć");
    }
}
