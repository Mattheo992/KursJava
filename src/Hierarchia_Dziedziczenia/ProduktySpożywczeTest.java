package Hierarchia_Dziedziczenia;

public class ProduktySpożywczeTest {
    public static void main(String[] args) {


        SerRycki serRycki = new SerRycki("Ser Rycki", "Danone", 7.99, 300, "Pełnotłusty", 13.7);
        JogurtSkyr skyr = new JogurtSkyr("Skyr", "Biovita", 0, 3.99, "Truskawka");
        Marchew marchew = new Marchew("Marchew Amsterdamska", "Agropol", 250, "Polska", 2.95);
        serRycki.infoSera();
        skyr.warning();

    }


    }

