package LessonsException;

public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 0;
        Calculator calculator = new Calculator();
       try{
           System.out.println(calculator.divisionResult(a, b));}
       catch (Exception e){
           System.out.println(e.getMessage());
       }
       try{
           System.out.println(calculator.divisionResult(a, c));
       }catch (Exception ArithmeticException ){
           System.out.println(ArithmeticException.getMessage());
       }

    }
    //Napisz metodę, która oblicza wynik dzielenia dwóch liczb całkowitych. Obsłuż wyjątek dzielenia przez zero.
    public int divisionResult(int a, int b){
           if(b == 0){
               throw new ArithmeticException("Nie można dzielić przez 0");
           }
           return a/b;
       }
    }

