package Homework_All_Functionals;

import java.util.function.Consumer;

public class ShortText {
    public static void main(String[] args) { //akronim
        Consumer<String> shortText = text -> {
            System.out.println(text.substring(0, 15) + "...");

        };
        String originalText = "Dawno, dawno tymu, za siedmioma #!$%@?,\n za siedmioma serkami, " +
                "w łokolicach Gubałówki mieszkał\n Tomisław Apolonius Curuś Bachleda Farrell, jak ten piecyk z dmuchawą.";
        System.out.println(originalText);
        shortText.accept(originalText);

        }
    }

