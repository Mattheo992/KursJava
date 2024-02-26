package Optional_Homeworks;
import java.util.Optional;
public class OptionalSquareOfDefault {
    public static void main(String[] args) {
        Optional<Integer> number1 = Optional.of(11);
        Optional<Integer> number2 = Optional.empty();
        System.out.println(calculateSquare(number2, getDefaultSquare()));


    }
    public static int getDefaultSquare() {
        int defaultValue = 10;
        return defaultValue * defaultValue;
    }
    public static int calculateSquare (Optional<Integer> optional, int defaultValue){
        return optional.map(value -> value * value).orElseThrow(() -> new IllegalArgumentException("Optional nie może być pusty"));
    }
//o
    }

