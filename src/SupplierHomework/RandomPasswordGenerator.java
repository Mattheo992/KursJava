package SupplierHomework;

import java.util.Random;
import java.util.function.Supplier;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<String> generateRandomPassword = () -> generateRandomPassword(8);
        String randomPassword = generateRandomPassword.get();
        System.out.println("Wygenerowane losowe hasło to: " + randomPassword );
    }
    public static String generateRandomPassword(int length){
        String upperCaseChars ="ABCDEFGHIJKLMNOPRSTUWXZ";
        String lowerCaseChars = upperCaseChars.toLowerCase();
        String numberChars = "1234567890";
        String specialChars = "!@#$%^&*()[]{};':?><";
        String allChars = upperCaseChars + lowerCaseChars + numberChars + specialChars;
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for(int i = 0; i < length; i++){
            int randomIndex = random.nextInt(allChars.length());
            password.append(allChars.charAt(randomIndex));
        }
        return password.toString();
    }
}
