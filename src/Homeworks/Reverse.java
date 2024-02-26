package Homeworks;

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Podaj zdanie do odwrócenia");
        String sentence = sc.nextLine();
        String reverseSentence = reversSentence(sentence);
        System.out.println("Odwrócone zdanie " + sentence + " to " + reverseSentence);
    }
    private static String reversSentence(String text){
        char[] letterList = text.toCharArray();
        int lenght = text.length();
        for (int i = 0; i < lenght / 2 ; i++) {
           char temp = letterList[i];
           letterList[i] = letterList[lenght - 1 - i];
           letterList[lenght - 1 - i] = temp;
        }
        return new String(letterList);
    }
}
