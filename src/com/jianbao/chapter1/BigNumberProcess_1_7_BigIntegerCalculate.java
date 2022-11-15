package com.jianbao.chapter1;
/**
 * 本类主要实现大数字（整型）的加减乘除
 */

import java.math.BigInteger;

public class BigNumberProcess_1_7_BigIntegerCalculate {
    public static void main(String[] args){
        BigInteger bigA=new BigInteger("22222222222222222222222222222222222222222222");
        BigInteger bigB=new BigInteger("66666666666666666666666666666666666666666666");
        System.out.println("【加法运算】"+bigA.add(bigB));
        System.out.println("【减法运算】"+bigA.subtract(bigB));
        System.out.println("【乘法运算】"+bigA.multiply(bigB));
        System.out.println("【除法运算】"+bigB.divide(bigA));
    }
}
