package Homework_Stream.Stuff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WorkersWithTasksTest {
    public static void main(String[] args) {
        List<WorkersWithTasks> workers = Arrays.asList(
        new WorkersWithTasks("Kamil", "task1", "task2", "task3"),
        new WorkersWithTasks("Witek", "task1", "task4"),
        new WorkersWithTasks("Michał", "task5", "task6")
        );

        List<String> tasks = workers.stream().
                flatMap(e -> e.getTasks().stream())
                .collect(Collectors.toList());
        tasks.stream().
                forEach(System.out::println);
    }
}
