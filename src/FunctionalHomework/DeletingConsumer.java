package FunctionalHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DeletingConsumer {
    //Stwórz Consumer, który usunie wszystkie elementy z kolekcji, które spełniają określone kryteria.
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        Consumer<List<Integer>> deletingElement = n -> n.removeIf(number -> number % 2 ==0);
        deletingElement.accept(numbers);
        System.out.println("Po usunięciu liczb: ");
        System.out.println(numbers);
    }
}
