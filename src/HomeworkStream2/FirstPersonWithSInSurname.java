package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FirstPersonWithSInSurname {
    public static void main(String[] args) {
        List<FirstPersonWithSInSurname> surnameWithS = new ArrayList<>();
        surnameWithS.add(new FirstPersonWithSInSurname("Adam", "Kownacki", 21));
        surnameWithS.add(new FirstPersonWithSInSurname("Kamiil", "Sawicki", 32));
        surnameWithS.add(new FirstPersonWithSInSurname("Maciej", "Sapała", 69));
        Optional<FirstPersonWithSInSurname> firstPersonsSurnameWithS = surnameWithS.stream()
                .filter(n -> n.getSurname().startsWith("S"))
                .findFirst();
        System.out.println(firstPersonsSurnameWithS);
    }
    private String name;
    private String surname;
    private int age;

    public FirstPersonWithSInSurname(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FirstPersonWithSInSurname that = (FirstPersonWithSInSurname) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "FirstPersonWithSInSurname{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
