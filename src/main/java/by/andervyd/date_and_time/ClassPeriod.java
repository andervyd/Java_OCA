package by.andervyd.date_and_time;

import java.time.LocalDate;
import java.time.Period;

public class ClassPeriod {

    public static void changeEmployee(LocalDate start, LocalDate end, Period period) {
        LocalDate date = start;

        while (date.isBefore(end)) {
            System.out.println("Date: " + date + " for change employee");
            date = date.plus(period);
        }
    }

    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2019, 1, 1);
        LocalDate end = LocalDate.of(2020, 1, 1);
        Period period = Period.ofMonths(2);

        changeEmployee(start, end, period);
    }
}
