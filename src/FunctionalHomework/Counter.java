package FunctionalHomework;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Counter {
    //Użyj Function do zliczenia wystąpień określonego elementu w liście lub innym zbiorze danych
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        words.add("banan");
        words.add("jabłko");
        words.add("banan");
        words.add("banan");
        words.add("kalosz");
        System.out.println("podaj słowo do policzenia wystąpień: ");
        String wordToCount = sc.nextLine();
        sc.close();
        System.out.println( counter(words, wordToCount));

    }

    public static int counter(List<String> words, String textToCount) {
        Function<List<String>, Integer> averageFunction = n -> {
            int counter = 0;
            for (String word : words) {
                if (word.equals(textToCount)) {
                    counter++;
                }
            }
            return counter;
        };
return averageFunction.apply(words);
    }
}
