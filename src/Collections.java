import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> listNumbers = List.of(1, 2, 3);
        var items = new ArrayList<Collections>();
        List<String> bikes = Arrays.asList("Honda CBR", "Yamaha Virago");

        numbers.add(4);
        numbers.add(7);

        bikes.clear();
        numbers.get(1);
        numbers.add(0);
        numbers.remove(0);
        numbers.remove((Integer) 0);

        numbers.contains(0);

    }
}

