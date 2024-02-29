package Homework_Stream.Students;

import java.util.ArrayList;
import java.util.List;

public class StudentsExamResultTest {
    public static void main(String[] args) {
        List<StudentExamResult> studentsExamResult = new ArrayList<>();
        studentsExamResult.add(new StudentExamResult("Maciej", "Lolek", 98));
        studentsExamResult.add(new StudentExamResult("Mateusz", "Olgiert", 69));
        studentsExamResult.add(new StudentExamResult("Robert", "Prawy", 45));
        studentsExamResult.stream()
                .filter(n -> n.getExamResult() > 60.00)
                .forEach(System.out::println);
    }
}
