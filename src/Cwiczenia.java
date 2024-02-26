import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cwiczenia {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        List<Integer> reversed = reversed(numbers);
        System.out.println(reversed);

        //Usuń duplikaty z listy, pozostawiając jedno wystąpienie każdego elementu. iteracyjnie

        List<String> checkWords = new ArrayList<>();
        checkWords.add("baran");
        checkWords.add("cytryna");
        checkWords.add("kozioł");
        checkWords.add("orzeł");
        checkWords.add("baran");
        checkWords.add("orzeł");


        withoutDuplicates(checkWords);

        System.out.println(checkWords);
    }

    public static List<Integer> reversed(List<Integer> reversedNumbers) {
        int lenght = reversedNumbers.size();
        for (int i = 0; i < lenght / 2; i++) {
            int reversedIndex = lenght - 1 - i;
            int temp = reversedNumbers.get(i);
            reversedNumbers.set(i, reversedNumbers.get(reversedIndex));
            reversedNumbers.set(reversedIndex, temp);


        }
        return reversedNumbers;
    }

    public static void withoutDuplicates(List<String> list) {
        List<String> noDuplicates = new ArrayList<>();
        int actualIndex = 0;
        while (actualIndex < list.size()) {
            String actualString = list.get(actualIndex);
            if (noDuplicates.contains(actualString)) {
                list.remove(actualIndex);
            } else {
                noDuplicates.add(actualString);
                actualIndex++;
            }
        }
    }
    

}













