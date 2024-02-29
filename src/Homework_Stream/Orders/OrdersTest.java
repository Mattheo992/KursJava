package Homework_Stream.Orders;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrdersTest {
    public static void main(String[] args) {
        List<OrderWithProducts> orders = Arrays.asList(
                new OrderWithProducts(1, "Jabłko", "Gruszka"),
                new OrderWithProducts(2, "Laptop", "Telewizor"),
                new OrderWithProducts(3, "Telefon", "Kreatyna")
        );
        List<String> productsFromOrders = orders.stream()
                .flatMap(n -> n.getProducts().stream())
                .collect(Collectors.toList());

        productsFromOrders.stream()
                .forEach(System.out::println);
    }
}
