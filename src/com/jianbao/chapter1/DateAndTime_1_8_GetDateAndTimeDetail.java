package com.jianbao.chapter1;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * 本类主要实现获取当前日期详情
 */
public class DateAndTime_1_8_GetDateAndTimeDetail {
    public static void main(String[] args)throws Exception{
        LocalDate today=LocalDate.now();
        System.out.println(String.format("【当前日期】%s-%s-%s",
                today.getYear(),today.getMonthValue(),today.getDayOfMonth()));
        System.out.println("【获取星期几】"+today.getDayOfWeek().getValue());
        System.out.println("【现在是一月中的第几周】"+today.get(ChronoField.ALIGNED_WEEK_OF_MONTH));
        System.out.println("【现在是一年中的第几周】"+today.get(ChronoField.ALIGNED_WEEK_OF_YEAR));
        System.out.println("【今天是一年中的第几天】"+today.getDayOfYear());

    }
}
