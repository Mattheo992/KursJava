package InterfaceLessons;

public class Addition implements Dzialanie{
    @Override
    public double licz(double arg1, double arg2) {
        return arg1 + arg2;
    }
}
