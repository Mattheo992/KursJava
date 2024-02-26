package Lessons;

public class Recipes {
    public static void main(String[] args) {


        Food pizza = new Pizza("oregano", "puszyste", "pomidorowy", 35);
        Food burger = new Burger("wołowina", "welldone", "pszenna");
        Food salad = new Salad("Cezar", "lubczyk", "winegret");

pizza.prepare();
burger.prepare();
salad.prepare();
    }
}