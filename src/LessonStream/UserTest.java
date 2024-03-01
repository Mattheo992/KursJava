package LessonStream;

import java.util.*;
import java.util.stream.Collectors;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User(1L, "Ada", "Antczak", "a_antczak@email.com", 3456.5, 20, Job.JAVA_DEVELOPER));
        users.add(new User(2L, "Beata", "Byk", "b_byk@email.com", 11223.5, 33, Job.SCALA_DEVELOPER));
        users.add(new User(3L, "Czesław", "Cios", "c_cios@email.com", 6500.D, 33, Job.JAVA_DEVELOPER));
        users.add(new User(4L, "Daria", "Chodkowska", "d_chodkowska@email.com", 2344.3, 40, Job.JAVA_DEVELOPER));
        users.add(new User(5L, "Artur", "Boski", "a_boski@email.com", 8798.1, 21, Job.KOTLIN_DEVELOPER));
        users.add(new User(6L, "Grzegorz", "Cyrych", "g_cytych@email.com", 12333D, 25, Job.GROOVY_DEVELOPER));
        users.add(new User(7L, "Igor", "Drzewicki", "i_drzewicki@email.com", 12333D, 26, Job.JAVA_DEVELOPER));
        users.add(new User(8L, "Lidia", "Figura", "l_figura@email.com", 1243D, 28, Job.SCALA_DEVELOPER));
        users.add(new User(9L, "Norbert", "Gość", "n_gosc@email.com", 12322D, 45, Job.GROOVY_DEVELOPER));
        users.add(new User(10L, "Urszula", "Grotkowska", "u_grotkowska@email.com", 11333D, 30, Job.SCALA_DEVELOPER));
        users.add(new User(11L, "Henryk", "Herman", "h_herman@email.com", 5000D, 22, Job.JAVA_DEVELOPER));
        users.add(new User(12L, "Izabela", "Inglot", "i_inglot@email.com", 7800D, 31, Job.SCALA_DEVELOPER));
        users.add(new User(13L, "Jan", "Jarosz", "j_jarosz@email.com", 9200D, 29, Job.JAVA_DEVELOPER));
        users.add(new User(14L, "Katarzyna", "Kowalska", "k_kowalska@email.com", 4500D, 35, Job.KOTLIN_DEVELOPER));
        users.add(new User(15L, "Leszek", "Lis", "l_lis@email.com", 6700D, 27, Job.GROOVY_DEVELOPER));
        List<User> javaDevelopers = users.stream()
                .filter(n -> n.getJob() == Job.JAVA_DEVELOPER)
                .collect(Collectors.toList());

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
                .filter(n-> n.getJob() == Job.GROOVY_DEVELOPER)
                .mapToDouble(User::getSalary)
                .average();

//Znajdź deweloperów z pensją poniżej 5000 i z więcej niż 30 lat.

    }

}
