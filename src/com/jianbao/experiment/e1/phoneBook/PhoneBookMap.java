package com.jianbao.experiment.e1.phoneBook;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class PhoneBookMap {
    public void add(String name,String tel) {
        for(Map.Entry<String, String> entry:map.entrySet()){
            if(entry.getKey().equals(name)){
                System.out.printf("【ERROR】电话簿中已存在姓名为%s的联系人！\n",name);
                return;
            }
        }
        map.put(name, tel);
        System.out.printf("【SUCCEED】添加成功！{ 姓名：%s ， 电话号码：%s }\n",name,tel);
        return;
    }
    public void remove(String name) {
        for(Map.Entry<String, String> entry:map.entrySet()){
            if(entry.getKey().equals(name)){
                String tel=map.remove(entry.getKey());
                System.out.printf("【SUCCEED】删除成功！{ 姓名：%s ， 电话号码：%s }\n",name,tel);
                return;
            }
        }
        System.out.printf("【ERROR】删除失败，电话簿中不存在姓名为%s的联系人！\n",name);
    }
    public void find(String name) {
        for(Map.Entry<String , String> entry: map.entrySet()){
            if(entry.getKey().equals(name)){
                System.out.printf("【SUCCEED】查询成功！{ 姓名：%s ， 电话号码：%s }\n",name,entry.getValue());
                return;
            }
        }
        System.out.printf("【ERROR】查询失败，电话簿中不存在姓名为%s的联系人！\n",name);
    }
    public void display() {
        for(Map.Entry<String , String> entry: map.entrySet()){
            System.out.printf("\t【%s】%s\n",entry.getKey(),entry.getValue());
        }
    }

    Map<String ,String > map = new HashMap<String, String>();
}
