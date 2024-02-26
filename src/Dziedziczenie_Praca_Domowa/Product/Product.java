package Dziedziczenie_Praca_Domowa.Product;

public class Product {
    private String productName;
    private double price;
    private String manufacturer;

    public Product(String productName, double price, String manufacturer) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
