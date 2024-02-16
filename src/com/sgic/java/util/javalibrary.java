package com.sgic.java.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class javalibrary {

    public static String validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            return "Email is Invalid";
        }
        return null;
    }

    public static String changeNullToString(String input) {
        return input == null ? "" : input;
    }

    public static Date convertStringToDate(String dateString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.parse(dateString);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Number> T addNumbers(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else if (num1 instanceof Float) {
            return (T) Float.valueOf(num1.floatValue() + num2.floatValue());
        } else if (num1 instanceof Long) {
            return (T) Long.valueOf(num1.longValue() + num2.longValue());
        } else {
            throw new IllegalArgumentException("Unsupported numeric type");
        }
    }
}
