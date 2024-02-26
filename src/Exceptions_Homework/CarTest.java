package Exceptions_Homework;

public class CarTest {
    public static void main(String[] args) {
       PassengerCar passengerCar1 = new PassengerCar("Skoda", "Fabia", 2019, "Benzyna", false, 5, 210 );
       PassengerCar passengerCar2 = new PassengerCar("Tesla", "S", 2023, "Energia elektryczna", true, 5, 322 );
       Truck truckCar1 = new Truck("Scania", "S500", 2021, "Diesel", false, 19, 800);
       Truck truckCar2 = new Truck("Man", "TGL12.250", 2019, "Diesel", false, 17, 450);
passengerCar1.showBasicInfo();
passengerCar2.showBasicInfo();
passengerCar1.correctTypeOfFuel();
passengerCar2.correctTypeOfFuel();
truckCar2.showBasicInfo();
truckCar1.showBasicInfo();
truckCar1.permissibleGrossWeight();
truckCar2.permissibleGrossWeight();
    }



}
