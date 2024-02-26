package Optional_Homeworks;

import Lessons.Bird;

import java.util.Objects;
import java.util.function.BiFunction;

public class LessonBiFunction {
    public static void main(String[] args) {
        //Stworz bifunction, ktory doda dwie liczby
        BiFunction<Integer, Integer, Integer> addNumbers = Integer::sum;
        int result = addNumbers.apply(5, 7);
        System.out.println(result);

        //Stworz BiFunction, który przyjmuje długość i szerokość prostokąta jako liczby całkowite i zwraca pole prostokąta.

        BiFunction<Double, Double, Double> square = (a, b) -> a * b;

        double squareResult = square.apply(4.0, 5.5);
        System.out.println(squareResult);
//Stwórz BiFunction, który przyjmuje dwa ciągi tekstowe i zwraca ich połączenie.
        BiFunction<String, String, String> makeNewString = (a, b) -> a + b;
        String newString = makeNewString.apply("Nazywam się", " Kamil Zdun");
        System.out.println(newString);

        BiFunction<String, Integer,LessonBiFunction> newPerson = LessonBiFunction::new;
        LessonBiFunction person1 = newPerson.apply("Marzena", 31);
        System.out.println(person1.getName() +" " + person1.getAge());

        //Stwórz BiFunction, który porównuje dwie wartości i zwraca true, jeśli są one równe, a w przeciwnym razie false.

        BiFunction<String, String, Boolean> areEquals = String::equals;
        boolean theSame = areEquals.apply("aabbb", "abb");
        System.out.println(theSame);
        //Stwórz TriFunction, który na podstawie trzech argumentów tworzy nowy obiekt lub strukturę danych.
TriFunction<String, String, Integer, LessonBiFunction> personGenerator = LessonBiFunction::new;
LessonBiFunction person2 = personGenerator.apply("Kamil", "Wąsik", 16);
        System.out.println(person2.getName() + " " + person2.getSurname() + " " + person2.getAge());
        //Stwórz TriFunction, która przyjmuje trzy oceny studenta i zwraca ich średnią arytmetyczną
        TriFunction<Double, Double, Double, Double> averageGrade = (a, b, c) -> (a + b + c)/3;
        //Stwórz TriFunction, która przyjmuje trzy ciągi tekstowe i łączy je w jeden.
TriFunction<String, String, String, String> makeNewSentece = (a, b, c) -> a.concat(b).concat(c);
String newSentence = makeNewSentece.apply("Apple", "Pen", "Applepen");
    }
    String name;
    String surname;
    int age;

    public LessonBiFunction(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LessonBiFunction(String name, int age) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LessonBiFunction that = (LessonBiFunction) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "LessonBiFunction{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}