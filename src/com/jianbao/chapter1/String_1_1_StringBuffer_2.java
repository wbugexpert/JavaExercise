package com.jianbao.chapter1;
import java.lang.StringBuffer;

/**
 * 本类主要实现StringBuffer字符串的一些拓展操作
 */
public class String_1_1_StringBuffer_2 {
    public static void main(String[] args)throws Exception{
        StringBuffer buffer=new StringBuffer(30);
        buffer.append("www.github.com").insert(0,"托管平台：");
        System.out.println("【原数据】"+buffer);
        System.out.println("【数据删除】"+buffer.delete(0,5));//这里buffer是先执行操作，再输出，因此下次再输出的时候，buffer的值已经delete(0,5)了
        System.out.println("【数据替换】"+buffer.replace(0,13,"edu"));
        System.out.println("【数据反转】"+buffer.reverse());
    }
}
