package com.jianbao.codecopy.chapter1;

import java.util.Calendar;

/**
 * 本类主要基于Calendar实现获取当前日期时间
 */
public class CalendarGetCurrentDateAndTime {
    public static void main(String[] args)throws Exception{
        Calendar calendar=Calendar.getInstance();
        System.out.println(String.format("当前的日期时间:%s-%s-%s %s:%s:%s",
                calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.DAY_OF_MONTH),
                calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),calendar.get(Calendar.SECOND)));
    }
}
