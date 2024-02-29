package Homework_Stream.Stuff;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class WorkersWithTasks {
    private String name;
    private List<String> tasks;

    public WorkersWithTasks(String name, String... tasks) {
        this.name = name;
        this.tasks = Arrays.asList(tasks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkersWithTasks that = (WorkersWithTasks) o;
        return Objects.equals(name, that.name) && Objects.equals(tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tasks);
    }

}
