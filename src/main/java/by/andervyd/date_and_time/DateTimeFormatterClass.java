package by.andervyd.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterClass {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd-MMM-yy");
        System.out.println(dateTimeFormatter1.format(localDate));

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTimeFormatter2.format(localDate));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate localDate1 = LocalDate.parse("12 04 2021", dateTimeFormatter);
        System.out.println(localDate1);

    }
}
