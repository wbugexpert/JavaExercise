package com.jianbao.homework;

import java.io.Serializable;
import java.util.*;

/**
 * 利用类集实现若干学生信息存储，除了保护学生的基本信息之外还要求保存学生的数学成绩、编程成绩、英语成绩，随后统计所有学生的总成绩以及每门课程的平均成绩。
 */
class Student implements Serializable, Comparable<Student> {
    private Integer id;
    private String name;
    private Double math;
    private Double program;
    private Double english;
    public Student(Integer id,String name,Double math,Double program,Double english){
        this.id=id;
        this.name=name;
        this.math=math;
        this.program=program;
        this.english=english;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getProgram() {
        return program;
    }

    public void setProgram(Double program) {
        this.program = program;
    }

    public Double getEnglish() {
        return english;
    }

    public void setEnglish(Double english) {
        this.english = english;
    }

    public Double getTotalScore(int scale){
        return Math.round((this.math+this.program+this.english)*Math.pow(10.0,scale))/Math.pow(10.0,scale);
    }
    public Double getAvgScore(int scale){
        return Math.round((this.math+this.program+this.english)/3*Math.pow(10.0,scale))/Math.pow(10.0,scale);
    }

    @Override
    public int compareTo(Student o) {
        Double totalScore_this=this.getTotalScore(2);
        Double totalScore_o=o.getTotalScore(2);
        if(totalScore_this-totalScore_o!=0)return (int)(totalScore_this-totalScore_o);
        else return this.id-o.id;
    }

    @Override
    public String toString() {
        return "【Student】 学号： "+this.id.toString()+" 姓名： "+this.name+" 数学成绩： "+this.math.toString()
                +" 英语成绩： "+this.english.toString()+" 编程成绩： "+this.program.toString()
                +" 各科平均成绩： "+this.getAvgScore(2)+" 总成绩: "+this.getTotalScore(2);
    }
}
public class StudentsScoreStatistics {
    public static void main(String[] args)throws Exception{
        List<Student> students=new ArrayList<>();
        students.add(new Student(1001,"张三",100.0,52.6,66.6));
        students.add(new Student(1002,"李四",52.3,88.2,76.6));
        students.add(new Student(1003,"王五",60.0,77.3,74.2));
        students.add(new Student(1004,"赵六",83.6,84.1,99.2));
        students.add(new Student(1005,"田七",54.2,84.6,79.5));
        Collections.sort(students);
        for(Student student : students){
            System.out.println(student);
        }

    }

}
