package Homework_All_Functionals;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ArithmeticMean {
    public static void main(String[] args) {
        Function<List<Double>, Double> arithmeticMean = list->{
            double sum = 0;
            for (Double n : list){
                sum += n;
            }
            return sum/ list.size();
        };
        List<Double> numbers = new ArrayList<>(List.of(1.0, 2.5, 3.0, 5.0));
       double result =  arithmeticMean.apply(numbers);
        System.out.println(result);
    }
}
