package Homework_All_Functionals;
@FunctionalInterface
public interface TriFunctionForTriangle<A, B, C, R> {
    R apply (A a, B b, C c);
}
