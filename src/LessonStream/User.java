package LessonStream;

import java.util.List;
import java.util.Objects;
//dodac metodę addInferiors
public class User {
    private long id;
    private String name;
    private String surname;
    private String mail;
    private double salary;
    private int age;
    private Job job;
    private List<User> inferiors;

    public User(long id, String name, String surname, String mail, double salary, int age, Job job) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.salary = salary;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", job=" + job +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Double.compare(salary, user.salary) == 0 && age == user.age && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(mail, user.mail) && job == user.job;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, mail, salary, age, job);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(long id, String name, String surname, String mail, double salary, Job job) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.salary = salary;
        this.job = job;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

}
