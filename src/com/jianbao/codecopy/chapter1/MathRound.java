package com.jianbao.codecopy.chapter1;
/**
 * 本类主要实现基于Math类的四舍五入
 */
public class MathRound
{
    public static void main(String[] args) throws Exception{
        System.out.println("【四舍五入】"+Math.round(-10.3));
        System.out.println("【四舍五入】"+Math.round(45.1));
        System.out.println("【四舍五入】"+Math.round(15.51));
        System.out.println("【四舍五入】"+Math.round(-10.51));
        System.out.println("【四舍五入】"+Math.round(-10.1));
    }
}
