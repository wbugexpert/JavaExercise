package com.jianbao.codecopy.chapter1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 用正则表达式实现字符串和日期/日期时间的转换
 */
public class DateRegex {
    public static DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static ZoneId zoneId=ZoneId.systemDefault();
    public static void main(String[] args)throws Exception{
        String str="2022-12-12";
        String str1="2022-12-12 21:00:00";
        String dateRegex="\\d{4}-\\d{2}-\\d{2}";
        String datetimeRegex="\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}";
        if(str.matches(dateRegex)){
            LocalDate localDate=LocalDate.parse(str,dateFormatter);
            Instant instant=localDate.atStartOfDay().atZone(zoneId).toInstant();
            Date date=Date.from(instant);
            System.out.println("【字符串转日期】"+date);
        }
        if(str1.matches(datetimeRegex)){
            LocalDateTime localDateTime=LocalDateTime.parse(str1,dateTimeFormatter);
            Instant instant = localDateTime.atZone(zoneId).toInstant();
            Date date=Date.from(instant);
            System.out.println("【字符串转日期时间】"+date);
        }
    }
}
