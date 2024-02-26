package Exceptions_Homework.Driver;

import java.util.Objects;

public class Driver {
    private String name;
    private String surname;
    private int age;
    private boolean drivingLicence;

    public Driver(String name, String surname, int age, boolean drivingLicence) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.drivingLicence = drivingLicence;
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

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", drivingLicence=" + drivingLicence +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return age == driver.age && drivingLicence == driver.drivingLicence && Objects.equals(name, driver.name) && Objects.equals(surname, driver.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, drivingLicence);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(boolean drivingLicence) {
        this.drivingLicence = drivingLicence;
    }
}
