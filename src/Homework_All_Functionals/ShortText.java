package Homework_All_Functionals;

import java.util.function.Consumer;

public class ShortText {
    public static void main(String[] args) {
        Consumer<String> shortText = text -> {
           String[] words = text.split(" ");
           StringBuilder acronym = new StringBuilder();
          for(String word : words){
              acronym.append(word.charAt(0));
          }
          System.out.println(acronym.toString());

        };
        String originalText = "Grand Theft Auto 5";
        System.out.println(originalText);
        shortText.accept(originalText);

        }
    }

