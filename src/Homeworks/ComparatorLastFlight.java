package Homeworks;

import Lessons.Plane;

import java.util.Comparator;

public class ComparatorLastFlight implements Comparator<Plane> {


    @Override
    public int compare(Plane o1, Plane o2) {
        int comparsionDate = o2.getLastFlight().compareTo(o1.getLastFlight());
        if(comparsionDate != 0){
            return comparsionDate;
        }
        int comparsionProductionYear = Integer.compare(o2.getProductionYear(), o1.getProductionYear());
        if (comparsionProductionYear != 0){
            return comparsionDate;
        }
         return o2.getBrand().compareTo(o1.getBrand());

    }
}
