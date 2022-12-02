package com.jianbao.experiment.e1.codeSnippet;
import java.util.*;
public class setForeach_ {
    public static void main(String[] args) {
        Set<String> all = new HashSet<String>(); // 实例化Set
        all.add("老师"); // 保存数据
        all.add("Java"); // 保存数据
        all.add("www.scau.edu.cn "); // 保存数据
        for (String str : all) {
            System.out.print(str + "、");
        } }
}
