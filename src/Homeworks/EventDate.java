package Homeworks;

import java.time.LocalDate;
import java.util.*;

public class EventDate implements Comparable<EventDate> {
    private String event;
    private LocalDate date;

    public EventDate(String event, LocalDate date) {
        this.event = event;
        this.date = date;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventDate eventDate = (EventDate) o;
        return Objects.equals(event, eventDate.event) && Objects.equals(date, eventDate.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, date);
    }

    @Override
    public String toString() {
        return "EventDate{" +
                "event='" + event + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public int compareTo(EventDate o) {
        return this.date.compareTo(o.date);
    }

    public static void main(String[] args) {
        List<EventDate> events = new ArrayList<>();
        events.add(new EventDate("Bitwa pod grunwaldem", LocalDate.of(1410, 7, 15)));
        events.add(new EventDate("Zrzucenie bomby na Hiroszimę", LocalDate.of(1945, 8, 6)));
        events.add(new EventDate("Wybuch Drugiej Wojny Światowej", LocalDate.of(1939, 9, 1)));
        events.add(new EventDate("Wstąpienie Polski do NATO", LocalDate.of(1999, 3, 12)));
//        Collections.sort(events);
//        for(EventDate event : events){
//            System.out.println(event);
        Comparator<EventDate> individualEventDateComparator = Comparator.comparing(EventDate::getDate);
        }
    }

