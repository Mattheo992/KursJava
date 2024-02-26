package Exceptions_Homework;

import Optional_Homeworks.PermissibleTotalWeightExceededException;

import java.util.Objects;

public class Truck extends Car {
    private int permissibleGrossWeight;
    private int tankCapacity;

    public Truck(String brand, String model, int productionYear, String fuelType, boolean isElectric) {
        super(brand, model, productionYear, fuelType, isElectric);
    }


    public Truck(String brand, String model, int productionYear, String fuelType, boolean isElectric, int permissibleGrossWeight, int tankCapacity) {
        super(brand, model, productionYear, fuelType, isElectric);
        this.permissibleGrossWeight = permissibleGrossWeight;
        this.tankCapacity = tankCapacity;
    }

    public int getPermissibleGrossWeight() {
        return permissibleGrossWeight;
    }

    public void setPermissibleGrossWeight(int permissibleGrossWeight) {
        this.permissibleGrossWeight = permissibleGrossWeight;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return permissibleGrossWeight == truck.permissibleGrossWeight && tankCapacity == truck.tankCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), permissibleGrossWeight, tankCapacity);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "permissibleGrossWeight=" + permissibleGrossWeight +
                ", tankCapacity=" + tankCapacity +
                '}';
    }

    @Override
    public void showBasicInfo() {
        System.out.println("Marka: " + getBrand() + " Model: " + getModel() + " Rok produkcji: "
                + getProductionYear() + " Rodzja paliwa: " + getFuelType() + " Dopuszczalna masa całkowita: "
                + getPermissibleGrossWeight() + " Pojemność baku " + getTankCapacity());
    }

    public void sufficientFuel(int tankCapacity) {
        if (tankCapacity < 500) {
            throw new IllegalArgumentException("Nie możesz wyjechać. Masz za mało paliwa");
        } else System.out.println("Masz wsytarczająco paliwa. Szerokości");
    }

    public void permissibleGrossWeight() {
        if (getPermissibleGrossWeight() > 20) {
            throw new PermissibleTotalWeightExceededException("Przekroczono maksymalną dopuszczalną masę całkowitą. Zgłoś się do serwisu");
        } else System.out.println("Waga pojazdu w normie");
    }
}
