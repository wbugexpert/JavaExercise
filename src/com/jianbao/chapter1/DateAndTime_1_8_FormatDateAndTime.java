package com.jianbao.chapter1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期时间格式化
 */
public class DateAndTime_1_8_FormatDateAndTime {
    public static void main(String[] args)throws Exception{
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String str=simpleDateFormat.format(date);
        System.out.println(str);
    }
}
