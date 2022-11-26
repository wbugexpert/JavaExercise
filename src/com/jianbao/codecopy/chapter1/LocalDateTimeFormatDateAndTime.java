package com.jianbao.codecopy.chapter1;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 本类主要实现多线程下的日期格式转换，若干线程共享同一对象实例，从而减少对象个数，提高程序性能
 * 实现并发转换
 */
public class LocalDateTimeFormatDateAndTime {
    public static void main(String[] args) throws Exception{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ZoneId zoneId=ZoneId.systemDefault();
        for(int i=0;i<10;i++){
            new Thread(() -> {
                LocalDateTime localDateTime=LocalDateTime.parse("1998-02-14 21:12:22",formatter);
                Instant instant=localDateTime.atZone(zoneId).toInstant();
                Date date= Date.from(instant);
                System.out.println("【"+Thread.currentThread().getName()+"】"+date);
            },"LDT转换线程 - "+i).start();
        }
    }
}
