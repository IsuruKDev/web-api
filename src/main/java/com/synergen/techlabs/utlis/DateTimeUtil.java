package com.synergen.techlabs.utlis;

import com.synergen.techlabs.Constants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {

    public static String getDateTime(LocalDateTime dateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Constants.DATE_FORMATTER);
        return dateTime.format(formatter);
    }
}
