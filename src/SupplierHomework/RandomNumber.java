package SupplierHomework;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> randomNumberGenerator = () -> random.nextInt(9999)+1;
        System.out.println("Wygenerowana losowo liczba to " + randomNumberGenerator.get());
    }

}




