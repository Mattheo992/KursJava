package Hierarchia_Dziedziczenia;

public class Marchew implements Warzywa {
    private String name;
    private String manufacturer;
    private double weight;
    private String countryOfOrigin;
    private double price;

    public Marchew(String name, String manufacturer, double weight, String countryOfOrigin, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String showCountryOfOrigin() {
        return countryOfOrigin;
    }
}
