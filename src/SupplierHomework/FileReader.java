package SupplierHomework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FileReader {
    public static void main(String[] args) {
        String filePath = "src/SupplierHomework/example.txt";
        Supplier<Stream<String>> lineReader = () -> {
            try {
                List<String> lines = Files.readAllLines(Paths.get(filePath));
                return lines.stream();
            } catch (IOException e) {
                e.printStackTrace();
                return Stream.empty();
            }
        };
        lineReader.get().forEach(System.out::println);
    }
}
