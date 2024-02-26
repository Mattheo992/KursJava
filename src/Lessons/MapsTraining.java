package Lessons;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsTraining {
    public static void main(String[] args) {
        Map<String, String> people = new HashMap<>();
        people.put("1person", "Jan");
        people.put("2person", "Andrzej");
        people.put("3person", "Piotr");

        Set<Map.Entry<String, String>> entries = people.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("klucz: " + entry.getKey());
            System.out.println("wartość: " + entry.getValue());
        }
        //Zaimplementuj kod pobierający wartości na podstawie kluczy
        String key = "1person";
        String personOne = people.get("1person");
        System.out.println(personOne);

        //Sprawdź, czy dany klucz istnieje w mapie

        if (people.containsKey("1person")) {
            System.out.println("Podany klucz istnieje");
        } else {
            System.out.println("Podany klucz nie istnieje");
        }
        //Usuń element na podstawie klucza
        if (people.containsKey("1person")) {
            people.remove("1person");
            System.out.println("Element o kluczu 1person został usunięty");
        } else {
            System.out.println("Podany klucz nie istnieje");
        }
//Stwórz mapę, która zlicza wystąpienia poszczególnych słów w danym tekście
        String text = "Java is a programming language. Java is used for developing various applications.";
        String[] separatedText = text.split("\\s+");
        Map<String, Integer> wordsNumbers = new HashMap<>();
        for (String word : separatedText) {
            word.toLowerCase();

            wordsNumbers.put(word, wordsNumbers.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordsNumbers.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("first", 1);
        numbers.put("second", 2);
        numbers.put("third", 3);

        Map<Integer, String> changedMap = new HashMap<>();
        for(Map.Entry<String, Integer> entry : numbers.entrySet()) {
            changedMap.put(entry.getValue(), entry.getKey());

            System.out.println(changedMap);
        }
            Map<String, Double> productPrices = new HashMap<>();
            productPrices.put("Apple", 2.5);
            productPrices.put("Banana", 1.0);
            productPrices.put("Orange", 3.0);

            Map<String, Integer> shoppingCart = new HashMap<>();
            shoppingCart.put("Apple", 3);
            shoppingCart.put("Banana", 2);
            shoppingCart.put("Orange", 1);

            double totalValue = calculatePrice(productPrices, shoppingCart);
        System.out.println(totalValue);
        }

//    private static double calculatePrice(Map<String, Double> prices, Map<String, Integer> cart){
//        double totalValue = 0.0;
//        for (Map.Entry<String, Integer> entry: cart.entrySet()){
//            String product = entry.getKey();
//            int quantity = entry.getValue();
//
//            if(prices.containsKey(product)){
//                double price = prices.get(product);
//                totalValue += price * quantity;
//            }
//        }
//        return totalValue;
//    }
    private static double calculatePrice(Map<String, Double> prices, Map <String, Integer> cart){
        double totalValue = 0.0;
        for(Map.Entry<String, Integer> entry : cart.entrySet()){
            String product = entry.getKey();
            int quantity = entry.getValue();

            if(prices.containsKey(product)){
                double price = prices.get(product);
                totalValue += price * quantity;
            }
        }return totalValue;
    }
    }

