package Homework_Stream.Stuff;

import Homework_Stream.ProductsOrder;

import java.util.ArrayList;
import java.util.List;

public class OrderTest {
    public static void main(String[] args) {
        List<ProductsOrder> orders = new ArrayList<>();
        orders.add(new ProductsOrder(001, "MacBook Air M2", 1 ));
        orders.add(new ProductsOrder(002, "Mouse Accura Salton", 2));
        orders.add(new ProductsOrder(003,"Keyboard Thor 380", 3 ));
        orders.stream().peek(order -> System.out.println(order.getProductName())).forEach(order ->{});

        System.out.println(orders);

    }
}
