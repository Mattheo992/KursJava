package InterfaceLessons;

public class Division implements Dzialanie{
    @Override
    public double licz(double arg1, double arg2) {
        return arg1 / arg2;
    }
}
