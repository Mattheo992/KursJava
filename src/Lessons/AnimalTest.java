package Lessons;

public class AnimalTest {
    public static void main(String[] args) {
        Animal python = new Snake("Python", 10, "Green", true);
        Animal cobra = new Snake("Cobra", 5, "Brown", true);
        Animal sparrow = new Bird("Sparrow", 2, "Brown", 0.5);
        Animal falcon = new Bird("Falcon", 3, "Brown", 2.5);
    }
}
