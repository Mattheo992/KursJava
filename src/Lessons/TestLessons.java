package Lessons;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.UncheckedIOException;
import java.nio.file.FileSystemNotFoundException;

public class TestLessons {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
           throw new FileSystemNotFoundException(e.getMessage());
        }
        String str = null;
        int length = str.length();
    }
}
