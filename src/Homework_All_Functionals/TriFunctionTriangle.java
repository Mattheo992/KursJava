package Homework_All_Functionals;

public class TriFunctionTriangle {
    public static void main(String[] args) {
        TriFunctionForTriangle<Integer, Integer, Integer, Boolean> isPossibleToCreateATriangle = (a, b, c) ->
                ((a + b) > c) && (a+c>b) && (b+c>a);
        Boolean isPossibleToMakeATriangle = isPossibleToCreateATriangle.apply(5, 7, 9);
        System.out.println(isPossibleToMakeATriangle);
    }
}
