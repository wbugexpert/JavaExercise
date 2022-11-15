package com.jianbao.chapter1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime_1_8_GetCurrentDateAndTime_Using_LocalDate {
    public static void main(String[] args)throws Exception{
        LocalDate localDate=LocalDate.now();
        LocalTime localTime= LocalTime.now();
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("【LocalDate实例化对象输出】"+localDate);
        System.out.println("【LocalTime实例化对象输出】"+localTime);
        System.out.println("【LocalDateTime实例化对象输出】"+localDateTime);
    }
}
