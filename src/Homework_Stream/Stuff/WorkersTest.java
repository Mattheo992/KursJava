package Homework_Stream.Stuff;

import java.util.ArrayList;
import java.util.List;

public class WorkersTest {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Kamil", "Wąsik", 4, 3999.00));
        workers.add(new Worker("Maciej", "Zdun", 15, 6500.00));
        workers.add(new Worker("Ireneusz", "Kostek", 7, 5000.01));
        workers.add(new Worker("Sebastian", "Strzała", 1, 2959.00));
        workers.stream().filter(worker->worker.getSalary()>5000.00).forEach(System.out::println);
    }
}
