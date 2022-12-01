package com.jianbao.homework.dynamicDDL.po;

import com.jianbao.homework.dynamicDDL.annotation.Column;
import com.jianbao.homework.dynamicDDL.annotation.Primary;
import com.jianbao.homework.dynamicDDL.annotation.Table;
import java.sql.*;

@Table(name ="user",deleteBefore=true)
public class User {
    @Column(name="uid",type=Types.VARCHAR,length = 30)
    @Primary
    private String uid;
    @Column(name="name",type = Types.VARCHAR,length = 50)
    private String name;
    @Column(name="age",type=Types.INTEGER)
    private Integer age;
    @Column(name="salary",type=Types.DOUBLE)
    private Double salary;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
