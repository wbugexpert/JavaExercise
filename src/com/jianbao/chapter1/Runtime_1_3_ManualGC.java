package com.jianbao.chapter1;

/**
 * 本类主要实现手动gc
 */

public class Runtime_1_3_ManualGC {
    public static void main(String[] args)throws Exception{
        Runtime runtime=Runtime.getRuntime();
        String message="www.github.com";
        //这里有一个问题，就是字符串长度是有限制的，最大长度为2^31-1，实际应用中应避免产生如此长的字符串，或者采用其他数据结构存储
        for(int x=0;x<20;x++){
            message+=(message+x+"\n");
            //System.out.println("["+x+"]"+message);
            System.out.println("["+x+"]"+message.length());
        }
        System.out.println("【1】垃圾产生后的内存信息：MaxMemory = "+runtime.maxMemory());
        System.out.println("【1】垃圾产生后的内存信息：TotalMemory = "+runtime.totalMemory());
        System.out.println("【1】垃圾产生后的内存信息：FreeMemory = "+runtime.freeMemory());
        runtime.gc();
        System.out.println("【1】GC调用后的内存信息：MaxMemory = "+runtime.maxMemory());
        System.out.println("【1】GC调用的内存信息：TotalMemory = "+runtime.totalMemory());
        System.out.println("【1】GC调用后的内存信息：FreeMemory = "+runtime.freeMemory());
    }
}
