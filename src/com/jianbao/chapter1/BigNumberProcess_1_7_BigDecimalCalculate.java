package com.jianbao.chapter1;
/**
 * 本类主要实现大数字（浮点型）的加减乘除
 */

import java.math.BigDecimal;

public class BigNumberProcess_1_7_BigDecimalCalculate {
    public static void main(String[] args){
        BigDecimal bigA=new BigDecimal("2222222222222222222222222222222222222222.2222");
        BigDecimal bigB=new BigDecimal("6666666666666666666666666666666666666666.6665");
        System.out.println("【加法运算】"+bigA.add(bigB));
        System.out.println("【减法运算】"+bigA.subtract(bigB));
        System.out.println("【乘法运算】"+bigA.multiply(bigB));
        System.out.println("【除法运算】"+bigB.divide(bigA,2,BigDecimal.ROUND_HALF_UP));
    }
}
