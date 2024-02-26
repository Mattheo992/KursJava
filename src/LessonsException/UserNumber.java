package LessonsException;
import java.util.Scanner;

public class UserNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę do sprawdzenia czy jest dodatnia");
        int userNumber = sc.nextInt();
        UserNumber un = new UserNumber();
        try{un.isNumberPositive(userNumber);}
        catch (Exception NumberIsNegativeException){
            System.out.println(NumberIsNegativeException.getMessage());
        }
    }
    public void isNumberPositive(int a){
        if (a <= 0){
            throw new NumberIsNegativeException("Liczba nie jest dodatnia");
        }
        else System.out.println("Liczba " + a + " jest dodatnia.");
    }
}
