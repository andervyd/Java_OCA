package by.andervyd.date_and_time.homework;

import java.time.format.DateTimeFormatter;

public class DateFormat {

    public static final DateTimeFormatter dateTimeFormatterOne =
            DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");

    public static final DateTimeFormatter dateTimeFormatterTwo =
            DateTimeFormatter.ofPattern("hh:mm dd/MMM/yy");

}
