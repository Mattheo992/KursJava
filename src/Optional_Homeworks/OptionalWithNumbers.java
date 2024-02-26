package Optional_Homeworks;

import java.util.Optional;

public class OptionalWithNumbers {
    public static void main(String[] args) {
        Optional<Integer> number1 = Optional.of(25);
        Optional<Integer> number2 = Optional.of(17);
        Optional<Integer> number3 = Optional.empty();
        System.out.println("Suma dwóch Optional wynosi: " + sumOfTwoOptionals(number1, number3, 0));
    }

    public static int sumOfTwoOptionals(Optional<Integer> number1, Optional<Integer> number2, int defaultValue){
        if(number1.isPresent() && number2.isPresent()){
            return number1.get() + number2.get();
        }
        else
            return  defaultValue;
    }
}