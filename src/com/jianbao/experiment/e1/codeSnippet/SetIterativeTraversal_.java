package com.jianbao.experiment.e1.codeSnippet;
import java.util.*;
public class SetIterativeTraversal_ {
    public static void main(String[] args) {
        //Set<String> all = Set.of("Hello", "ScauJava", "Scau"); // 创建Set集合
        Set<String> all = new HashSet<String>();
        all.add("Hello");
        all.add("ScauJava");
        all.add("Scau");
        Iterator<String> iter = all.iterator(); // 实例化Iterator接口对象
        while (iter.hasNext()) { // 集合是否有数据
            String str = iter.next(); // 获取每一个数据
            System.out.print(str + "、"); // 输出数据
        } }
}
