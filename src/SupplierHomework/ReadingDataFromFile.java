package SupplierHomework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Supplier;

public class ReadingDataFromFile {
    public static void main(String[] args) {
        String fileName = "src/SupplierHomework/example.txt";
        Supplier<String> readDataFromFile = readerDataFromFile(fileName);
        String line;
        while ((line = readDataFromFile.get()) != null) {
            System.out.println(line);
        }
    }

    public static Supplier<String> readerDataFromFile(String fileName) {
        return () -> {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        };
    }
}
