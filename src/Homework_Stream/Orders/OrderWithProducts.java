package Homework_Stream.Orders;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class OrderWithProducts {
    private int orderNumber;
    private List<String> products;

    public OrderWithProducts(int orderNumber, String... products) {
        this.orderNumber = orderNumber;
        this.products = Arrays.asList(products);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderWithProducts that = (OrderWithProducts) o;
        return orderNumber == that.orderNumber && Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, products);
    }

    @Override
    public String toString() {
        return "OrderWithProducts{" +
                "orderNumber=" + orderNumber +
                ", products=" + products +
                '}';
    }
}
