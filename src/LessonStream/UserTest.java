package LessonStream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user1 = new User(1L, "Ada", "Antczak", "a_antczak@email.com", 3456.5, 20, Job.JAVA_DEVELOPER);
        User user2 = new User(2L, "Beata", "Byk", "b_byk@email.com", 11223.5, 33, Job.SCALA_DEVELOPER);
        User user3 = new User(3L, "Czesław", "Cios", "c_cios@email.com", 6500.D, 33, Job.JAVA_DEVELOPER);
        User user4 = new User(4L, "Daria", "Chodkowska", "d_chodkowska@email.com", 2344.3, 40, Job.JAVA_DEVELOPER);
        User user5 = new User(5L, "Artur", "Boski", "a_boski@email.com", 8798.1, 21, Job.KOTLIN_DEVELOPER);
        User user6 = new User(6L, "Grzegorz", "Cyrych", "g_cytych@email.com", 12333D, 25, Job.GROOVY_DEVELOPER);
        User user7 = new User(7L, "Igor", "Drzewicki", "i_drzewicki@email.com", 12333D, 26, Job.JAVA_DEVELOPER);
        User user8 = new User(8L, "Lidia", "Figura", "l_figura@email.com", 1243D, 28, Job.SCALA_DEVELOPER);
        User user9 = new User(9L, "Norbert", "Gość", "n_gosc@email.com", 12322D, 45, Job.GROOVY_DEVELOPER);
        User user10 = new User(10L, "Urszula", "Grotkowska", "u_grotkowska@email.com", 11333D, 30, Job.SCALA_DEVELOPER);
        User user11 = new User(11L, "Henryk", "Herman", "h_herman@email.com", 5000D, 22, Job.JAVA_DEVELOPER);
        User user12 = new User(12L, "Izabela", "Inglot", "i_inglot@email.com", 7800D, 31, Job.SCALA_DEVELOPER);
        User user13 = new User(13L, "Jan", "Jarosz", "j_jarosz@email.com", 9200D, 29, Job.JAVA_DEVELOPER);
        User user14 = new User(14L, "Katarzyna", "Kowalska", "k_kowalska@email.com", 4500D, 35, Job.KOTLIN_DEVELOPER);
        User user15 = new User(15L, "Leszek", "Lis", "l_lis@email.com", 6700D, 27, Job.GROOVY_DEVELOPER);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);
        users.add(user11);
        users.add(user12);
        users.add(user13);
        users.add(user14);
        users.add(user15);

        user1.addInferior(user2);
        user1.addInferior(user3);
        user3.addInferior(user4);
        user4.addInferior(user5);
        user6.addInferior(user7);
        user6.addInferior(user8);
        user8.addInferior(user9);
        user9.addInferior(user10);
        user11.addInferior(user12);
        user11.addInferior(user13);
        user13.addInferior(user14);
        user14.addInferior(user15);
//Oblicz średnią pensję dla wszystkich podwładnych Java Developerów dla danego użytkownika.
        Map<User, Double> collect3 = users.stream()
                .filter(n -> n.getJob() == Job.JAVA_DEVELOPER)
                .collect(Collectors.toMap(Function.identity(), user -> user.getInferiors()
                        .stream().mapToDouble(User::getSalary).average().orElse(0.0)));

//Znajdź podwładnego (z dowolnego stanowiska) danego użytkownika, który zarabia najwięcej i ma mniej niż 30 lat.
        Map<User, Optional<User>> collect4 = users.stream().
                flatMap(n -> n.getInferiors().stream())
                .collect(Collectors.toMap(Function.identity(), user -> user.getInferiors().stream()
                        .filter(n -> n.getAge() < 30)
                        .max(Comparator.comparing(User::getSalary))));
//Zlicz liczbę podwładnych dla każdego użytkownika, którzy mają więcej niż 25 lat.
        Map<User, Long> collect5 = users.stream()
                .filter(n -> n.getAge() > 25)
                .collect(Collectors.toMap(Function.identity(), user -> user.getInferiors().stream()
                        .count()));
//Znajdź najstarszego podwładnego dla każdego użytkownika.
        Map<User, User> collect6 = users.stream()
                .collect(Collectors.toMap(Function.identity(), user -> user.getInferiors().stream()
                        .max(Comparator.comparing(User::getAge)).orElse(null)));
//Uzyskaj listę wszystkich podwładnych Java Developerów danego użytkownika, którzy zarabiają więcej niż 5000.
        Map<User, List<User>> collect7 = users.stream()
                .filter(n -> n.getJob() == Job.JAVA_DEVELOPER && n.getSalary() > 5000)
                .collect(Collectors.toMap(Function.identity(), User::getInferiors));
