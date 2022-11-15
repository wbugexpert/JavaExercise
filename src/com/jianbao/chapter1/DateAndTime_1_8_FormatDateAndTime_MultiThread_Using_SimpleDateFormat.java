package com.jianbao.chapter1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 本类主要实现多线程下的日期格式转换，若干线程共享同一对象实例，从而减少对象个数，提高程序性能
 * 但是由于SimpleDateFormat类没有提供数据同步处理，所以可能出现转换异常
 */
public class DateAndTime_1_8_FormatDateAndTime_MultiThread_Using_SimpleDateFormat {
    public static void main(String[] args){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for(int i=0;i<10;i++){
            new Thread(() -> {
                try{
                    System.out.println("【"+Thread.currentThread().getName()+"】"+simpleDateFormat.parse("1998-02-17 21:15:12"));
                }catch (ParseException e){
                    e.printStackTrace();
                }
            },"SDF转换线程 - "+i).start();
        }
    }
}
