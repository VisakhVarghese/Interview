package jdk_;


import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * The API is located in the java.time package and offers a more intuitive and consistent approach
 * to handling date and time compared to the old java.util.Date and java.util.Calendar classes.
 */
public class DateAndTime {
    public static void main(String[] args) {

        //LocalDate
        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2024, 7, 7);
        LocalDate parsedDate = LocalDate.parse("2024-07-07");

        System.out.println("Today's Date: " + today);
        System.out.println("Specific Date: " + specificDate);
        System.out.println("Parsed Date: " + parsedDate);

        System.out.println();
        //LocalTime
        LocalTime now = LocalTime.now();
        LocalTime specificTime = LocalTime.of(14, 30);
        LocalTime parsedTime = LocalTime.parse("14:30:00");

        System.out.println("Current Time: " + now);
        System.out.println("Specific Time: " + specificTime);
        System.out.println("Parsed Time: " + parsedTime);

        System.out.println();
//        LocalDateTime
        LocalDateTime noww = LocalDateTime.now();
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 7, 7, 14, 30);
        LocalDateTime parsedDateTime = LocalDateTime.parse("2024-07-07T14:30:00");

        System.out.println("Current DateTime: " + noww);
        System.out.println("Specific DateTime: " + specificDateTime);
        System.out.println("Parsed DateTime: " + parsedDateTime);

        System.out.println();
//        ZonedDateTime
        ZonedDateTime nowww = ZonedDateTime.now();
        ZonedDateTime specificZonedDateTime = ZonedDateTime.of(2024, 7, 7, 14,
                30, 0, 0, ZoneId.of("Europe/Paris"));
        ZonedDateTime parsedZonedDateTime = ZonedDateTime.parse("2024-07-07T14:30:00+01:00[Europe/Paris]");

        System.out.println("Current ZonedDateTime: " + nowww);
        System.out.println("Specific ZonedDateTime: " + specificZonedDateTime);
        System.out.println("Parsed ZonedDateTime: " + parsedZonedDateTime);

        System.out.println();

        Instant nowwww = Instant.now();
        Instant specificInstant = Instant.ofEpochSecond(1625673600);
        Instant parsedInstant = Instant.parse("2024-07-07T12:00:00Z");

        System.out.println("Current Instant: " + nowwww);
        System.out.println("Specific Instant: " + specificInstant);
        System.out.println("Parsed Instant: " + parsedInstant);

        System.out.println();

//        Duration
        LocalTime startTime = LocalTime.of(10, 0);
        LocalTime endTime = LocalTime.of(14, 30);
        Duration duration = Duration.between(startTime, endTime);

        System.out.println("Duration: " + duration);

        System.out.println();

//        Period
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 7, 7);
        Period period = Period.between(startDate, endDate);

        System.out.println("Period: " + period);

//        Formatting and Parsing with DateTimeFormatter
        LocalDateTime noow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDateTime = noow.format(formatter);
        LocalDateTime parrsedDateTime = LocalDateTime.parse("2024-07-07 14:30:00", formatter);

        System.out.println("Formatted DateTime: " + formattedDateTime);
        System.out.println("Parsed DateTime: " + parrsedDateTime);

        System.out.println();

//        Offset - An offset is the amount of time (in hours and minutes) that a specific time zone is ahead or behind UTC.

        LocalDateTime localDateTime = LocalDateTime.of(2024, 7, 7, 14, 30);
        ZoneOffset offset = ZoneOffset.of("+02:00");

        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);

        System.out.println("Local DateTime: " + localDateTime);
        System.out.println("Offset: " + offset);
        System.out.println("Offset DateTime: " + offsetDateTime);

        Instant instant = Instant.now();
        ZoneOffset offsett = ZoneOffset.of("-05:00");

        OffsetDateTime offfsetDateTime = instant.atOffset(offsett);

        System.out.println("Current Instant: " + instant);
        System.out.println("Offset: " + offset);
        System.out.println("Offset DateTime: " + offfsetDateTime);
    }

}

/**
 * Key Classes in the Date and Time API:
 * LocalDate: Represents a date without a time zone (e.g., 2024-07-07).
 * LocalTime: Represents a time without a time zone (e.g., 14:30:00).
 * LocalDateTime: Combines date and time without a time zone (e.g., 2024-07-07T14:30:00).
 * ZonedDateTime: Represents a date and time with a time zone (e.g., 2024-07-07T14:30:00+01:00[Europe/Paris]).
 * Instant: Represents a point in time (e.g., a timestamp).
 * Duration: Represents a duration or amount of time (e.g., 3 hours, 45 minutes).
 * Period: Represents a date-based amount of time (e.g., 2 years, 3 months).
 * ZoneId: Represents a time zone identifier (e.g., Europe/Paris).
 * ZoneOffset: Represents a time zone offset (e.g., +02:00).
 * DateTimeFormatter: For formatting and parsing date-time objects.
 */