//Oblicz średnią wieku dla wszystkich podwładnych dla każdego stanowiska pracy. do poprawy
        OptionalDouble average1 = users.stream()
                .flatMap(user -> user.getInferiors().stream())
                .mapToInt(User::getAge)
                .average();
//Znajdź najmłodszego podwładnego dla każdego stanowiska pracy.
        Map<Job, Optional<User>> collect11 = users.stream()
                .flatMap(n -> n.getInferiors().stream())
                .collect(Collectors.groupingBy(User::getJob, Collectors
                        .minBy(Comparator.comparingInt(User::getAge))));

//Uzyskaj listę unikalnych imion wszystkich podwładnych danego użytkownika.
        List<String> collect9 = users.stream()
                .flatMap(user -> user.getInferiors().stream())
                .map(User::getName)
                .distinct()
                .collect(Collectors.toList());
//Znajdź podwładnego, który zarabia najwięcej i jednocześnie ma najwięcej podwładnych.
        Map<User, Optional<User>> collect10 = users.stream()
                .collect(Collectors.toMap(Function.identity(), user -> user.getInferiors().stream()
                        .max(Comparator.comparingDouble(User::getSalary).thenComparing(n -> n.getInferiors().size()))));

//Zlicz liczbę unikalnych stanowisk pracy wszystkich podwładnych dla danego użytkownika.
        Map<User, Long> collect12 = users.stream()
                .collect(Collectors.toMap(Function.identity(), user -> user.getInferiors().stream()
                        .map(User::getJob)
                        .distinct()
                        .count()));

        //pracownicy Java
        List<User> javaDevelopers = users.stream()
                .filter(n -> n.getJob() == Job.JAVA_DEVELOPER)
                .toList();

        double totalSalary = users.stream()
                .mapToDouble(User::getSalary)
                .sum();
        System.out.println("Łączna pensja pracowników wynosi " + totalSalary);

        Optional<User> maxAge = users.stream()
                .max(Comparator.comparingInt(User::getAge));
        System.out.println(maxAge);
//Oblicz średni wiek deweloperów w Scala.
        OptionalDouble average = users.stream()
                .filter(n -> n.getJob() == Job.SCALA_DEVELOPER)
                .mapToInt(User::getAge)
                .average();
        //Znajdź deweloperów z pensją powyżej 10000.
        List<User> collect = users.stream()
                .filter(n -> n.getSalary() > 10000)
                .collect(Collectors.toList());

//        Zgrupuj deweloperów według ich pracy.

        Map<Job, List<User>> workersByJob = users.stream()
                .collect(Collectors.groupingBy(User::getJob));

        //Posortuj deweloperów według wieku rosnąco.
        users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());

        //Oblicz średnią pensję deweloperów w Groovy.
        users.stream()
                .filter(n -> n.getJob() == Job.GROOVY_DEVELOPER)
                .mapToDouble(User::getSalary)
                .average();

//Znajdź deweloperów z pensją poniżej 5000 i z więcej niż 30 lat.
        List<User> collect1 = users.stream()
                .filter(n -> n.getSalary() < 5000 && n.getAge() > 30)
                .collect(Collectors.toList());
        System.out.println(collect1);

        //Policz ilość deweloperów pracujących w każdym języku programowania.

        Map<Job, List<User>> usersByJob = users.stream().collect(Collectors.groupingBy(User::getJob));
        usersByJob.forEach((job, usersList) -> System.out.println(job + " : " + usersList.size()));
//Znajdź najmłodszego dewelopera pracującego w Kotlin
        Optional<User> minAgeInKotlin = users.stream()
                .filter(n -> n.getJob() == Job.KOTLIN_DEVELOPER)
                .min(Comparator.comparingInt(User::getAge));
        System.out.println(minAgeInKotlin);

        //Posortuj deweloperów według pensji malejąco.
        users.stream()
                .sorted(Comparator.comparingDouble(User::getSalary)
                        .reversed())
                .forEach(System.out::println);
        //Oblicz średnią wieku deweloperów pracujących w Javie.

        OptionalDouble averageAgeInJava = users.stream()
                .filter(n -> n.getJob() == Job.JAVA_DEVELOPER)
                .mapToInt(User::getAge)
                .average();
        System.out.println(averageAgeInJava);
        //Znajdź dewelopera z najwyższą pensją.
        Optional<User> maxSalary = users.stream()
                .max(Comparator.comparingDouble(User::getSalary));
        System.out.println(maxSalary);
        //Znajdź deweloperów w wieku pomiędzy 25 a 35 lat.
        List<User> ageOver25And35 = users.stream()
                .filter(n -> n.getAge() >= 25 && n.getAge() <= 35)
                .collect(Collectors.toList());
        System.out.println(ageOver25And35);
