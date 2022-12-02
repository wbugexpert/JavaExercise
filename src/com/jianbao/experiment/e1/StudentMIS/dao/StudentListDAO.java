package com.jianbao.experiment.e1.StudentMIS.dao;

import com.jianbao.experiment.e1.StudentMIS.domain.Mark;
import com.jianbao.experiment.e1.StudentMIS.domain.StudentInformation;

import java.util.Map;

public interface StudentListDAO {
    /**
     * 增加单个学生信息
     * @param id 学生学号
     * @param name 学生姓名
     * @param age 学生年龄
     * @param mark 学生成绩信息
     */
    void addStudentInfo(String id, String name, String age, Mark mark);
    /**
     * 删除单个学生信息
     * @param id 学生学号
     */
    void deleteStudentInfo(String id);
    /**
     * 本方法主要实现返回学生信息
     * @param id 学生学号
     * @return 学号、姓名、年龄和成绩
     */
    StudentInformation getInfo( String id);
    /**
     * 本方法主要实现修改学生信息
     * @param id 学生学号
     * @param name 学生姓名
     * @param age 学生年龄
     * @param mark 学生成绩信息
     */
    void setInfo(String id,String name,String age,Mark mark);
    /**
     * 本方法主要实现返回所有学生信息
     */
    void display();


}
