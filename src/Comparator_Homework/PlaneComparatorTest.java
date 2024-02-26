package Comparator_Homework;

import Lessons.Plane;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlaneComparatorTest {
    public static void main(String[] args) {
        List<PlaneComparator> planes = new ArrayList<>();
        planes.add(new PlaneComparator(2015, LocalDate.of(25, 5, 2015), "Boeing", true));
        planes.add(new PlaneComparator(1994, LocalDate.of(11, 11, 2023), "Airbus", false));
        planes.add(new PlaneComparator(1995, LocalDate.of(2023, 2, 5), "Airbus", true));
        planes.add(new PlaneComparator(2001, LocalDate.of(2022, 3, 22), "Cessna", true));
        planes.add(new PlaneComparator(1999, LocalDate.of(2001, 1, 1), "Cessna", false));
        Comparator<PlaneComparator> individualPlaneComparator = Comparator.comparing(PlaneComparator::getLastFlight).reversed().
                thenComparing(PlaneComparator::getProductionYear).reversed().thenComparing(PlaneComparator::getBrand);
        planes.sort(individualPlaneComparator);
        for (PlaneComparator plane : planes) {
            System.out.println(plane);
        }
    }
}