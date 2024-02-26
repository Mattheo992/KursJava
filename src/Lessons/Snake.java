package Lessons;

public class Snake extends Animal{
    public Snake(String breed, int age, String color) {
        super(breed, age, color);
    }
    boolean isVenomous;

    public Snake(String breed, int age, String color, boolean isVenomous) {
        super(breed, age, color);
        this.isVenomous = isVenomous;
    }

    public boolean isVenomous() {
        return isVenomous;
    }

    public void setVenomous(boolean venomous) {
        isVenomous = venomous;
    }

    @Override
    public void makeSound() {
        System.out.println("SSsss");
    }

    @Override
    public String animalInfo(int age, String breed) {
        return super.animalInfo(age, breed);
    }
}
