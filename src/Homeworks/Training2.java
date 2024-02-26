package Homeworks;

import java.util.Scanner;

public class Training2 {
    public static void main(String[] args) {

//        int number = 10;
//        long factorial = calculateFactorial(number);
//
//        System.out.println("Silnia liczby " + number + " wynosi: " + factorial);
//        System.out.println("Liczby od 1 do 20, pomijając liczby podzielne przez 3 to: ");
//        for (int i = 1; i <= 20; i++) {
//            if (i % 3 != 0) {
//                System.out.println(i);
//            }
//        }
//        System.out.println("Program oblicza średnią arytmetyczną z 10 podanych liczb");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Podaj 10 cyfr:");
//        double sum = 0;
//        for (int j = 0; j < 10; j++) {
//            double userNumber = sc.nextInt();
//            sum += userNumber;
//        }
//        double average = sum / 10;
//        System.out.println("Średni arytmetyczna z 10 podanych liczb wynosi : " + average);
//
//        System.out.println("Program wyświetla 15 pierwszych cyfr ciągu Fibonacciego");
        int[] fibonacciTab = new int[15];
        fibonacciTab[0] = 0;
        fibonacciTab[1] = 1;
        for (int i = 2; i < 15; i++) {
            fibonacciTab[i] = fibonacciTab[i - 1] + fibonacciTab[i - 2];
        }
        System.out.println("15 pierwszych cyfr w ciągu Fibonacciego to: ");
        for (int i = 0; i < 15; i++) {
            System.out.println(fibonacciTab[i] + " ");
        }
//        System.out.println("Program wyświetli liczby od 1 do 100, podnosząc je do kwadratu");
//        for (int i = 1; i <= 100; i++) {
//            int square = i * i;
//            System.out.println(i + " ^2 = " + square);
//        }
//        System.out.println("Program wyświetli sumę cyfr podanej liczby");
//        System.out.println("Podaj liczbę:");
//        int randomUserNumber = sc.nextInt();
//        int sumaCyfr = sumOfNumbers(randomUserNumber);
//        System.out.println("Suma cyfr liczby " + randomUserNumber + " wynosi: " + sumaCyfr);

//        System.out.println("Program wyświetla wszystkie liczby  zakresu od 1 do 100 pomijając te podzielne przez 5");
//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 != 0) {
//                System.out.println(i);
//            }
//        }
//        System.out.println("Program wyświetla liczby pierwsze w zakresie od 1 do 50");
//        for (int i = 2; i <= 50; i++) {
//            if (isPrimalNumber(i)) {
//                System.out.println(i);
//            }
//        }
//        System.out.println("Program wyświetla palindromy w zakresie od 1 do 1000");
//        for (int i = 1; i <= 1000; i++) {
//            if (isPalindrome(Integer.toString(i))) {
//                System.out.println(i);
//            }
//
//        }

//        isPalindrome("135631");
        System.out.println("Program wyświetli wynik potęgowania x^n:");
        System.out.println("Podaj wartość x: ");
        int x = sc.nextInt();
        System.out.println("Podaj wartość n: ");
        int n = sc.nextInt();
        long exponentiationResult = exponentiation(x, n);
        System.out.println("Wynik potęgowania " + x + " ^ " + n + " to: " + exponentiationResult);
        sc.close();
    }


    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    private static int sumOfNumbers(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    private static boolean isPrimalNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
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

    public static long exponentiation(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            long exponentationResult = 1;
            for (int i = 1; i <= n; i++) {
                exponentationResult *= x;
            }
            return exponentationResult;
        }
    }
    private static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }
}






