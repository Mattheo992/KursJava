package Dziedziczenie_Praca_Domowa.Product;

import java.time.LocalDate;

public class ProductsTest {
    public static void main(String[] args) {
       Clothing tshirt = new Clothing("tshirt", 35.99, "Bershka", "Medium", "Cotton" );
       Electronics tv = new Electronics("Telewizor", 2499.99, "Samsung", "Oled 2500", 'A');
       Food yougurth = new Food("Yogurth Skyr", 3.99, "Danone",
               LocalDate.of(2024, 2, 12), 250.00);
    }
}
