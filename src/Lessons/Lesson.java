package Lessons;

public class Lesson {
    private static final int PESEL_LENGTH = 11;

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 12;
        printSumOfTwoNumbers(a, b);
        int sum = getSumOfThreeNumbers(a, b, c);
        System.out.println(sum);
    }

    private static void printSumOfTwoNumbers(int a, int b) {
        System.out.println(a + b);
    }

    private static int getSumOfThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }

    private static void bark() {
        System.out.println("Hau");
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    private static double sum(double a, double b) {
        return a + b;
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
