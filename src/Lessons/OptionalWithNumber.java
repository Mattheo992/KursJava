package Lessons;

import javax.swing.text.html.Option;
import java.util.Optional;



public class OptionalWithNumber {
    public static void main(String[] args) {
Optional<Integer> number1 = Optional.of(9);
Optional<Integer> number2 = Optional.empty();
        System.out.println("kwadrat liczby 9 wynosi " + squareOfNumber(number1));

    }
    public static int squareOfNumber(Optional<Integer> number){
      return number.map(n -> n*n).orElse(0);
    }
}
