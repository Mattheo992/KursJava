package Lessons;

import Homeworks.ComparatorLastFlight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlaneTest {
    public static void main(String[] args) {
        List<Plane> planes = new ArrayList<>();
        planes.add(new Plane(2015, LocalDate.of(25,5,2015), "Boeing", true));
        planes.add(new Plane(1994, LocalDate.of(11, 11, 2023), "Airbus", false));
        planes.add(new Plane(1995,LocalDate.of(2023, 2, 5), "Airbus", true));
        planes.add(new Plane(2001,LocalDate.of(2022, 3, 22), "Cessna", true));
        planes.add(new Plane(1999,LocalDate.of(2001, 1, 1), "Cessna", false));
        Collections.sort(planes, new ComparatorLastFlight());
        for(Plane plane : planes){
            System.out.println(plane);
        }



    }
}
