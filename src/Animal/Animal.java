package Animal;

public class Animal {
    private String species;
    private String name;
    private int age;
    private String color;
    private boolean domesticated;

    public Animal(String species, String name, int age, String color, boolean domesticated) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.color = color;
        this.domesticated = domesticated;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isDomesticated() {
        return domesticated;
    }

    public void setDomesticated(boolean domesticated) {
        this.domesticated = domesticated;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", domesticated=" + domesticated +
                '}';
    }
}

