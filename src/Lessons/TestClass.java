package Lessons;

public class TestClass {
    public static void main(String[] args) {
        Rower bike1 = new Rower("Wigury", "black", 1996);
        Rower bike2 = new Rower("Wigury", "black", 1996);
        Rower bike3 = new Rower("Wigury", "black", 1996);
        System.out.println(bike1.equals(bike2));
    }

}
