package com.jianbao.codecopy.chapter1;

/**
 * 本类主要实现StringBuffer类字符串连接、删除
 */
public class StringBufferAppend {
    public static void main(String[] args)throws Exception{
        StringBuffer buffer =new StringBuffer();
        buffer.append("012").append("3").append("456").append("\n");
        System.out.println(buffer);
        change(buffer);
        System.out.println(buffer);
        //buffer.reverse();
        System.out.println(buffer.delete(0,5));
    }
    private static void change(StringBuffer temp){
        temp.append("789\n");
    }
}
