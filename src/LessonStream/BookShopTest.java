package LessonStream;

import java.util.*;
import java.util.stream.Collectors;

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
        Book TheMostExpensiveAvailableBooks = books.stream()
                .filter(Book::isAvailable)
                .max(Comparator.comparingDouble(Book::getPrice)).orElse(null);
        System.out.println(TheMostExpensiveAvailableBooks);
        //Oblicz sumę cen wszystkich książek wydanych przed 2000 rokiem.
        double pricesSumOfBooksPublishedBefore2000 = books.stream()
                .filter(n -> n.getPublicationYear() < 2000)
                .mapToDouble(Book::getPrice)
                .sum();
        //Znajdź najwcześniej opublikowaną książkę.
        Book theEarlierPublishedBook = books.stream()
                .min(Comparator.comparingInt(Book::getPublicationYear)).orElse(null);
        System.out.println("Najwcześniej opublikowana książka to: " + theEarlierPublishedBook);

        //Zlicz liczbę dostępnych książek o cenie powyżej 50.
        long countAvailableBooksWithPriceOver50 = books.stream()
                .filter(n -> n.isAvailable() && n.getPrice() > 50)
                .count();
        System.out.println(countAvailableBooksWithPriceOver50);

        //Oblicz średni rok publikacji wszystkich książek.

        double averagePublishYear = books.stream()
                .mapToInt(Book::getPublicationYear)
                .average().orElse(0.0);
        System.out.println("średnia rok publikacji " + averagePublishYear);

        //Posortuj książki najpierw po cenie, a następnie po roku publikacji rosnąco.
        books.stream()
                .sorted(Comparator.comparingDouble(Book::getPrice).thenComparing(Book::getPublicationYear))
                .forEach(System.out::println);

        //Zlicz liczbę dostępnych książek dla każdego autora.
        Map<String, Long> booksCount = books.stream()
                .filter(Book::isAvailable)
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));
        booksCount.forEach((author, count) -> System.out.println(author + " : " + count));
//Uzyskaj listę książek z określonego roku publikacji, posortowaną malejąco według ceny.
        List<Book> booksPublishedIn2017 = books.stream()
                .filter(n -> n.getPublicationYear() == 2017)
                .sorted(Comparator.comparing(Book::getPrice).reversed())
                .collect(Collectors.toList());

        //Sprawdź, czy dla każdego autora istnieje przynajmniej jedna dostępna książka.

        Map<String, Boolean> anyBookAvailableByAuthor = books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.mapping(Book::isAvailable,
                        Collectors.reducing(false, (a, b) -> a || b))));
        anyBookAvailableByAuthor.forEach((author, isBookAvailable) -> System.out.println(author + " "
                + isBookAvailable));
        //Uzyskaj posortowaną listę książek według autorów, a następnie malejąco po roku publikacji.

        List<Book> booksSortedByAuthorsAndThenByPublishedYear = books.stream()
                .filter(n -> n.getAuthor() != null)
                .sorted(Comparator.comparing(Book::getAuthor)
                        .thenComparing(Comparator.comparing(Book::getPublicationYear).reversed()))
                .collect(Collectors.toList());
        booksSortedByAuthorsAndThenByPublishedYear.forEach(System.out::println);
        //Zwróć listę książek, których tytuł lub autor zawiera wyrażenie "Java".
        List<Book> booksWithWordJava = books.stream()
                .filter(n -> n.getAuthor().contains("Java") || n.getTitle().contains("Java"))
                .collect(Collectors.toList());
        System.out.println();
        booksWithWordJava.forEach(System.out::println);
        //Oblicz sumę cen wszystkich książek wydanych w latach, których suma cyfr jest liczbą pierwszą
        double sumOfPricesIfPublishingYearIsFirst = books.stream()
                .filter(n -> isNumberFirst(n.getPublicationYear()))
                .mapToDouble(Book::getPrice)
                .sum();
        System.out.println(sumOfPricesIfPublishingYearIsFirst);
        //Znajdź książkę, która ma najdłuższy tytuł spośród wszystkich książek.
        Book bookWithMaxChars = books.stream()
                .max(Comparator.comparing(n -> n.getTitle().length()))
                .orElse(null);
        System.out.println("książka z najdłuższym tytułem to: " + bookWithMaxChars.getTitle());
        //Zwróć listę tytułów książek, które rozpoczynają się od litery "C" i kończą na "e".
        List<Book> booksWithTitleStartedWithCAndAndWithE = books.stream()
                .filter(n -> n.getTitle().toUpperCase().startsWith("C") && n.getTitle().toLowerCase().endsWith("e"))
                .collect(Collectors.toList());
        booksWithTitleStartedWithCAndAndWithE.forEach(System.out::println);
