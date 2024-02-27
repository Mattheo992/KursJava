package Homework_All_Functionals;

import java.util.function.Predicate;

public class IsPalindrome {
    public static void main(String[] args) {

        Predicate<String> isPalindrome = n -> {
            String cleanText = n.replaceAll("\\s+", "").toLowerCase();
            String reversed = new StringBuilder(cleanText).reverse().toString();
            return cleanText.equals(reversed);
        };

        String text1 = "A to kawa kota";
        System.out.println(isPalindrome.test(text1));
    }
}