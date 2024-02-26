package Dziedziczenie_Praca_Domowa.Product;

public class Electronics extends Product {
    private String model;
    private char energyClass;

    public Electronics(String productName, double price, String manufacturer) {
        super(productName, price, manufacturer);
    }

    public Electronics(String productName, double price, String manufacturer, String model, char energyClass) {
        super(productName, price, manufacturer);
        this.model = model;
        this.energyClass = energyClass;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public char getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(char energyClass) {
        this.energyClass = energyClass;
    }
}
