package com.jianbao.codecopy.chapter1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 使用LocalDate类获取当前日期时间
 */
public class LocalDateGetCurrentDateAndTime {
    public static void main(String[] args)throws Exception{
        LocalDate localDate=LocalDate.now();
        LocalTime localTime= LocalTime.now();
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("【LocalDate实例化对象输出】"+localDate);
        System.out.println("【LocalTime实例化对象输出】"+localTime);
        System.out.println("【LocalDateTime实例化对象输出】"+localDateTime);
    }
}
