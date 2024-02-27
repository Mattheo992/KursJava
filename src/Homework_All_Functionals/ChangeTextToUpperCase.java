package Homework_All_Functionals;

import java.util.function.Consumer;

public class ChangeTextToUpperCase {
    public static void main(String[] args) {
        Consumer<String> toUpperCase = text ->System.out.println(text.toUpperCase());
        toUpperCase.accept("sprawdzam czy działa");
    }
}
