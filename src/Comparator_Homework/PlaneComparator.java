package Comparator_Homework;

import java.time.LocalDate;
import java.util.Objects;

public class PlaneComparator {
    private int productionYear;
    private LocalDate lastFlight;
    private String brand;
    private boolean readyToFlight;

    public PlaneComparator(int productionYear, LocalDate lastFlight, String brand, boolean readyToFlight) {
        this.productionYear = productionYear;
        this.lastFlight = lastFlight;
        this.brand = brand;
        this.readyToFlight = readyToFlight;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public LocalDate getLastFlight() {
        return lastFlight;
    }

    public void setLastFlight(LocalDate lastFlight) {
        this.lastFlight = lastFlight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isReadyToFlight() {
        return readyToFlight;
    }

    public void setReadyToFlight(boolean readyToFlight) {
        this.readyToFlight = readyToFlight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaneComparator that = (PlaneComparator) o;
        return productionYear == that.productionYear && readyToFlight == that.readyToFlight && Objects.equals(lastFlight, that.lastFlight) && Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productionYear, lastFlight, brand, readyToFlight);
    }

    @Override
    public String toString() {
        return "PlaneComparator{" +
                "productionYear=" + productionYear +
                ", lastFlight=" + lastFlight +
                ", brand='" + brand + '\'' +
                ", readyToFlight=" + readyToFlight +
                '}';
    }
}
