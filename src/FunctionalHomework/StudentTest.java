package FunctionalHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("Kamil", "Wąsik", 21);
        Function<Student, String> getAgeAsString = StudentTest::getAgeAsString;
        System.out.println("Wiek studenta " + student1.getName() + " " + student1.getLastName()
                + " to: " + getAgeAsString.apply(student1)+ " lat.");

    }
    public static String getAgeAsString(Student students) {
        return Integer.toString(students.getAge());
    }
}

