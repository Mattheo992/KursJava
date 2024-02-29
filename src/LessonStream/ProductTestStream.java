package LessonStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductTestStream {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Tv Samsung", 3499.00));
        products.add(new Product("MaCBook Air M1", 7985.00));
        products.add(new Product("Iphone 15 Max Pro", 6950.00));
        products.stream().
                min(Comparator.comparingDouble(Product::getPrice));

        products.stream().
                max(Comparator.comparingDouble(Product::getPrice));
    }
}
