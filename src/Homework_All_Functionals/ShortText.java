package Homework_All_Functionals;

import java.util.function.Function;

public class ShortText {
    public static void main(String[] args) {
        Function<String, String> shortText = text -> {
            String[] words = text.split(" ");
            StringBuilder acronym = new StringBuilder();
            for (String word : words) {
                acronym.append(word.charAt(0));
            }
            return acronym.toString();

        };
        String originalText = "Grand Theft Auto 5";
        String apply = shortText.apply(originalText);
        System.out.println(apply);

    }
}

