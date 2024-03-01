package HomeworkStream2;

import java.util.*;

public class FindMinMaxPrice {
    public static void main(String[] args) {
        List<FindMinMaxPrice> products = new ArrayList<>();
        products.add(new FindMinMaxPrice("Tv1", 2999.00));
        products.add(new FindMinMaxPrice("Tv2", 6325.00));
        products.add(new FindMinMaxPrice("Tv3", 299.00));

        Optional<FindMinMaxPrice> min = products.stream()
                .min(Comparator.comparingDouble(FindMinMaxPrice::getPrice));
        Optional<FindMinMaxPrice> max = products.stream()
                .max(Comparator.comparingDouble(FindMinMaxPrice::getPrice));
        System.out.println(min);
        System.out.println(max);
    }

    private String productName;
    private double price;

    public FindMinMaxPrice(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FindMinMaxPrice that = (FindMinMaxPrice) o;
        return Double.compare(price, that.price) == 0 && Objects.equals(productName, that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price);
    }

    @Override
    public String toString() {
        return "FindMinMaxPrice{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