//Znajdź deweloperów pracujących w językach programowania zaczynających się na literę "K".
        users.stream()
                .filter(n -> n.getJob().toString().toUpperCase().startsWith("K"))
                .forEach(System.out::println);
        //Policz ilość deweloperów pracujących w każdej grupie wiekowej (np. 20-25 lat, 26-30 lat itd.).

        Map<String, Long> developersByAgeGroup = users.stream()
                .collect(Collectors.groupingBy(user -> {
                            int age = user.getAge();
                            if (age >= 20 && age <= 25) {
                                return "20-25";
                            } else if (age >= 26 && age <= 30) {
                                return "26-30";
                            } else if (age >= 31 && age <= 35) {
                                return "31-35";
                            } else {
                                return "36+";
                            }
                        },
                        Collectors.counting()));


//        Znajdź dewelopera o najkrótszym nazwisku.
        Optional<User> shortestSurname = users.stream()
                .filter(n -> n.getSurname() != null)
                .min(Comparator.comparing(n -> n.getSurname().length()));
        System.out.println(shortestSurname);
        shortestSurname.ifPresent(System.out::println);
        //Znajdź dewelopera o imieniu z największą liczbą liter.
        Optional<User> lognestName = users.stream()
                .filter(n -> n.getName() != null)
                .max(Comparator.comparing(n -> n.getName().length()));
        lognestName.stream()
                .forEach(name -> System.out.println("Najwięcej liter w imieniu ma " + name.getName()
                        + " i ma " + name.getName().length() + " liter."));
//Oblicz sumę zarobków deweloperów pracujących w Groovy.
        double sumInGroovy = users.stream()
                .filter(n -> n.getJob() == Job.GROOVY_DEVELOPER)
                .mapToDouble(User::getSalary)
                .sum();
        System.out.println(sumInGroovy);
//Oblicz sumę zarobków deweloperów pracujących w Javie i Kotlin.
        double sum = users.stream().filter(n -> n.getJob() == Job.JAVA_DEVELOPER || n.getJob() == Job.KOTLIN_DEVELOPER)
                .mapToDouble(User::getSalary)
                .sum();
        System.out.println(sum);
        //Oblicz średnią pensję deweloperów, którzy mają więcej niż 25 lat, ale mniej niż 35 lat.
        OptionalDouble averageByAge = users.stream()
                .filter(n -> n.getAge() > 25 && n.getAge() < 35)
                .mapToDouble(User::getSalary)
                .average();
        System.out.println(averageByAge);
//Posortuj deweloperów według pensji, a dla tych samych pensji według wieku malejąco.
        users.stream()
                .sorted(Comparator.comparingDouble(User::getSalary).thenComparing(User::getAge).reversed())
                .forEach(System.out::println);
        //Policz ilość deweloperów, których zarobki są powyżej średniej pensji wszystkich deweloperów.
        Long developersWithSalaryAboveAverage = users.stream()
                .collect(Collectors.collectingAndThen(Collectors.teeing(Collectors.averagingDouble(User::getSalary),
                                Collectors.counting(), (averageSalary, totalCount) -> users.stream()
                                        .filter(n -> n.getSalary() > averageSalary).count()),
                        result -> result));
        System.out.println(developersWithSalaryAboveAverage);


        //Znajdź dewelopera, który zarabia mniej niż średnia pensja wszystkich deweloperów, ale ma więcej niż średni wiek.
        User collect2 = users.stream()
                .collect(Collectors.collectingAndThen(Collectors.teeing(Collectors.averagingDouble(User::getSalary)
                                , Collectors.averagingInt(User::getAge), (averageSalary, averageAge) -> users.stream()
                                        .filter(n -> n.getSalary() < averageSalary && n.getAge() > averageAge)
                                        .findFirst().orElse(null)),
                        user -> user));
        System.out.println(collect2);
