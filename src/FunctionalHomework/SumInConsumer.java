package FunctionalHomework;

import java.util.List;
import java.util.function.Consumer;

public class SumInConsumer {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 7, 10, 11);
        sumOfNumbers.accept(numbers);
    }
       public static Consumer<List<Integer>> sumOfNumbers = list ->{
            int sum =0;
            for (Integer number : list){
                sum +=number;
            }
            System.out.println("suma liczbny z listy wynosi: " + sum);
        };

    }

