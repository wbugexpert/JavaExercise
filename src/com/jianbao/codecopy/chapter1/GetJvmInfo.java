package com.jianbao.codecopy.chapter1;

/**
 * 本类主要实现获取当前JVM内存状态
 */
public class GetJvmInfo {
    public static void main(String[] args)throws Exception{
        Runtime runtime=Runtime.getRuntime();
        System.out.println("MaxMemory = "+ runtime.maxMemory());
        System.out.println("TotalMemory = "+ runtime.totalMemory());
        System.out.println("FreeMemory = "+ runtime.freeMemory());
    }
}
