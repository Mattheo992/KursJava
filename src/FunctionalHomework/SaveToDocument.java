package FunctionalHomework;
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SaveToDocument {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("Dawno dawno tymu, za siedmioma górami, za siedmioma zekami, w okolicy Gubałówki, mieskoł",
                "Tomisław Apoloniusz Curuś Bachleda Farrell,",
                "jak ten piecyk z dmuchawką. Pewnego dnia Tomisław wysedł na halę i pomyśloł:",
                "Krucafuks dość. Ile można wpie$#$ łoscypek! Ani do dobre, ani śwarne, a jakie drogie!");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/FunctionalHomework/output.txt"))) {
            Consumer<String> saveFile = s -> {
                try {
                    writer.write(s);
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            };

            for (String element : elements) {
                saveFile.accept(element);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