//Znajdź najtańszą książkę, która ma co najmniej dwóch autorów.
        Optional<Book> cheapestBookWithMin2Authors = books.stream()
                .filter(n -> n.getAuthor() != null)
                .filter(n -> n.getAuthor().split(", ").length >= 2)
                .min(Comparator.comparingDouble(Book::getPrice));
        if (cheapestBookWithMin2Authors.isPresent()) {
            System.out.println("Najtańsza książka z conajmniej 2 autorami to "
                    + cheapestBookWithMin2Authors.get().getTitle());
        } else {
            System.out.println("Nie ma takiej książki");
        }
        //Zlicz ilość książek dla każdego roku publikacji i zwróć mapę, gdzie kluczem jest rok publikacji,
        // a wartością liczba książek.
        Map<Integer, Long> countBoosByPublishingYear = books.stream()
                .collect(Collectors.groupingBy(Book::getPublicationYear, Collectors.counting()));
        System.out.println(countBoosByPublishingYear);
        //Znajdź dwie książki o największej różnicy cenowej między sobą.
        String collect = books.stream()
                .collect(Collectors.teeing(
                        Collectors.maxBy(Comparator.comparing(Book::getPrice)),
                        Collectors.minBy(Comparator.comparing(Book::getPrice)),
                        (maxBook, minBook) -> "Nawiększa różnica cenowa jest między: " + minBook.get().getTitle()
                                + " " + minBook.get().getPrice() + " a " + maxBook.get().getTitle()
                                + " " + maxBook.get().getPrice()
                ));
        System.out.println(collect);
        //Sprawdź, czy wszystkie dostępne książki są droższe od 30.
        boolean areEveryAvailableBooksAreMoreExpensiveThan30 = books.stream()
                .filter(Book::isAvailable)
                .allMatch(n -> n.getPrice() > 30);
        if (areEveryAvailableBooksAreMoreExpensiveThan30) {
            System.out.println("Wszystkie dostępne książki są droższe od 30");
        } else {
            System.out.println("Nie wszystkie dostepne książki są droższe od 30");
        }
        //Znajdź najmłodszą dostępną książkę.
        books.stream()
                .filter(Book::isAvailable)
                .min(Comparator.comparing(Book::getPublicationYear));
        //Znajdź autora, który ma najwięcej książek w zbiorze.
        books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        //Utwórz mapę, gdzie kluczem jest rok publikacji, a wartością lista książek opublikowanych w tym roku.
        System.out.println("Utwórz mapę, gdzie kluczem jest rok publikacji, a wartością lista książek opublikowanych w tym roku.");
        Map<Integer, List<Book>> collect1 = books.stream()
                .collect(Collectors.groupingBy(Book::getPublicationYear));
        System.out.println(collect1);

        //Znajdź trzy najdroższe książki w zbiorze.
        books.stream()
                .sorted(Comparator.comparing(Book::getPrice).reversed())
                .limit(3)
                .collect(Collectors.toList());
        //Sprawdź, czy wszystkie książki są dostępne.
        boolean areAllAvailable = books.stream()
                .allMatch(Book::isAvailable);
        //Znajdź książkę z największą liczbą autorów.
        books.stream()
                .max(Comparator.comparing(n -> n.getAuthor().split(", ").length))
                .orElse(null);
        ;
        //Znajdź najwcześniej opublikowaną książkę w każdym roku.
        Map<Integer, Optional<Book>> collect2 = books.stream()
                .collect(Collectors.groupingBy(Book::getPublicationYear
                        , Collectors.minBy(Comparator.comparing(Book::getPublicationYear))));
        //Oblicz średnią cenę książek dla każdego autora.
        books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor
                        , Collectors.averagingDouble(Book::getPrice)));
        //Znajdź najtańszą dostępną książkę autorstwa konkretnego autora.
        Map<String, Optional<Book>> collect3 = books.stream()
                .filter(Book::isAvailable)
                .collect(Collectors.groupingBy(Book::getAuthor
                        , Collectors.minBy(Comparator.comparingDouble(Book::getPrice))));
        System.out.println(collect3);
        //Utwórz listę książek z unikalnymi tytułami.
        books.stream()
                .map(Book::getTitle)
                .distinct()
                .collect(Collectors.toList());
    }

    private static boolean isNumberFirst(int year) {
        int sum = String.valueOf(year).chars()
                .map(Character::getNumericValue)
                .sum();
        if (sum > 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(sum); i++) {
            if (sum % 2 == 0) {
                return false;
            }
        }
        return true;
    }

}
