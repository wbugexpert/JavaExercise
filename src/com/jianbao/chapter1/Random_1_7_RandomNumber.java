package com.jianbao.chapter1;

import java.util.Random;

/**
 * 本类主要实现基于Random的随机数生成
 */
public class Random_1_7_RandomNumber {
    public static void main(String[] args) throws Exception{
        Random random=new Random();
        for(int i=0;i<10;i++){
            System.out.print(random.nextInt(100)+"、");
        }
    }
}
