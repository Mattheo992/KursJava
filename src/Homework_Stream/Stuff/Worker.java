package Homework_Stream.Stuff;

import java.util.Objects;

public class Worker {
    private String name;
    private String surname;
    private int seniority;
    private double salary;

    public Worker(String name, String surname, int seniority, double salary) {
        this.name = name;
        this.surname = surname;
        this.seniority = seniority;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return seniority == worker.seniority && Double.compare(salary, worker.salary) == 0 && Objects.equals(name, worker.name) && Objects.equals(surname, worker.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, seniority, salary);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", seniority=" + seniority +
                ", salary=" + salary +
                '}';
    }
}
