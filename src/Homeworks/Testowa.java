package Homeworks;

import java.util.Scanner;

public class Testowa {
    public static void main(String[] args) {
//        int[][] numbers = new int[3][];
//        int[] line0 = {2, 7, 8};
//        int[] line1 = {5, 7, 1};
//        int[] line2 = {2, 5, 3};
//
//        numbers[0] = line0;
//        numbers[1] = line1;
//        numbers[2] = line2;
//        int sum = (numbers[0][0] + numbers[1][1] + numbers[2][2])
//                + (numbers[0][2]) + numbers[1][1] + numbers[2][0];
//        System.out.println("Suma sum przekątnych tabeli wielowymiarowej wynosi: " + sum);
//
//
//        System.out.println("Liczby od 1 do 30 podzielne przez 3: ");
//        for (int i = 1; i <= 30; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }
//        System.out.println("Liczby parzyste od 1 do 50");
//        for (int j = 1; j <= 50; j++) {
//            if (j % 2 == 0) {
//                System.out.println(j);
//            }
//
//        }
//        int number = 5;
//        for (int k = 1; k <= 10; k++) {
//            int result = number * k;
//            System.out.println(number + " * " + k + " = " + result);
//        }
//        System.out.println("Program wyświetla liczby od 10 do 1");
//        for (int l = 10; l >= 1; l--) {
//            System.out.println(l);
//        }
//
//        System.out.println("Program wyświetla sumę cyfr nieparzystych od 1 do 50");
//        int suma = 0;
//        for (int m = 1; m <= 50; m += 2) {
//            suma += m;
//        }
//        System.out.println(suma);
        int a = 0, b = 1;
        for (int i = 0; i < 15; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}














