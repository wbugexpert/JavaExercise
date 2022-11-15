package com.jianbao.chapter1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 本类主要实现字符串转Date实例
 */
public class DateAndTime_1_8_String2Date {
    public static void main(String[] args)throws Exception{
        String str="1997-07-01 15:54:36.873";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = sdf.parse(str);
        System.out.println(date);
    }
}
