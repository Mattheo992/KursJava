package Hierarchia_Dziedziczenia;

public interface ProduktySpożywcze {
     String getName();
     String getManufacturer();
     double getPrice();
     default void message(){
          System.err.println("Prosimy o przemyślane zakupy. Zwroty nie będą przyjmowane");
     }
}
