package com.jianbao.codecopy.chapter1;

import java.util.Calendar;

/**
 * 本类主要实现找到八月的最后一天
 */
public class GetTheLastDayOfAugust {
    public static void main(String[] args){
        Calendar calendar=Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR),8,1);
        calendar.add(Calendar.DATE,-1);
        System.out.println(String.format("日期时间:%s-%s-%s %s:%s:%s",
                calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.DAY_OF_MONTH),
                calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),calendar.get(Calendar.SECOND)));
    }
}
