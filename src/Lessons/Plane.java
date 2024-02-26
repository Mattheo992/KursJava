package Lessons;

import java.time.LocalDate;
import java.util.Objects;

public class Plane {
    private int productionYear;
    private LocalDate lastFlight;
    private String brand;
    private boolean readyToFlight;

    public Plane(int productionYear, LocalDate lastFlight, String brand, boolean readyToFlight) {
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
        Plane plane = (Plane) o;
        return productionYear == plane.productionYear && readyToFlight == plane.readyToFlight && Objects.equals(lastFlight, plane.lastFlight) && Objects.equals(brand, plane.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productionYear, lastFlight, brand, readyToFlight);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "productionYear=" + productionYear +
                ", lastFlight=" + lastFlight +
                ", brand='" + brand + '\'' +
                ", readyToFlight=" + readyToFlight +
                '}';
    }
}
