package Homeworks;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj słowo do permutacji: ");
        String text = sc.nextLine();
        int n = text.length();
        Permutations permutations = new Permutations();
        permutations.permute(text, 0, n - 1);
    }
    private void permute(String s, int x, int y) {
        if (x == y)
            System.out.println(s);
        else {
            for (int i = x; i < y; i++) {
                s = swap(s, x, i);
                permute(s, x + 1, y);
                s = swap(s, x, i);
            }
        }
    }
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
