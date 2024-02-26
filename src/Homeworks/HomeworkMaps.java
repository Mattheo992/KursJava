package Homeworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeworkMaps {
    public static void main(String[] args) {
        //mapa z kategoriami ksiażek
        List<Books> books = List.of(
                new Books("Programowanie Java", "Programowanie"),
                new Books("Miecz przeznaczenia", "Fantastyka"),
                new Books("Władca Pierścieni: Powrót króla", "Fantastyka"),
                new Books("Gra o tron", "Fantastyka"),
                new Books("Czysty kod", "Programowanie"));

        Map<String, List<Books>> booksByCategory = new HashMap<>();

        for (Books book : books) {
            booksByCategory.computeIfAbsent(book.getCategory(), k -> new ArrayList<>()).add(book);
        }

        //wyświetlanie mapy z grupami

        for (Map.Entry<String, List<Books>> entry : booksByCategory.entrySet()) {
            String category = entry.getKey();
            List<Books> categoryBooks = entry.getValue();

            System.out.println("Kategoria :" + category);
            System.out.println("Książki: " + categoryBooks);
            System.out.println();
        }


        //grupowanie po pierwszych literach
        List<String> words = List.of("banana", "telephone", "barber", "car", "bite", "cell", "trophy");
        Map<Character, List<String>> wordsByLetter = new HashMap<>();
        for (String word : words) {
            wordsByLetter.computeIfAbsent(word.charAt(0), k -> new ArrayList<>()).add(word);
        }

        for (Map.Entry<Character, List<String>> entry : wordsByLetter.entrySet()) {
            System.out.println("Pierwsza litera: " + entry.getKey());
            System.out.println("Słowa: " + entry.getValue());
        }

//grupuje słowa po długości

        List<String> word = List.of("Alfabet", "Drzewo", "Energetyk", "Programowanie", "Czosnek", "Gra");
        Map<Integer, List<String>> wordsByLenght = new HashMap<>();

        for (String text : word) {
            wordsByLenght.computeIfAbsent(text.length(), k -> new ArrayList<>()).add(text);
        }

        for (Map.Entry<Integer, List<String>> entry : wordsByLenght.entrySet()) {
            System.out.println("Długość słowa: " + entry.getKey());
            System.out.println("Słowo: " + entry.getValue());
        }

        Map<String, Map<String, Double>> studentsGrades = new HashMap<>();
        addGrade(studentsGrades, "Adam Kowalski", "Matematyka", 4.0);
        addGrade(studentsGrades, "Michał Walak", "Informatyka", null);

        System.out.println(studentsGrades);


    }

    public static void addGrade(Map<String, Map<String, Double>> studentGrades, String studentName, String subject, Double mark) {
        Map<String, Double> marksForStudens = studentGrades.computeIfAbsent(studentName, k -> new HashMap<>());
        double defaultMark = 3.5;
        marksForStudens.putIfAbsent(subject, defaultMark);
        double actualStudentMark = (mark != null) ? mark : defaultMark;
        marksForStudens.put(subject, actualStudentMark);
    }
}