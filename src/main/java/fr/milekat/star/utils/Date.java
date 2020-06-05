package fr.milekat.star.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class Date {
    private static final Pattern periodPattern = Pattern.compile("([0-9]+)([smhj])");
    private static final DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static String setDateNow() {
        return df.format(new java.util.Date());
    }

    public static String setDate(java.util.Date date) {
        return df.format(date);
    }

    public static java.util.Date getDate(String date) throws ParseException {
        return df.parse(date);
    }
}
