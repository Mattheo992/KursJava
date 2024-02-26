package Hierarchia_Dziedziczenia;

public class SerRycki implements Sery, ProduktyNaWagę {
private String name;
private String manufacturer;
private double price;
private double weight;
private String type;
private double fatContent;

    public SerRycki(String name, String manufacturer, double price, double weight, String type, double fatContent) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.fatContent = fatContent;
    }

    public SerRycki(String name, String manufacturer, double price, double weight, String type) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.weight = weight;
        this.type = type;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double fatContent() {
        return fatContent;
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
    public String showTypeOfCheese() {
        return type;
    }
    public double pricePerWeight(double price, double weight){
        return (price * weight)/ 100;
    }
    public void infoSera(){
        System.out.println("Produkt: "+ getName() + " producent " + getManufacturer() + " o wadze " + getWeight()
                + " gramów, o zawartości tłuszczu: " + getFatContent() + " % typu: "
                + getType() + "za cenę " + pricePerWeight(getPrice(), getWeight())+ " PLN");
    }
}

