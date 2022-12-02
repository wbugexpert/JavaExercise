package com.jianbao.experiment.e1.StudentMIS.service.impl;

import com.jianbao.experiment.e1.StudentMIS.dao.StudentListDAO;
import com.jianbao.experiment.e1.StudentMIS.dao.impl.StudentListDAOImpl;
import com.jianbao.experiment.e1.StudentMIS.domain.Mark;
import com.jianbao.experiment.e1.StudentMIS.domain.StudentInformation;
import com.jianbao.experiment.e1.StudentMIS.service.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ServiceImpl implements Service {
    public ServiceImpl(){
        input=new Scanner(System.in);
        select();
    }
    @Override
    public void add() {
        System.out.printf("请输入学号：\n");
        String id=input.nextLine();
        System.out.printf("请输入姓名：\n");
        String name=input.nextLine();
        System.out.printf("请输入年龄：\n");
        String age=input.nextLine();
        System.out.printf("请输入语文成绩：\n");
        Double chinese=input.nextDouble();
        System.out.printf("请输入数学成绩：\n");
        Double math=input.nextDouble();
        System.out.printf("请输入英语成绩：\n");
        Double english=input.nextDouble();
        Mark mark=new Mark(chinese,math,english);
        studentList.addStudentInfo(id,name,age,mark);
    }

    @Override
    public void remove() {
        System.out.printf("请输入学号：\n");
        String id=input.nextLine();
        studentList.deleteStudentInfo(id);
    }

    @Override
    public void update() {
        System.out.printf("请输入学号：\n");
        String id=input.nextLine();
        System.out.printf("请输入姓名：\n");
        String name=input.nextLine();
        System.out.printf("请输入年龄：\n");
        String age=input.nextLine();
        System.out.printf("请输入语文成绩：\n");
        Double chinese=input.nextDouble();
        System.out.printf("请输入数学成绩：\n");
        Double math=input.nextDouble();
        System.out.printf("请输入英语成绩：\n");
        Double english=input.nextDouble();
        Mark mark=new Mark(chinese,math,english);
        studentList.setInfo(id,name,age,mark);
    }

    @Override
    public void find() {
        System.out.printf("请输入学号：\n");
        String id=input.nextLine();
        studentList.getInfo(id);
    }

    @Override
    public void display() {
        studentList.display();
    }

    @Override
    public void select() {
        System.out.println("------------------------菜单栏----------------------");
        System.out.println("-------------------【1】增加学生信息------------------");
        System.out.println("-------------------【2】删除学生信息------------------");
        System.out.println("-------------------【3】查看学生信息------------------");
        System.out.println("-------------------【4】修改学生信息------------------");
        System.out.println("-------------------【5】显示所有学生------------------");
        System.out.println("-------------------【6】退出程序---------------------");
        int op=input.nextInt();
        input.nextLine();
        switch (op){
            case 1:
                add();
                break;
            case 2:
                remove();
                break;
            case 3:
                find();
                break;
            case 4:
                update();
                break;
            case 5:
                display();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("无效指令，重新输入！");
        }
        select();
    }
    StudentListDAOImpl studentList=new StudentListDAOImpl();
    Scanner input;
}
