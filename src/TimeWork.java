import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TimeWork {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate1 = now.format(formatter1);
        System.out.println(formattedDate1);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss");
        String formattedDate2 = now.format(formatter2);


        LocalDateTime actual = LocalDateTime.now();
        displayDateTimeComponents(actual);
        LocalDateTime addedHours = addHours(actual, 5);
        System.out.println(addedHours);
        LocalDateTime date1 = LocalDateTime.of(2024, 8, 15, 10, 25);
        LocalDateTime date2 = LocalDateTime.of(2024, 6, 4, 12, 25);
        CompareLocalDateTime(date1, date2);
        Date utilDate = new Date();
        Instant instant = Instant.now();
        LocalDateTime localDateTimeFromDate = convertToLocalDateFromDate(utilDate);
        LocalDateTime localDateTimeFromInstant = convertToLocalDateFromInstant(instant);
        System.out.println("LocalDateTime from Date: " + localDateTimeFromDate);
        System.out.println("LocalDateTime from Instant: " + localDateTimeFromInstant);

        LocalDateTime actualDate = LocalDateTime.now();
        LocalDateTime pastDate = LocalDateTime.of(2022, 4, 15,12,45, 11);
        isDateTimePast(pastDate);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rok do prowadzenia: ");
        int year = scanner.nextInt();
        System.out.println("Podaj miesiąc do wprowadzenia(od 1 do 12): ");
        int month = scanner.nextInt();
        System.out.println("Podaj dzień do wprowadzenia: ");
        int day = scanner.nextInt();
        System.out.println("Podaj godzinę do wprowadzenia: ");
        int hour = scanner.nextInt();
        System.out.println("Podaj minuty do wprowadzenia: ");
        int minute = scanner.nextInt();
        LocalDateTime userLocalDateTime = createNewLocalDateTime(year, month, day, hour, minute);
        System.out.println(userLocalDateTime);

        LocalDateTime date3 = LocalDateTime.of(1992, 5, 20, 7, 15, 00);
        LocalDateTime date4 = LocalDateTime.of(1995, 8, 11, 2, 20, 00);
        Duration duration = Duration.between(date3, date4);
        System.out.println("Różnica czasowa w:");
        System.out.println("dniach: " + duration.toDays());
        System.out.println("godzinach: " + duration.toHours());
        System.out.println("minutach: " + duration.toMinutes());
        System.out.println("sekundach: " + duration.toSeconds());



    }

    public static void displayDateTimeComponents(LocalDateTime dateTime) {
        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();
        int hour = dateTime.getHour();
        int minute = dateTime.getMinute();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("minute: " + minute);

       LocalDateTime localDateNow = LocalDateTime.now();
       int actualYear = localDateNow.getYear();
       boolean isYearLeap = Year.isLeap(actualYear);
        if (isYearLeap){
            System.out.println("rok" + actualYear +  "jest przestępny");
        }
        else {
            System.out.println("rok" + actualYear +  "nie jest przestępny");
        }

    }


    public static LocalDateTime addHours(LocalDateTime date, long hoursAdded) {
        return date.plusHours(hoursAdded);
    }

    public static void CompareLocalDateTime(LocalDateTime date1, LocalDateTime date2) {
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " jest wcześniejsza od " + date2);
        } else if (date2.isBefore(date1)) {
            System.out.println(date1 + " jest późniejsza od " + date2);
        } else {
            System.out.println("Obie daty są równe");
        }
    }
public static LocalDateTime convertToLocalDateFromDate(Date date){
        return date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDateTime();
}
public static LocalDateTime convertToLocalDateFromInstant(Instant instant){
        return instant.atZone(java.time.ZoneId.systemDefault()).toLocalDateTime();
}
public static void isDateTimePast(LocalDateTime date){
        if(date.isBefore(LocalDateTime.now())){
            System.out.println("Data " + date + " jest przeszła");
        }
        else {
            System.out.println("Date " + date + " nie jest przeszła");
        }
}
public static LocalDateTime createNewLocalDateTime(int year, int month, int day, int hour, int minute){
        return LocalDateTime.of(year, month, day, hour, minute);
}
}


