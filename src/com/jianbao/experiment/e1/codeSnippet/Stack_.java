package com.jianbao.experiment.e1.codeSnippet;
import java.util.*;
public class Stack_ {
    public static void main(String[] args) {
        Stack<String> all = new Stack<String>() ; // 实例化栈结构
        all.push("A") ; // 入栈操作
        all.push("B") ; // 入栈操作
        all.push("C") ; // 入栈操作
        System.out.println(all.pop()); // 出栈操作
        System.out.println(all.pop()); // 出栈操作
        System.out.println(all.pop()); // 出栈操作
        System.out.println(all.pop()); // 无数据、EmptyStackException
    }
}
