package Optional_Homeworks;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private boolean isDrunk;

    public Student(String name, int age, boolean isDrunk) {
        this.name = name;
        this.age = age;
        this.isDrunk = isDrunk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDrunk() {
        return isDrunk;
    }

    public void setDrunk(boolean drunk) {
        isDrunk = drunk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && isDrunk == student.isDrunk && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isDrunk);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isDrunk=" + isDrunk +
                '}';
    }
}
