package HomeworkStream2;

import java.util.ArrayList;
import java.util.List;

public class AreEveryoneOfAge {
    public static void main(String[] args) {
        List<AreEveryoneOfAge> people = new ArrayList<>();
        people.add(new AreEveryoneOfAge("Kamil", 21));
        people.add(new AreEveryoneOfAge("Bożena", 69));
        people.add(new AreEveryoneOfAge("Jeremiasz", 17));

        boolean arePeopleOfAge = people.stream()
                .allMatch(n -> n.getAge() >= 18);
        System.out.println(arePeopleOfAge);

    }
    private String name;
    private int age;

    public AreEveryoneOfAge(String name, int age) {
        this.name = name;
        this.age = age;
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
}
