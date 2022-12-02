package com.jianbao.experiment.e1.StudentMIS.dao.impl;

import com.jianbao.experiment.e1.StudentMIS.dao.StudentListDAO;
import com.jianbao.experiment.e1.StudentMIS.domain.Mark;
import com.jianbao.experiment.e1.StudentMIS.domain.StudentInformation;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Data
public class StudentListDAOImpl implements StudentListDAO {
    @Override
    public void addStudentInfo(String id, String name, String age, Mark mark) {
        StudentInformation info=new StudentInformation(id,name,age,mark);
        Boolean flag=false;
        for(StudentInformation i : list){
            if(info.getId().equals(i.getId())){
                System.out.printf("【ERROR】学号冲突，列表中已存在以下信息：\n%s\n",i);
                flag=true;
                break;
            }
        }
        if(!flag){
            list.add(info);
            System.out.printf("【SUCCEED】增加成功！\n%s\n",info);
        }

    }

    @Override
    public void deleteStudentInfo(String id) {
        Boolean flag=false;
        for(int i=0;i<list.size();i++){
            if(id.equals(list.get(i).getId())){
                StudentInformation info=list.get(i);
                list.remove(i);
                flag=true;
                System.out.printf("【SUCCEED】删除成功！\n%s\n",info);
                break;
            }
        }
        if(!flag){
            System.out.printf("【ERROR】删除失败，列表中不存在学号为【%s】的学生！\n",id);
        }
    }

    @Override
    public StudentInformation getInfo(String id) {
        Boolean flag=false;
        for(StudentInformation i : list){
            if(id.equals(i.getId())){
                flag=true;
                System.out.printf("【SUCCEED】查询成功！\n%s\n",i);
                return i;
            }
        }
        if(!flag){
            System.out.printf("【ERROR】查询失败，列表中不存在学号为【%s】的学生！\n",id);

        }
        return null;
    }

    @Override
    public void setInfo(String id, String name, String age, Mark mark) {
        StudentInformation info=new StudentInformation(id,name,age,mark);
        Boolean flag=false;
        for(int i=0;i<list.size();i++){
            if(id.equals(list.get(i).getId())){
                list.set(i,info);
                flag=true;
                System.out.printf("【SUCCEED】修改成功！\n%s\n",info);
                break;
            }
        }
        if(!flag){
            System.out.printf("【ERROR】修改失败，列表中不存在学号为【%s】的学生！\n",id);
        }
    }

    @Override
    public void display() {
        for(StudentInformation i : list){
            System.out.printf("%s\n",i);
        }
    }
    List<StudentInformation> list=new ArrayList<StudentInformation>();
}
