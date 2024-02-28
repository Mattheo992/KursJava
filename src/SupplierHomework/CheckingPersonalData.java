package SupplierHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CheckingPersonalData {
    public static void main(String[] args) {
        List<PersonalData> people = new ArrayList<>();
        people.add(new PersonalData("Adam", "Zdun", 21));
        people.add(new PersonalData("Jo", "Malo", 15));
        people.add(new PersonalData("Adam", "Kamiński", 69));
        Predicate<PersonalData> isPersonValid = person -> person.getName().length() > 2 &&
                person.getSurname().length() > 2 && person.getAge() <= 65;
        checkPersonalDate(people, isPersonValid);
        List<PersonalData> validPersons = people.stream()
                .filter(isPersonValid)
                .toList();
        System.out.println(validPersons);


    }

    public static void checkPersonalDate(List<PersonalData> people, Predicate<PersonalData> predicate) {
        for (PersonalData person : people) {
            if (predicate.test(person)) {
                System.out.println(person.getName() + " " + person.getSurname() + " spełnia wymogi.");
            } else {
                System.out.println(person.getName() + " " + person.getSurname() + " nie spełnia wymogów.");
            }
        }
    }
}
