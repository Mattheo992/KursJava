package Homework_Stream;

import java.util.ArrayList;
import java.util.List;

public class ProductsNameLength {
    public static void main(String[] args) {
        List<String> productsName = new ArrayList<>(List.of("Kabel USB-C Silver Monkey", "MacBook Air M2", "Tv Samsung 65 cali"));
        productsName.stream().map(product -> product.length()).forEach(System.out::println);
    }
}
