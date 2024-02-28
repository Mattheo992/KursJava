package Homework_All_Functionals;

import java.util.function.Function;

public class ChangeTextToUpperCase {
    public static void main(String[] args) {
        Function<String, String> toUpperCase = String::toUpperCase;
       String upperCase = toUpperCase.apply("Martyna");
        System.out.println(upperCase);
    }
}
