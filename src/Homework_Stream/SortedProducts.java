package Homework_Stream;

import java.util.ArrayList;
import java.util.List;

public class SortedProducts {
    public static void main(String[] args) {
        List<ProductsOrder> products = new ArrayList<>();
        products.add(new ProductsOrder(001, "MacBook Air M2", 1 ));
        products.add(new ProductsOrder(002, "Mouse Accura Salton", 2));
        products.add(new ProductsOrder(003,"Keyboard Thor 380", 3 ));
        products.stream()
                .sorted((n1, n2)-> n1.getProductName().compareTo(n2.getProductName())).
                forEach(System.out::println);
    }
}
