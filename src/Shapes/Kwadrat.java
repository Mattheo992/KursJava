package Shapes;

import java.util.Objects;

public class Kwadrat implements IFigura {
    private double side;

    public Kwadrat(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double obliczPole() {
        return side * side;
    }

    @Override
    public double obliczObwod() {
        return 4 * side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kwadrat kwadrat = (Kwadrat) o;
        return Double.compare(side, kwadrat.side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "o boku = " + side +" cm" +
                '}';
    }
}
