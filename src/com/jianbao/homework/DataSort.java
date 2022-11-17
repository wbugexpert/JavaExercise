package com.jianbao.homework;

import java.util.*;

/**
 * 从键盘输入数据“TOM:89|JERRY:90|TONY:95”，数据格式为“姓名：成绩|姓名：成绩|姓名：成绩”，对输入的内容按照成绩由高到低排序。
 */
class Info {
    public String name;
    public double score;
}
public class DataSort {
    public static void main(String[] args)throws Exception {
        Scanner input=new Scanner(System.in);
        List<Info>table=new ArrayList<Info>();
        String data=input.next();
        String[] info = data.split("\\|");
        //System.out.println(info);
        for(int i=0;i<info.length;i++) {
            Info info1 = new Info();
            info1.name = info[i].split(":")[0];
            info1.score = Double.parseDouble(info[i].split(":")[1]);
            table.add(info1);
        }
        Collections.sort(table, new  Comparator<Info>(){
            @Override
            public int compare(Info o1, Info o2) {
                return (int)(o2.score-o1.score);
            }
        });
        for(int i=0;i<table.size();i++){
            System.out.printf("【NO.%d】   %-8s%.2f\n",i+1,table.get(i).name,table.get(i).score);
        }
    }
}
