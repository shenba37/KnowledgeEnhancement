package com.learning.java8programming.datatime;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Implementation implements Concept {

    @Override
    public void convertDateToString(String dateTimeFormatPattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimeFormatPattern);
        System.out.println(dateTimeFormatter.format(ZonedDateTime.now()));
    }
}
