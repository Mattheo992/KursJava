package Dziedziczenie_Praca_Domowa.Product;

import java.time.LocalDate;

public class Food extends Product{
    private LocalDate expiryDate;
    private double weight;
    public Food(String productName, double price, String manufacturer) {
        super(productName, price, manufacturer);
    }

    public Food(String productName, double price, String manufacturer, LocalDate expiryDate, double weigth) {
        super(productName, price, manufacturer);
        this.expiryDate = expiryDate;
        this.weight = weigth;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
