package Exceptions_Homework;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int productionYear;
    private String fuelType;
    private boolean isElectric;

    public Car(String brand, String model, int productionYear, String fuelType, boolean isElectric) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.fuelType = fuelType;
        this.isElectric = isElectric;
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

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return productionYear == car.productionYear && isElectric == car.isElectric && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(fuelType, car.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, productionYear, fuelType, isElectric);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", fuelType='" + fuelType + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }
    public void showBasicInfo(){};
    }

