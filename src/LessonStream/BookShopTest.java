package LessonStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookShopTest {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1L, "Thinking in Java", "Bruce Eckel", 2006, 45.99, true));
        books.add(new Book(2L, "Clean Code", "Robert C. Martin", 2008, 39.99, true));
        books.add(new Book(3L, "Java: The Complete Reference", "Herbert Schildt", 2019, 55.50, true));
        books.add(new Book(4L, "Effective Java", "Joshua Bloch", 2017, 49.99, true));
        books.add(new Book(5L, "The Pragmatic Programmer", "Andrew Hunt, David Thomas", 2000, 59.99, true));
        books.add(new Book(6L, "Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", 1994, 65.00, true));
        books.add(new Book(7L, "Java Concurrency in Practice", "Brian Goetz", 2006, 52.99, true));
        books.add(new Book(8L, "Code Complete", "Steve McConnell", 2004, 48.50, false));
        books.add(new Book(9L, "Clean Architecture", "Robert C. Martin", 2017, 59.99, false));
        books.add(new Book(10L, "Head First Design Patterns", "Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra", 2004, 42.95, true));
   //Oblicz średnią cenę wszystkich dostępnych książek.
        double averagePriceOfAvailableBooks = books.stream()
                .filter(Book::isAvailable)
                .mapToDouble(Book::getPrice)
                .average()
                .orElse(0.0);
        System.out.println(averagePriceOfAvailableBooks);
        //Znajdź najdroższą dostępną książkę.
        Book TheMostExpensiveAverageBooks = books.stream()
                .filter(Book::isAvailable)
                .max(Comparator.comparingDouble(Book::getPrice)).orElse(null);
        System.out.println(TheMostExpensiveAverageBooks);
        //Oblicz sumę cen wszystkich książek wydanych przed 2000 rokiem.
        double pricesSumOfBooksPublishedBefore2000 = books.stream()
                .filter(n -> n.getPublicationYear() < 2000)
                .mapToDouble(Book::getPrice)
                .sum();
        //Znajdź najwcześniej opublikowaną książkę.
        Book theEarlierPublishedBook = books.stream()
                .min(Comparator.comparingInt(Book::getPublicationYear)).orElse(null);
        System.out.println("Najwcześniej opublikowana książka to: " +theEarlierPublishedBook );

        //Zlicz liczbę dostępnych książek o cenie powyżej 50.
        long countAvailableBooksWithPriceOver50 = books.stream()
                .filter(n -> n.isAvailable() && n.getPrice() > 50)
                .count();
        System.out.println(countAvailableBooksWithPriceOver50);

        //Oblicz średni rok publikacji wszystkich książek.

        double averagePublishYear = books.stream()
                .mapToInt(Book::getPublicationYear)
                .average().orElse(0.0);
        System.out.println(averagePublishYear);

        //Posortuj książki najpierw po cenie, a następnie po roku publikacji rosnąco.
        books.stream()
                .sorted(Comparator.comparingDouble(Book::getPrice).thenComparing(Book::getPublicationYear))
                .forEach(System.out::println);


    }

}
