package Enums;

public enum Months {
    STYCZEŃ("31"), LUTY("28 lub 29"), MARZEC("31"), KWIECIEŃ("30"), MAJ("31"),
    CZERWIEC("30"), LIPIEC("31"), SIERPIEŃ("31"), WRZESIEŃ("30"),
    PAŹDZIERNIK("31"), LISTOPAD("30"), GRUDZIEŃ("31");

    private final String days;

    Months(String days) {
        this.days = days;
    }

    public String getDays() {
        return days;
    }


    public static void main(String[] args) {
for (Months months : Months.values()){
    System.out.println(months + " ma " + months.getDays() + " dni ");}
    }
    }






