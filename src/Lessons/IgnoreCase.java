package Lessons;

import java.util.*;

public class IgnoreCase implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }

    public static void main(String[] args) {
        List<String> ignoreCase = new ArrayList<>();
        ignoreCase.add("Alfabet");
        ignoreCase.add("kantyna");
        ignoreCase.add("Grad");
        ignoreCase.add("Fabryka");
        ignoreCase.add("kszatan");
      ignoreCase.sort(new IgnoreCase());
        for (String text : ignoreCase){
            System.out.println(text);
        }
    }
}
