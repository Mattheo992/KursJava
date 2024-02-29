package Homework_Stream.Students;

import java.util.Objects;

public class StudentExamResult {
    private String name;
    private String surname;
    private double examResult;

    public StudentExamResult(String name, String surname, int examResult) {
        this.name = name;
        this.surname = surname;
        this.examResult = examResult;
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

    public double getExamResult() {
        return examResult;
    }

    public void setExamResult(double examResult) {
        this.examResult = examResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentExamResult that = (StudentExamResult) o;
        return examResult == that.examResult && Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, examResult);
    }

    @Override
    public String toString() {
        return "StudentExamResult{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", examResult=" + examResult + " % " +
                '}';
    }
}