//Znajdź dewelopera z największą różnicą wieku między nim a najstarszym deweloperem
// w tym samym języku programowania do poprawy.

        Map<Job, User> maxAgeDifferenceDevelopers = users.stream()
                .collect(Collectors.groupingBy(User::getJob,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                userList -> userList.stream()
                                        .max(Comparator.comparingInt(user -> getAgeDifferenceToOldestInSameJob(user, users)))
                                        .orElse(null)
                        )
                ));

        maxAgeDifferenceDevelopers.forEach((job, user) -> {
            if (user != null) {
                System.out.println("Największa różnica wieku dla " + job + " wynosi " +
                        getAgeDifferenceToOldestInSameJob(user, users) + " lat i należy do " +
                        user.getName() + " " + user.getSurname());
            } else {
                System.out.println("Nie znaleziono dewelopera dla " + job);
            }
        });


        // Znajdź deweloperów, których zarobki są najbliższe średniej pensji dla deweloperów w ich języku programowania.
        Map<Job, Double> averageSalaryByJob = users.stream().
                collect(Collectors.groupingBy(User::getJob,
                        Collectors.averagingDouble(User::getSalary)));

        Map<Job, User> closestToAverageSalaryByJob = users.stream()
                .collect(Collectors.groupingBy(User::getJob,
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparingDouble(u ->
                                        u.getSalary() - averageSalaryByJob.get(u.getJob()))),
                                Optional::get
                        )
                ));

        closestToAverageSalaryByJob.forEach((job, user) -> {
            System.out.println("Stanowisko: " + job);
            if (user != null) {
                System.out.println("Deweloperzy najbliżej średniej zarobków to: " + user.getName()
                        + " " + user.getSurname() + ", Pensja: " + user.getSalary());
            } else {
                System.out.println("Nie znaleziono deweloperów na stanowisku: " + job);
            }
        });
//Znajdź dewelopera z największą liczbą unikalnych liter w jego imieniu i nazwisku.
        Optional<User> maxUniqueChars = users.stream()
                .max((n1, n2) -> {
                    String fullName1 = n1.getName() + n1.getSurname();
                    String fullName2 = n2.getName() + n2.getSurname();
                    return Long.compare(fullName1.chars().distinct().count(), fullName2.chars().distinct().count());
                });
        System.out.println(maxUniqueChars);
        //   Znajdź dewelopera, który jest najmłodszy w swojej grupie wiekowej,
        //         ale zarabia więcej niż średnia pensja dla deweloperów w jego języku programowania.
        Map<Job, Double> salaryByJob = users.stream()
                .collect(Collectors.groupingBy(User::getJob, Collectors.averagingDouble(User::getSalary)));
        users.stream()
                .filter(user -> user.getAge() >= 20)
                .collect(Collectors.groupingBy(user -> {
                    if (user.getAge() <= 25) {
                        return "20-25";
                    } else if (user.getAge() <= 30) {
                        return "26-30";
                    } else if (user.getAge() <= 36) {
                        return "31-36";
                    } else {
                        return "+36";
                    }
                }))
                .forEach((ageGroup, userList) -> {
                    User youngestDeveloper = userList.stream()
                            .filter(user -> user.getSalary() > averageSalaryByJob.get(user.getJob()))
                            .min(Comparator.comparingInt(User::getAge))
                            .orElse(null);

                    if (youngestDeveloper != null) {
                        System.out.println("Najmłodszym deweloperem w grupie z zarobkami powyżej średniej jest w  "
                                + ageGroup + ": " + youngestDeveloper.getName() + " " + youngestDeveloper.getSurname()
                                + " " + youngestDeveloper.getSalary());
                    }
                });
        //Znajdź dewelopera, który ma zarobki najbliższe medianie pensji dla deweloperów w wieku od 30 do 40 lat.
        Optional<User> developerClosestToMedianSalary = users.stream()
                .filter(user -> user.getAge() >= 30 && user.getAge() <= 40)
                .min(Comparator.comparingDouble(user -> user.getSalary() - calculateMedianSalary(users)));
        developerClosestToMedianSalary.ifPresent(dev -> System.out.println("Deweloper z pensją najbliżej mediany to: "
                + dev.getName() + " " + dev.getSurname()));

    }

    public static int getAgeDifferenceToOldestInSameJob(User user, List<User> allUsers) {
        int maxAgeInSameJob = allUsers.stream()
                .filter(u -> u.getJob() == user.getJob())
                .mapToInt(User::getAge)
                .max()
                .orElse(user.getAge());

        return Math.abs(maxAgeInSameJob - user.getAge());
    }

    public static double calculateMedianSalary(List<User> users) {
        List<Double> salariesForDevelopersAged30to40 = users.stream()
                .filter(user -> user.getAge() >= 30 && user.getAge() <= 40)
                .map(User::getSalary)
                .sorted()
                .collect(Collectors.toList());

        double medianSalary;
        int size = salariesForDevelopersAged30to40.size();
        if (size % 2 == 0) {
            medianSalary = (salariesForDevelopersAged30to40.get(size / 2 - 1) + salariesForDevelopersAged30to40.get(size / 2)) / 2.0;
        } else {
            medianSalary = salariesForDevelopersAged30to40.get(size / 2);
        }
        return medianSalary;
    }


}












