package Lessons;

public class Animal {
    //rasa wiek kolor
    private String breed;
    private int age;
    private String color;

    public Animal(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  void makeSound() {
        System.out.println("Grrrr");
    }
    public  String animalInfo(int age, String breed){
        return "To zwierze ma " + age + " lat" + " i jego rasa to: " + breed;
    }

    }

