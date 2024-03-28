import java.sql.Timestamp;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DatesHomework {
    public static void main(String[] args) {
        //Napisz metodę, która konwertuje java.sql.Timestamp na java.time.LocalDateTime.
        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        LocalDateTime localDateTime1 = convertTimestampToLocalDateTime(timestamp1);
        System.out.println(localDateTime1);

        //Utwórz program, który porównuje dwa różne Timestamp i określa, który jest starszy.
        Timestamp timestamp2 = Timestamp.valueOf("2024-01-01 13:00:05");
        Timestamp timestamp3 = Timestamp.valueOf("2023-12-11 10:00:00");
        int compareTwoTimestamps = compareTwoTimestamps(timestamp2, timestamp3);
        if (compareTwoTimestamps < 0) {
            System.out.println("Timestamp2 jest starszy od Timestamp3");
        } else if (compareTwoTimestamps > 0) {
            System.out.println("Timestamp2 est młodszy od Timestamp3");
        } else {
            System.out.println("Obwa Timestampy są równe");
        }
        //Stwórz metodę, która dodaje określoną liczbę dni do Timestamp.
        Timestamp timestamp4 = Timestamp.valueOf("2024-01-01 11:11:00");
        int days = 5;
        Timestamp timestampWithAddedDays = addDaysToTimeStamp(timestamp4, days);
        //Napisz funkcję, która oblicza różnicę w minutach między dwoma Timestamp.
        Timestamp timestamp5 = Timestamp.valueOf("2024-01-01 11:11:00");
        Timestamp timestamp6 = Timestamp.valueOf("2023-12-31 19:00:00");
        long differenceInMinutes = differenceBetweenTimestampsInMinutes(timestamp5, timestamp6);
        System.out.println(differenceInMinutes + " minut różnicy");

        //Utwórz metodę konwertującą LocalDateTime na Timestamp.

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        Timestamp timestampFromLocalDateNow = convertLocalDateTimeToTimestamp(localDateTimeNow);
        System.out.println(timestampFromLocalDateNow);
        //Stwórz program, który konwertuje OffsetDateTime na String w określonym formacie.
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        String formattedOffsetDateTime = formattedOffsetDataTime(offsetDateTime, "yyyy-MM-dd HH:mm:ssXXX");
        System.out.println(formattedOffsetDateTime);
//Napisz metodę, która porównuje dwa OffsetDateTime i informuje, które jest późniejsze.
        OffsetDateTime offsetDateTime1 = OffsetDateTime.now();
        OffsetDateTime offsetDateTime2 = OffsetDateTime.now().plusHours(2);
        String result = compareTwoOffsetDataTimes(offsetDateTime1, offsetDateTime2);
        System.out.println(result);

        //Utwórz program, który zmienia strefę czasową dla OffsetDateTime.
        OffsetDateTime actualOffsetDateTime = OffsetDateTime.now();
        ZoneOffset zoneOffset = ZoneOffset.ofHours(3);
        OffsetDateTime changedZone = changeOffsetDateTimeZone(actualOffsetDateTime, zoneOffset);
        System.out.println(changedZone);
        //Stwórz metodę obliczającą różnicę w godzinach i minutach między dwoma OffsetDateTime.
        String difference = differenceBetweenTwoOffsetDateTimes(offsetDateTime1, offsetDateTime2);
        System.out.println(difference);
//Napisz funkcję, która konwertuje java.time.Instant na OffsetDateTime z uwzględnieniem konkretnej strefy czasowej.
        Instant instant = Instant.now();
        String targetedZone = "Europe/Warsaw";
        OffsetDateTime offsetDateTime3 = convertInstantToOffsetDateTime(instant, targetedZone);
        System.out.println(offsetDateTime3);

    }

    public static LocalDateTime convertTimestampToLocalDateTime(Timestamp timestamp) {
        return timestamp.toLocalDateTime();
    }

    public static int compareTwoTimestamps(Timestamp timestamp1, Timestamp timestamp2) {
        return timestamp1.compareTo(timestamp2);
    }

    public static Timestamp addDaysToTimeStamp(Timestamp timestamp, int days) {
        long millisecondsToAdd = days * 24 * 60 * 60 * 1000L;
        long timestampMilliseconds = timestamp.getTime();
        long newTimestampMilliseconds = timestampMilliseconds + millisecondsToAdd;
        return new Timestamp(newTimestampMilliseconds);
    }

    public static long differenceBetweenTimestampsInMinutes(Timestamp timestamp1, Timestamp timestamp2) {
        long differenceInMilliseconds = timestamp2.getTime() - timestamp1.getTime();
        return differenceInMilliseconds / (60 * 1000);
    }

    public static Timestamp convertLocalDateTimeToTimestamp(LocalDateTime localDateTime) {
        return Timestamp.valueOf(localDateTime);
    }

    public static String formattedOffsetDataTime(OffsetDateTime offsetDateTime, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return offsetDateTime.format(formatter);
    }
    public static String compareTwoOffsetDataTimes(OffsetDateTime offsetDateTime1, OffsetDateTime offsetDateTime2){
        if(offsetDateTime1.isAfter(offsetDateTime2)){
           return  "OffsetDateTime1 jest późniejszy od offsetDateTime2";
        }
        else if(offsetDateTime1.isBefore(offsetDateTime2)){
           return "OffsetDateTime2 jest późniejszy od OffsetDateTime1";
        }
        else {
           return "Oba OffsetyDateTime'y są takie same";
        }
    }
    public static OffsetDateTime changeOffsetDateTimeZone(OffsetDateTime offsetDateTime, ZoneOffset zoneOffset){
        return offsetDateTime.withOffsetSameInstant(zoneOffset);
    }
    public static String differenceBetweenTwoOffsetDateTimes(OffsetDateTime offsetDateTime1, OffsetDateTime offsetDateTime2){
        long differenceInHours = ChronoUnit.HOURS.between(offsetDateTime1, offsetDateTime2);
        long differenceInMinutes = ChronoUnit.MINUTES.between(offsetDateTime1, offsetDateTime2);
        return  "Różnica w godzinach wynosi " + differenceInHours + " godzin, a w minutach "
                + differenceInMinutes + " minut.";
    }
    public static OffsetDateTime convertInstantToOffsetDateTime(Instant instant, String targetZoneId) {
        ZoneId zoneId = ZoneId.of(targetZoneId);
        ZoneOffset zoneOffset = zoneId.getRules().getOffset(instant);
        return instant.atOffset(zoneOffset);
    }
}

