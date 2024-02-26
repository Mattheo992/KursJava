package Lessons;

import java.util.Comparator;
import java.util.Objects;

public class CarClass {
    private String brand;
    private String model;
    private int productionsYear;

    public CarClass(String brand, String model, int productionsYear) {
        this.brand = brand;
        this.model = model;
        this.productionsYear = productionsYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionsYear() {
        return productionsYear;
    }

    public void setProductionsYear(int productionsYear) {
        this.productionsYear = productionsYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarClass carClass = (CarClass) o;
        return productionsYear == carClass.productionsYear && Objects.equals(brand, carClass.brand) && Objects.equals(model, carClass.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, productionsYear);
    }

    @Override
    public String toString() {
        return "CarClass{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionsYear=" + productionsYear +
                '}';
    }
}
