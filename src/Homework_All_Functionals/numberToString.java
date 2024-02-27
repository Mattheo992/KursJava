package Homework_All_Functionals;

import java.util.function.Consumer;


public class numberToString {
    public static void main(String[] args) {
        Consumer<Integer> numberToWord = (number) -> {
            String[] units = {"zero", "jeden", "dwa", "trzy", "cztery", "pięć", "sześć", "siedem", "osiem", "dziewięć"};
            String[] teens = {"dziesięć", "jedenaście", "dwanaście", "trzynaście", "czternaście", "piętnaście", "szesnaście", "siedemnaście", "osiemnaście", "dziewiętnaście"};
            String[] tens = {"", "", "dwadzieścia", "trzydzieści", "czterdzieści", "pięćdziesiąt", "sześćdziesiąt", "siedemdziesiąt", "osiemdziesiąt", "dziewięćdziesiąt"};
            String[] hundreds = {"", "sto", "dwieście", "trzysta", "czterysta", "pięćset", "sześćset", "siedemset", "osiemset", "dziewięćset"};

            if (number < 10) {
                System.out.println(units[number]);
            } else if (number < 20) {
                System.out.println(teens[number - 10]);
            } else if (number < 100) {
                System.out.println(tens[number / 10] + " " + units[number % 10]);
            } else {
                System.out.println(hundreds[number / 100] + " " + tens[(number % 100) / 10] + " " + units[number % 10]);
            }
        };
    }
}
