package com.jianbao.chapter1;

/**
 * 本类主要实现手动停止程序运行
 */
public class System_1_4_ManualExit {
    public static void main(String [] args)throws Exception{
        if(args.length!=2){
            System.out.println("【错误】本程序执行时需要传递初始化参数，否则无法运行！");
            System.out.println("【提示】可以按照如下方式运行： java 类名 参数1 参数2");
            System.exit(1);
        }
        System.out.println("Hello world");
    }
}
