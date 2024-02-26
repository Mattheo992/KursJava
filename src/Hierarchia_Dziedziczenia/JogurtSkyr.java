package Hierarchia_Dziedziczenia;

public class JogurtSkyr implements  Jogurty{
    private String name;
    private String manufacturer;
    private double fatContent;
    private double price;
    private String flavour;

    public JogurtSkyr(String name, String manufacturer, double fatContent, double price, String flavour) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.fatContent = fatContent;
        this.price = price;
        this.flavour = flavour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }


    @Override
    public String showFlavours() {
        return flavour;
    }

    @Override
    public double fatContent() {
        return fatContent;
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
    public void warning() {
        Jogurty.super.warning();
    }
}
