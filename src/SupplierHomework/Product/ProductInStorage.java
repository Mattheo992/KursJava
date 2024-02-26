package SupplierHomework.Product;

import java.util.Objects;
import java.util.Random;

public class ProductInStorage {
    private int id;
    private String productName;
    private String producer;
    private double price;
    private boolean availableAtStock;



    public ProductInStorage(String productName, String producer, double price, boolean availableAtStock) {
        this.productName = productName;
        this.producer = producer;
        this.price = price;
        this.availableAtStock = availableAtStock;
        generateId();
        }


    private void generateId() {
        Random random = new Random();
        this.id = random.nextInt(500);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailableAtStock() {
        return availableAtStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setAvailableAtStock(boolean availableAtStock) {
        this.availableAtStock = availableAtStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductInStorage that = (ProductInStorage) o;
        return Double.compare(price, that.price) == 0 && availableAtStock == that.availableAtStock && Objects.equals(productName, that.productName) && Objects.equals(producer, that.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, producer, price, availableAtStock);
    }

    @Override
    public String toString() {
        return "ProductInStorage{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", availableAtStock=" + availableAtStock +
                '}';
    }
}
