package com.jianbao.codecopy.chapter1;

import java.util.regex.Pattern;

/**
 * 对正则表达式进行编译处理并用其提供的compile方法实现字符串拆分
 */
public class PatternCompile {
    public static void main(String[] args)throws Exception{
        String str ="jianbao1jianbao1jianbao1jianbao1";
        String regex="1";
        Pattern pattern=Pattern.compile(regex);
        String result[]=pattern.split(str);
        for(String i : result){
            System.out.println(i);
        }
    }
}
