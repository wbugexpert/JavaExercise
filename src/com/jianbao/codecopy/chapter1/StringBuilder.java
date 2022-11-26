package com.jianbao.codecopy.chapter1;

/**
 * 本类主要实现StringBuilder类修改字符串
 */
public class StringBuilder {
    public static void main(String[] args)throws Exception{
        java.lang.StringBuilder builder = new java.lang.StringBuilder(30);
        builder.append("www.github.com").insert(0,"在线代码托管平台:");
        System.out.println(builder);
        System.out.println(builder.replace(9,25,"www.github222.com").delete(0,9));
        System.out.println(builder);
    }
}
