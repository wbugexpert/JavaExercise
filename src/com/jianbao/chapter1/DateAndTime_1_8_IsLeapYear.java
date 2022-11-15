package com.jianbao.chapter1;

import java.time.LocalDate;

/**
 * 特定日期的闰年判断
 */
public class DateAndTime_1_8_IsLeapYear {
    public static void main(String[] args){
        LocalDate localDate=LocalDate.parse("1987-09-15");
        System.out.println("【闰年判断】"+localDate.isLeapYear());
        System.out.println("【获取星期几】"+localDate.getDayOfWeek());
    }
}
