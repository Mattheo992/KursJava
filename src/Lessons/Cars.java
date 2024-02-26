package Lessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cars {
    public static void main(String[] args) {


        List<CarClass> carList = new ArrayList<>();
        carList.add(new CarClass("Toyota", "Supra", 2022));
        carList.add(new CarClass("Honda", "Civic", 2007));
        carList.add(new CarClass("Honda", "Corolla", 2007));
        carList.add(new CarClass("Skoda", "Fabia", 2017));
        Comparator<CarClass> customComparator = Comparator.comparingInt(CarClass::getProductionsYear).thenComparing(CarClass::getBrand);
        Comparator<CarClass> customComparator2 = Comparator.comparing(car -> car.getProductionsYear());
        customComparator2.thenComparing(car -> car.getBrand());
        Collections.sort(carList, customComparator);
        for(CarClass car : carList){
            System.out.println(car);
        }

    }
}