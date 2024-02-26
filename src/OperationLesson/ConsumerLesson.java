package OperationLesson;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerLesson {
    public static void main(String[] args) {

        Consumer<String> printConsumer = s -> {
            System.out.println("wyświetlono:" + s);
            System.out.println("dodano:" + s);
            System.out.println("wywołano:" + s);
            System.out.println("napisano:" + s);};
        List<String> strings = List.of("Banan", "Gruszka", "Jabłko");
        strings.forEach(printConsumer);

        }
    }

