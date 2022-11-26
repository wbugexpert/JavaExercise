package com.jianbao.codecopy.chapter1;

/**
 * 实现字符串的分割
 */
public class StringSplit {
    public static void main(String[] args)throws Exception{
        String str="我爱你jianbao你真帅jianbao大帅哥jianbao";
        String regex="[a-z]+";
        String result[]=str.split(regex);
        for(String i : result){
            System.out.println(i);
        }
    }
}
