package InterfaceLessons;

public class Multiplication implements Dzialanie{
    @Override
    public double licz(double arg1, double arg2) {
        return arg1 * arg2;
    }
}
