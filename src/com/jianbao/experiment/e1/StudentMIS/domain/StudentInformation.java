package com.jianbao.experiment.e1.StudentMIS.domain;
import lombok.*;

/**
 * 学生信息类
 * 主要记录学生信息
 */
@Data
public class StudentInformation {
    String id;
    String name;
    String age;
    Mark mark;
    public StudentInformation(){
    }
    public StudentInformation(String id,String name,String age,Mark mark){
        this.id=id;
        this.name=name;
        this.age=age;
        this.mark=mark;
    }

    @Override
    public String toString() {
        return "【id=" + id  +"】 name=" + name +", age=" + age + ", mark=" + mark ;
    }
}
