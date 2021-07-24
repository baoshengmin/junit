package com.jd.ut.junit.util;




import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTimeUtil {

    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String formatDate(Date date, String format) {
        if (StringUtils.isEmpty(format)) {
            format = DATE_TIME_FORMAT;
        }
        if (date == null) {
            throw new RuntimeException();
        }
        return new SimpleDateFormat(format).format(date);
    }

    public static String dateToString(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }

}
