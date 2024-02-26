package Hierarchia_Dziedziczenia;

public interface ProduktyNaWagę extends ProduktySpożywcze {
     double getWeight();
     default void warningBeforeWeigh(){
         System.err.println("Przed ważeniem należy wytarować wagę");
     }
    }


