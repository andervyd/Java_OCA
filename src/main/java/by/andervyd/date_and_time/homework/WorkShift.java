package by.andervyd.date_and_time.homework;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class WorkShift {

    public void shift(
            LocalDateTime start, LocalDateTime end, Period period, Duration duration) {

        while (start.isBefore(end)) {
            System.out.println("============================================");
            System.out.print("Working with " + start.format(DateFormat.dateTimeFormatterOne));
            start = start.plus(period);
            System.out.println(" to " + start.format(DateFormat.dateTimeFormatterOne));
            System.out.print("Resting from the " + start.format(DateFormat.dateTimeFormatterTwo));
            start = start.plus(duration);
            System.out.println(" to " + start.format(DateFormat.dateTimeFormatterTwo));
        }
    }
}
