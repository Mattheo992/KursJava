package Optional_Homeworks;

import java.util.Optional;

public class Workers {
    public static void main(String[] args) {
        Optional<Workers> worker1= Optional.of(new Workers("Jan", "Kalosz", 55));
        System.out.println( getValueOrDefault2( worker1));


    }
    private String name;
    private String surname;
    private int age;

    public Workers(String name, String surname, int age) {
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
    public static String getValueOrDefault2(Optional<Workers> worker){
        return worker.map(workers -> workers.getName() +" " + workers.getSurname() +" " + workers.getAge()).orElse("Nie wypełniono danych pracownika");
    }
}
