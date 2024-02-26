package LessonsException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class isNumberInteger {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        String userInt = sc.nextLine();
        try {
            int number = Integer.parseInt(userInt);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("nieprawidłowa liczba");
        } finally {
            sc.close();
        }
    }
}
