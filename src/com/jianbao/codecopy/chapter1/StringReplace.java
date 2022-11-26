package com.jianbao.codecopy.chapter1;

/**
 * 给定一个字符串，保留字符串中的小写字母
 */
public class StringReplace {
    public static void main(String[] args)throws Exception{
        String str="yUasdasf*$%$sdasdkKJSDSHDSHDifidd(^&%^#$%#$$#@$@#$#@$@#$";
        String regex="[^a-z]";
        System.out.println(str.replaceAll(regex,""));
    }
}
