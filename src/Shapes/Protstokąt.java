package Shapes;

import java.util.Objects;

public class Protstokąt implements IFigura {
    private double sideA;
    private double sideB;

    public Protstokąt(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double obliczPole() {
        return sideA * sideB;
    }

    @Override
    public double obliczObwod() {
        return 2 * (sideA + sideB);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Protstokąt that = (Protstokąt) o;
        return Double.compare(sideA, that.sideA) == 0 && Double.compare(sideB, that.sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

    @Override
    public String toString() {
        return "Protstokąt{" +
                " o boku A = " + sideA +
                ", o boku B = " + sideB +
                '}';
    }
}
