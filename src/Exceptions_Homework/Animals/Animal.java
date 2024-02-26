package Exceptions_Homework.Animals;

import java.util.Objects;

public class Animal {
    private String gatunek;
    private String imie;
    private int wiek;
    private String rodzajPozywienia;
    private boolean przyjazneDlaLudzi;

    public Animal(String gatunek, String imie, int wiek, String rodzajPozywienia, boolean przyjazneDlaLudzi) {
        this.gatunek = gatunek;
        this.imie = imie;
        this.wiek = wiek;
        this.rodzajPozywienia = rodzajPozywienia;
        this.przyjazneDlaLudzi = przyjazneDlaLudzi;
    }

    public String getRodzajPozywienia() {
        return rodzajPozywienia;
    }

    public void setRodzajPozywienia(String rodzajPozywienia) {
        this.rodzajPozywienia = rodzajPozywienia;
    }

    public boolean isPrzyjazneDlaLudzi() {
        return przyjazneDlaLudzi;
    }

    public void setPrzyjazneDlaLudzi(boolean przyjazneDlaLudzi) {
        this.przyjazneDlaLudzi = przyjazneDlaLudzi;
    }

    public Animal(String gatunek, String imie, int wiek) {
        this.gatunek = gatunek;
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "gatunek='" + gatunek + '\'' +
                ", imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", rodzajPozywienia='" + rodzajPozywienia + '\'' +
                ", przyjazny dla ludzi=" + przyjazneDlaLudzi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return wiek == animal.wiek && przyjazneDlaLudzi == animal.przyjazneDlaLudzi && Objects.equals(gatunek, animal.gatunek) && Objects.equals(imie, animal.imie) && Objects.equals(rodzajPozywienia, animal.rodzajPozywienia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gatunek, imie, wiek, rodzajPozywienia, przyjazneDlaLudzi);
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }


}

