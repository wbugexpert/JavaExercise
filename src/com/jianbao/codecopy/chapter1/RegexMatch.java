package com.jianbao.codecopy.chapter1;

/**
 * 判断字符串的组成是否符合正则表达式
 */
public class RegexMatch {
    public static void main(String[] args)throws Exception{
        String str="123321211";
        System.out.println(str.matches("\\d+"));
    }
}
