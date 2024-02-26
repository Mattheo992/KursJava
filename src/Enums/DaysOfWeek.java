package Enums;

public enum DaysOfWeek {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
    private final int numberOfDay;

    DaysOfWeek(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }
}
