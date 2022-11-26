package com.jianbao.codecopy.chapter1;
/**
 * 判断一个字符串是否是一个E-mail地址
 */
public class E_mailRegex {
    public static void main(String[] args)throws Exception{
        String str="510211592@qq.com";
        String regex="[a-zA-Z_0-9]+@[a-zA-Z0-9]+\\.(com|com\\.cn|net|net\\.cn|gov|edu)";
        System.out.println(str.matches(regex));
    }
}
