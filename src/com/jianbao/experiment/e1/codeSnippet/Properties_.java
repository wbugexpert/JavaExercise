package com.jianbao.experiment.e1.codeSnippet;
import java.util.*;
public class Properties_ {
    public static void main(String[] args) {
        Properties prop = new Properties(); // 属性存储
        prop.setProperty("scau", " www.scau.edu.cn "); // 设置属性内容
        prop.setProperty("scaujava", "www.scau.edu.cn "); // 设置属性内容
        System.out.println(prop.getProperty("scau")); // 根据key查找属性
        System.out.println(prop.getProperty("yootk", "NoFound"));// 根据key查找属性
        System.out.println(prop.getProperty("yootk")); // 根据key查找属性
    }
}
