package Homeworks;

import java.util.Scanner;

public class SumTooneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = sc.nextInt();

        int result = sumToOneNumber(number);

        System.out.println("Suma cyfr do jednej cyfry: " + result);
    }

    private static int sumToOneNumber(int number) {
        while (number >= 10) {
            int sum = 0;


            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            number = sum;
        }

        return number;
    }
}

