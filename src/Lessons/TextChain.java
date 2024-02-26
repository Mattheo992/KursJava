package Lessons;

import java.lang.reflect.Array;
import java.util.*;

public class TextChain implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }

    public static void main(String[] args) {
        String[] textChain = {"text", "Konstantynów", "brelok", "typy"};
        Arrays.sort(textChain, new TextChain());
        for(String text : textChain){
            System.out.println(text);
        }

    }

}

