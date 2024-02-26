package Homeworks;

import java.util.Scanner;
public class IsNumberPerfect {
    public static boolean isNumberPerfect(int number) {
        if (number <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę do sprawdzenia");
       int isNumberPerfect = sc.nextInt();
       if(isNumberPerfect(isNumberPerfect)){
           System.out.println("Liczba jest doskonała");
       }
       else {System.out.println("Liczba nie jest doskonała");}
       sc.close();
    }
}
