package OperationLesson;

import java.util.function.Supplier;

public class StudentSupplierTest {
    private static final NewStudent DEFAULT_STUDENT = new NewStudent("Kamil", "Wasik", 21);

    public static void main(String[] args) {

        Supplier<NewStudent> newStudentSupplier = () -> DEFAULT_STUDENT;
        NewStudent student = newStudentSupplier.get();
        System.out.println(student.getName() + " " + student.getLastName() + " " + student.getAge());
    }

}

