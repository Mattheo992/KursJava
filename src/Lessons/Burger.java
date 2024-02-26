package Lessons;

public class Burger implements Food{
    private String meat;
    private String degreeOfDoneness;
    private String roll;

    public Burger(String meat, String degreeOfDoneness, String roll) {
        this.meat = meat;
        this.degreeOfDoneness = degreeOfDoneness;
        this.roll = roll;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getDegreeOfDoneness() {
        return degreeOfDoneness;
    }

    public void setDegreeOfDoneness(String degreeOfDoneness) {
        this.degreeOfDoneness = degreeOfDoneness;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    @Override
    public void prepare() {
        System.out.println("Przygotuj mięsto typu " + meat + "i usmaż je na stopień " + degreeOfDoneness +
                "bułkę typu " + roll + " zgrilluj");


    }
}
