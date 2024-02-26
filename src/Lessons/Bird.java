package Lessons;

import java.util.Objects;

public class Bird extends Animal{

    public Bird(String breed, int age, String color) {
        super(breed, age, color);
    }
    private double wingspan;

    public Bird(String breed, int age, String color, double wingspan) {
        super(breed, age, color);
        this.wingspan = wingspan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return Double.compare(wingspan, bird.wingspan) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wingspan);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "wingspan=" + wingspan +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Ćwir Ćwir");
    }

    @Override
    public String animalInfo(int age, String breed) {
        return super.animalInfo(age, breed);
    }
}
