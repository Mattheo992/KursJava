package Lessons;

public class Salad implements Food{
    private String saladType;
    private String spice;
    private String sauce;

    public Salad(String saladType, String spice, String sauce) {
        this.saladType = saladType;
        this.spice = spice;
        this.sauce = sauce;
    }

    public String getSaladType() {
        return saladType;
    }

    public void setSaladType(String saladType) {
        this.saladType = saladType;
    }

    public String getSpice() {
        return spice;
    }

    public void setSpice(String spice) {
        this.spice = spice;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public void prepare() {
        System.out.println("Aby zrobić sałatkę " + saladType + "dodaj przyprawę " + spice + " oraz sos " + sauce);
    }
}
