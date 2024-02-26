package Homeworks;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //Największy wspólny dzielnik dla podanych cyfr
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwszą cyfrę");
        int firstNumber = sc.nextInt();
        System.out.println("Poda drugą cyfrę");
        int secondNumber = sc.nextInt();
        int gcd = greatestCommonDivisor(firstNumber, secondNumber);
        System.out.println("Największy wspólny dzielnik dla liczb: " + firstNumber + " i " + secondNumber + " to " + gcd);

        System.out.println("Program pokazuje wszystkie liczby od 1 do 100 pomijając te podzielne przez " +
                "3 i przez 5");
        for (int i = 0; i < 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }

        //program sprawdzi liczbę występujących liter
        System.out.println("Podaj zdanie do sprawdzenia liczby danych liter:");
        String task = sc.nextLine().toLowerCase();
        System.out.println("Podaj literę do sprawdzenia");
        char charInTask = sc.next().toLowerCase().charAt(0);
        int counter = letterCounter(task, charInTask);
        System.out.println("W zdaniu " + " ' " + task + " '" + " litera " + charInTask + " występuje " + counter + " razy.");

       // program sprawdzi czy słowo jest palindromem
        String isPalindrome = "ala";
        if (isPalindrome(isPalindrome)) {
            System.out.println("Podane słowo jest palindromem");
        } else System.out.println("Podane słowo nie jest palindromem");

//Program do odwrócenia kolejności liter w zdaniu
        System.out.println("Podaj zdanie do odwrócenia: ");
        String sentence = sc.nextLine();
       String reversedSentence = reversed(sentence);
        System.out.println(reversedSentence);
    }
    public static int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int letterCounter(String task, char letter) {
        int counter = 0;
        for (int i = 0; i < task.length(); i++) {
            if (task.charAt(i) == letter) {
                counter++;
            }

        }
        return counter;
    }
    private static boolean isPalindrome(String text) {
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static String reversed(String text){
        text = new StringBuilder().append(text).reverse().toString();
        return text;
    }
}











