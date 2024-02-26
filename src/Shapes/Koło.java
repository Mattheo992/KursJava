package Shapes;

import java.util.Objects;

public class Koło implements IFigura{
    private double radius;

    public Koło(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double obliczPole() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double obliczObwod() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Koło koło = (Koło) o;
        return Double.compare(radius, koło.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Koło{" +
                "o promieniu = " + radius +
                '}';
    }
}
