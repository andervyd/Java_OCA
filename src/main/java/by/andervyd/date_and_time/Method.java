package by.andervyd.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Method {
    public static void main(String[] args) {

        System.out.println("\n==== Methods LocalDate, LocalTime and LocalDateTime ====");
        System.out.println("==== now() ====");
        System.out.println(LocalDate.now());

        System.out.println("\n==== of() ====");
        LocalDate localDate = LocalDate.of(2021, 05, 26);
        System.out.println(localDate);
        LocalDate localDateTwo = LocalDate.of(2021, Month.MAY, 26);
        System.out.println(localDateTwo);

        LocalTime localTime = LocalTime.of(12, 34);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);

        System.out.println("\n==== isAfter() and isBefore() ===="); // minusDays()
        LocalDate ld1 = LocalDate.of(2000, 5, 12);
        LocalDate ld2 = LocalDate.of(2001, 5, 12);
        System.out.println(ld1.isAfter(ld2));
        System.out.println(ld1.isBefore(ld2));

        System.out.println("==== get ====");
        System.out.println(ld1.getDayOfMonth());

        System.out.println("\n==== Methods LocalDate ====");
        System.out.println("==== plusDays() ===="); // minusDays()
        // plusWeeks(), minusWeeks()
        // plusMonths(), minusMonths()
        // plusYears(), minusYears()
        LocalDate localDateOne = LocalDate.of(2021, 05, 20);
        System.out.println(localDateOne);
        localDateOne = localDateOne.plusDays(6);
        System.out.println(localDateOne);

        System.out.println("\n==== Methods LocalTime ====");
        System.out.println("==== plusHours() ===="); // minusHours()
        // plusMinutes(), minusMinutes()
        // plusSeconds(), minusSeconds()
        // plusNanos(), minusNanos()
        LocalTime localTimeOne = LocalTime.of(12, 34);
        System.out.println(localTimeOne);
        localTimeOne = localTimeOne.plusHours(6);
        System.out.println(localDateOne);






    }
}
