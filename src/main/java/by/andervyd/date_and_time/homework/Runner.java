package by.andervyd.date_and_time.homework;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Runner {
    public static void main(String[] args) {

        LocalDateTime start = LocalDateTime.of(2020, 4, 21, 12, 34);
        LocalDateTime end = LocalDateTime.now();

        Period period = Period.ofMonths(6);
        Duration duration = Duration.ofHours(8);

        WorkShift workShift = new WorkShift();

        workShift.shift(start, end, period, duration);
    }
}
