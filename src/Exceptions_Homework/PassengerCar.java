package Exceptions_Homework;

import java.util.Objects;

public class PassengerCar extends Car{
    public PassengerCar(String brand, String model, int productionYear, String fuelType, boolean isElectric) {
        super(brand, model, productionYear, fuelType, isElectric);
    }
    private int numberOfPlaceInCar;
    private int maxSpeed;

    public PassengerCar(String brand, String model, int productionYear, String fuelType, boolean isElectric, int numberOfPlaceInCar, int maxSpeed) {
        super(brand, model, productionYear, fuelType, isElectric);
        this.numberOfPlaceInCar = numberOfPlaceInCar;
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfPlaceInCar() {
        return numberOfPlaceInCar;
    }

    public void setNumberOfPlaceInCar(int numberOfPlaceInCar) {
        this.numberOfPlaceInCar = numberOfPlaceInCar;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerCar that = (PassengerCar) o;
        return numberOfPlaceInCar == that.numberOfPlaceInCar && maxSpeed == that.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPlaceInCar, maxSpeed);
    }

    @Override
    public String toString() {
        return "PassemgerCar{" +
                "numberOfPlaceInCar=" + numberOfPlaceInCar +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
    @Override
    public void showBasicInfo() {
        System.out.println("Marka: " + getBrand() + " Model: " + getModel()+" Rok produkcji: "
                + getProductionYear()+ " Rodzja paliwa: " + getFuelType() + "Prędkość maksymalna: " + getMaxSpeed());
    }
public void correctTypeOfFuel() {
    if (!isElectric()) {
        System.out.println("Wlewasz paliwo do samochodu spalinowego");
    } else throw new InsufficientFuelException("Próbujesz zatankować samochód elektryczny. Powodzenia w suzkaniu klapki");
}

}

