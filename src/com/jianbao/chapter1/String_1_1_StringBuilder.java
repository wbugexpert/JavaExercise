package com.jianbao.chapter1;

/**
 * 本类主要实现StringBuilder类字符串的一些基本操作
 */
public class String_1_1_StringBuilder {
    public static void main(String[] args)throws Exception{
        StringBuilder builder = new StringBuilder(30);
        builder.append("www.github.com").insert(0,"在线代码托管平台:");
        System.out.println(builder);
        System.out.println(builder.replace(9,25,"www.github222.com").delete(0,9));
        System.out.println(builder);
    }
}
