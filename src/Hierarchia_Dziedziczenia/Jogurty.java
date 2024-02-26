package Hierarchia_Dziedziczenia;

public interface Jogurty extends Nabiał{
     String showFlavours();
     default void warning(){
          System.out.println("Jogurt może zawierać minimalne ilości laktozy");
     };
}
