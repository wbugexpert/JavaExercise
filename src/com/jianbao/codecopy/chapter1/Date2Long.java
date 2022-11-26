package com.jianbao.codecopy.chapter1;

import java.util.Date;

/**
 * 本类主要实现Date实例与long类型数据的转换
 */
public class Date2Long {
    public static void main(String[] args){
        long dateTime=System.currentTimeMillis()-10000;
        Date dateA=new Date(dateTime);
        Date dateB=new Date();
        System.out.println(dateA);
        System.out.println(dateB);
        System.out.println("【两个日期之间所差的毫秒数】"+(dateB.getTime()-dateA.getTime()));
        System.out.println("【先后关系】AFTER："+dateA.after(dateB));
        System.out.println("【先后关系】BEFORE："+dateA.before(dateB));
    }
}
