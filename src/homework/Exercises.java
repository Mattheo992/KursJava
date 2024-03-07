package homework;

import homework.generator.HoldingGenerator;
import homework.generator.User;
import homework.model.*;
import homework.model.Currency;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Exercises {

    private static final List<Holding> HOLDINGS = new HoldingGenerator().generate();

    public static void main(String[] args) {
        showAllUser();
    }

    /**
     * Napisz metodę, która zwróci liczbę holdingów, w których jest przynajmniej jedna firma.
     */
    public static long getHoldingsWhereAreCompanies() {
        return HOLDINGS.stream()
                .filter(company -> !company.getCompanies().isEmpty())
                .count();
    }

    /**
     * Napisz metodę, która zwróci nazwy wszystkich holdingów pisane z wielkiej litery w formie listy.
     */
    public static List<String> getHoldingNames() {
        return HOLDINGS.stream()
                .filter(holding -> holding.getName() != null)
                .map(holding -> holding.getName().toUpperCase())
                .collect(Collectors.toList());
    }

    /**
     * Zwraca nazwy wszystkich holdingów sklejone w jeden string i posortowane.
     * String ma postać: (Coca-Cola, Nestle, Pepsico)
     */
    public static String getHoldingNamesAsString() {
        return HOLDINGS.stream()
                .map(Holding::getName)
                .sorted()
                .collect(Collectors.joining(", ", "(", ")"));
    }

    /**
     * Zwraca liczbę firm we wszystkich holdingach.
     */
    public static long getCompaniesAmount() {
        return HOLDINGS.stream()
                .mapToLong(holding -> holding.getCompanies().size())
                .count();
    }


    /**
     * Zwraca liczbę wszystkich pracowników we wszystkich firmach.
     */
    public static long getAllUserAmount() {
        return HOLDINGS.stream()
                .flatMap(holding -> holding.getCompanies().stream())
                .mapToLong(company -> company.getUsers().size())
                .sum();
    }

    /**
     * Zwraca listę wszystkich firm jako listę, której implementacja to LinkedList. Obiektów nie przepisujemy
     * po zakończeniu działania strumienia.
     */
    public static LinkedList<String> getAllCompaniesNamesAsLinkedList() {
        return HOLDINGS.stream()
                .flatMap(holding -> holding.getCompanies().stream())
                .map(Company::getName)
                .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Przelicza kwotę na rachunku na złotówki za pomocą kursu określonego w enum Currency.
     */
    public static BigDecimal getAccountAmountInPLN(Account account) {
        return account
                .getAmount()
                .multiply(BigDecimal.valueOf(account.getCurrency().getRate()))
                .round(new MathContext(2, RoundingMode.HALF_UP));
    }


    /**
     * Zwraca imiona użytkowników w formie zbioru, którzy spełniają podany warunek.
     */
    public static Set<String> getUsersForPredicate(final Predicate<User> userPredicate) {
        return HOLDINGS.stream()
                .flatMap(holding -> holding.getCompanies().stream())
                .flatMap(company -> company.getUsers().stream())
                .filter(userPredicate)
                .map(User::getFirstName)
                .collect(Collectors.toSet());

    }

    /**
     * Dla każdej firmy uruchamia przekazaną metodę.
     */
    public static void executeForEachCompany(Consumer<Company> consumer) {
        HOLDINGS.stream()
                .flatMap(h -> h.getCompanies().stream())
                .forEach(consumer);
    }

    /**
     * Wyszukuje najbogatsza kobietę i zwraca ją. Metoda musi uzwględniać to że rachunki są w różnych walutach.
     */
    //pomoc w rozwiązaniu problemu w zadaniu: https://stackoverflow.com/a/55052733/9360524

        public static Optional<User> getRichestWoman(List<Holding> holdings) {
            return holdings.stream()
                    .flatMap(holding -> holding.getCompanies().stream())
                    .flatMap(company -> company.getUsers().stream())
                    .filter(user -> user.getSex() == Sex.WOMAN)
                    .max(Comparator.comparing(Exercises::getUserAmountInPLN));
    }
    private static BigDecimal getUserAmountInPLN(final User user){
            return user.getAccounts().stream()
                    .map(account -> account.getAmount().multiply(BigDecimal.valueOf(account.getCurrency().getRate())))
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Zwraca nazwy pierwszych N firm. Kolejność nie ma znaczenia.
     */
    private static Set<String> getFirstNCompany(final int n) {
        return HOLDINGS.stream()
                .flatMap(holding -> holding.getCompanies().stream())
                .map(Company::getName)
                .limit(n)
                .collect(Collectors.toSet());
    }

    ;

    /**
     * Zwraca mapę firm, gdzie kluczem jest jej nazwa a wartością lista pracowników.
     */
    public static Map<String, List<User>> getUserPerCompany() {
        return HOLDINGS.stream()
                .flatMap(holding -> holding.getCompanies().stream())
                .collect(Collectors.toMap(Company::getName,
                        Company::getUsers));
    }


    /**
     * Zwraca pierwszego z brzegu użytkownika dla podanego warunku. W przypadku kiedy nie znajdzie użytkownika, wyrzuca
     * wyjątek IllegalArgumentException.
     */
    public static User getUser(final Predicate<User> predicate) {
        return HOLDINGS.stream()
                .flatMap(holding -> holding.getCompanies().stream())
                .flatMap(company -> company.getUsers().stream())
                .filter(predicate)
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Nie znaleziono użytkownika dla podanego warunku"));
    }

    /**
     * Zwraca mapę rachunków, gdzie kluczem jest numer rachunku, a wartością ten rachunek.
     */
    public static Map<String, Account> createAccountsMap() {
        return HOLDINGS.stream()
                .flatMap(holding -> holding.getCompanies().stream())
                .flatMap(company -> company.getUsers().stream())
                .flatMap(user -> user.getAccounts().stream())
                .collect(Collectors.toMap(Account::getNumber, Function.identity()));

    }

    /**
     * Zwraca listę wszystkich imion w postaci Stringa, gdzie imiona oddzielone są spacją i nie zawierają powtórzeń.
     */
    public static String getUserNames() {
        return HOLDINGS.stream()
                .flatMap(holding -> holding.getCompanies().stream())
                .flatMap(company -> company.getUsers().stream())
                .map(User::getFirstName)
                .distinct()
                .collect(Collectors.joining(" "));

    }

    /**
     * Metoda wypisuje na ekranie wszystkich użytkowników (imię, nazwisko) posortowanych od z do a.
     * Zosia Psikuta, Zenon Kucowski, Zenek Jawowy ... Alfred Pasibrzuch, Adam Wojcik //w jednej lini odcielone przecinkami
     */
    public static void showAllUser() {
        HOLDINGS.stream()
                .flatMap(holding -> holding.getCompanies().stream())
                .flatMap(company -> company.getUsers().stream())
                .sorted(Comparator.comparing(User::getFirstName, Comparator.reverseOrder())
                        .thenComparing(Comparator.comparing(User::getLastName)))
                .map(user -> user.getFirstName() + " " + user.getLastName())
                .collect(Collectors.joining(", "));
    }

    /**
     * Zwraca zbiór walut w jakich są rachunki.
     */
    public static Set<Currency> getCurenciesSet() {
        return HOLDINGS.stream()
                .flatMap(holding -> holding.getCompanies().stream())
                .flatMap(company -> company.getUsers().stream())
                .flatMap(user -> user.getAccounts().stream())
                .map(Account::getCurrency)
                .collect(Collectors.toSet());
    }

    /**
     * Zwraca strumień wszystkich firm.
     */
    private static Stream<Company> getCompaniesStream() {
        return HOLDINGS.stream()
                .flatMap(holding -> holding.getCompanies().stream());
    }

    /**
     * Tworzy strumień użytkowników.
     */
    private static Stream<User> getUsersStream() {
        return getCompaniesStream()
                .flatMap(company -> company.getUsers().stream());
    }

    /**
     * Tworzy strumień rachunków.
     */
    private static Stream<Account> getAccountsStream() {
        return getUsersStream()
                .flatMap(user -> user.getAccounts().stream());
    }

}
