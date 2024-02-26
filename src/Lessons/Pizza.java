package Lessons;

public class Pizza implements Food{
    private String spice;
    private String dough;
    private String sauce;
    private double cookingTime;

    public Pizza(String spice, String dough, String sauce, double cookingTime) {
        this.spice = spice;
        this.dough = dough;
        this.sauce = sauce;
        this.cookingTime = cookingTime;
    }

    public String getSpice() {
        return spice;
    }

    public void setSpice(String spice) {
        this.spice = spice;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public double getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(double cookingTime) {
        this.cookingTime = cookingTime;
    }

    @Override
    public void prepare() {
        System.out.println("Do przygotowania pizzy o cieście typu: "  + dough  + "dodaj przyprawę " + spice + "na koniec dodaj sos " + sauce
                + " i piecz przez " + cookingTime + " min");

    }
}
