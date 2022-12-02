package com.jianbao.experiment.e1.codeSnippet;
import java.util.Set;
import java.util.TreeSet;
public class Set_ {
    public static void main(String[] args) {
        Set<String> all = new TreeSet<String>(); // 为Set父接口进行实例化
        all.add("java"); // 保存数据
        all.add("Java"); // 保存重复数据
        all.add("Java"); // 保存重复数据
        all.add("Hello"); // 保存数据
        System.out.println(all); // 直接输出集合对象
    }
}
