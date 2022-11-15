package com.jianbao.chapter1;

import java.util.Calendar;

/**
 * 本类主要实现日期的精确计算
 * 计算30年零6个月后的日期
 */
public class DateAndTime1_8_Calculate_Date {
    public static void main(String[] args){
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.YEAR,30);
        calendar.add(Calendar.MONTH,6);
        System.out.println(String.format("日期时间:%s-%s-%s %s:%s:%s",
                calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.DAY_OF_MONTH),
                calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),calendar.get(Calendar.SECOND)));
    }
}
