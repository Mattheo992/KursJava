package Optional_Homeworks;

import java.util.Optional;

public class SquareRootOptional {
    public static void main(String[] args) {

//Napisz metodę, która przyjmuje Optional zawierający liczbę całkowitą. Jeśli Optional zawiera liczbę,
// metoda powinna zwrócić jej pierwiastek kwadratowy.
// Jeśli Optional jest pusty, metoda powinna zwrócić pierwiastek kwadratowy domyślnej wartości.
        Optional<Integer> number1 = Optional.of(5);
        Optional<Integer> number2 = Optional.empty();
        System.out.println(calculateSquareRoot(number1,getDefaultValue()));
        System.out.println(calculateSquareRoot(number2,getDefaultValue()));
    }
    public static double getDefaultValue(){
        int defaultValue = 25;
        return  Math.sqrt(defaultValue);
    }

    public static double calculateSquareRoot(Optional<Integer> optional, double defaultValue){
        return optional.map(Math::sqrt).orElseGet(SquareRootOptional::getDefaultValue);
    }

}