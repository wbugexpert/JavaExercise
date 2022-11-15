package com.jianbao.chapter1;

/**
 * 本类主要实现统计程序耗时
 */
public class System_1_4_CalculateTimeDifference {
    public static void main(String[] args)throws Exception{
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("本次程序耗时统计："+(end-start)+"ms");
    }
}
