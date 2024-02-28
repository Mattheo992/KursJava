package LessonStream;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam", "Kownacki", 21, 5001.00));
        students.add(new Student("Kamil", "Wąsik", 19, 2500.00));
        students.add(new Student("Adrian", "Surma", 20, 4999.00));
        students.add(new Student("Andrzej", "Boruta", 22, 5999.50));
//        students.stream()
//                .filter(n -> n.getName().startsWith("A")
//                        && n.getSalary() > 5000.00)
//                .forEach(System.out::println);
//        students.stream()
//                .map(n-> n.getName() + " " + n.getSurname())
//                .forEach(System.out::println);
        students.stream().sorted((s1, s2) -> s2.getAge() - s1.getAge()).
                peek(s-> System.out.println(s.getAge() + " "+ s.getName() + " " + s.getSurname()));
    }
}
