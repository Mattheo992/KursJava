package Dziedziczenie_Praca_Domowa.Product;

public class Clothing extends Product{
    private String size;
    private String material;

    public Clothing(String productName, double price, String manufacturer, String size, String material) {
        super(productName, price, manufacturer);
        this.size = size;
        this.material = material;
    }

    public Clothing(String productName, double price, String manufacturer) {
        super(productName, price, manufacturer);

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
