import java.util.*;

public class MapNew {
    public static void main(String[] args) {
        HashMap<String, Integer> peoplesAge = new HashMap<>();
        peoplesAge.put("Andrzej", 32);
        peoplesAge.put("Kamil", 17);
        peoplesAge.put("Kasia", 19);
        peoplesAge.put("Zdzisław", 69);

        for (Map.Entry<String, Integer> entry : peoplesAge.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

        boolean isEmpty = !peoplesAge.isEmpty();
        if (isEmpty) {
            System.out.println("Mapa nie jest pusta ");
        } else {
            System.out.println("Mapa jest pusta");
        }

        int size = peoplesAge.size();
        System.out.println(size);

        System.out.println(peoplesAge.get("Kasia"));

        boolean czyZawieraKlucz = peoplesAge.containsKey("Zdzisław");
        if (czyZawieraKlucz) {
            System.out.println("Mapa zawiera podany klucz");
        } else {
            System.out.println("Mapa nie posiada takiego klucza");
        }
        boolean czyZawieraWartość = peoplesAge.containsValue(19);
        if (czyZawieraKlucz) {
            System.out.println("Mapa zawiera warotść");
        } else {
            System.out.println("Mapa nie posiada takiej wartości");
        }
        Map<String, Integer> clonedMap = (Map<String, Integer>) peoplesAge.clone();


        peoplesAge.remove("Kasia");
        clonedMap.clear();
        for (Map.Entry<String, Integer> entry : clonedMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Set<String> strings = peoplesAge.keySet();
        System.out.println(strings);
        Collection<Integer> value = peoplesAge.values();
        System.out.println(value);
        Set<Map.Entry<String, Integer>> entries = peoplesAge.entrySet();
        System.out.println(entries);
        peoplesAge.put("Andrzej", 19);
        for (Map.Entry<String, Integer> entry : peoplesAge.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
        Iterator<Map.Entry<String, Integer>> iterator = peoplesAge.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("klucz " + entry.getKey() + " wartość " + entry.getValue());
        }
        String newName = "Roman";
        int newAge = 27;
        Integer oldValues = peoplesAge.putIfAbsent(newName, newAge);
        //sorty by first char
        List<String> owoce = List.of("Banan", "Brzoskwinia", "Ananas", "Agrest", "Cytryna", "Campari");
        Map<Character, List<String>> owocePoLiterze = new HashMap<>();
        for (String owoc : owoce) {
            char firstLetter = owoc.charAt(0);
            owocePoLiterze.computeIfAbsent(firstLetter, k -> new ArrayList<>()).add(owoc);
        }

        for(Map.Entry<Character, List<String>> entry : owocePoLiterze.entrySet()){
            char firstLetter = entry.getKey();
            List<String> owoc = entry.getValue();
            System.out.println("Pierwsza litera: " + firstLetter);
            System.out.println("Słowno: " + owoc);
        }

    }


}




