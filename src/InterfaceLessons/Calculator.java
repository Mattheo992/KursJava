package InterfaceLessons;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Dzialanie dzialanie;
        Scanner sc = new Scanner(System.in);

        System.out.println("Jaką operację chcesz wykonać?: 1- Dodawanie, 2 - Odejmowanie, 3  - mnożenie, 4 dzielenie");
int operation = sc.nextInt();
switch (operation) {
    case 1:
        dzialanie = new Addition();
        break;
    case 2:
        dzialanie = new Subtraction();
        break;
    case 3:
        dzialanie = new Multiplication();
        break;
    case 4:
        dzialanie = new Division();
        break;
    default:
        System.out.println("Wybrano błędny rodzaj operacji");
        return;

}
sc.close();
        double arg1 = 5.2;
        double arg2 = 4.3;
        double result = dzialanie.licz(arg1, arg2);
        System.out.println("Wynik operacji: " + result);
}


    }

