package com.jianbao.codecopy.chapter1;

/**
 * 实现String和StringBuffer的双向转换
 */

public class StringTypeChange {
    public static void main(String[] args)throws Exception{
        String str="尖宝爱你：www.jianbao.com";
        StringBuffer buffer=new StringBuffer(str);
        System.out.println("【StringBuffer】"+buffer);
        String message=buffer.toString();
        System.out.println("【String】"+message.toUpperCase());
    }
}
