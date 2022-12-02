package com.jianbao.experiment.e1.codeSnippet;

import java.util.Map;
import java.util.HashMap;

public class Map_ {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>(); // 创建Map集合
        map.put("one", 1); // 保存数据
        map.put("two", 2); // 保存数据
        map.put("one", 101); // key重复，发生覆盖
        map.put(null, 0); // key为null
        map.put("zero", null); // value为null
        System.out.println(map.get("one")); // key存在
        System.out.println(map.get(null)); // key存在
        System.out.println(map.get("ten")); // key不存在
    }
}
