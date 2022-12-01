package com.jianbao.homework.classSetSerializationStorage.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private String uid;
    private String name;
    private List<Role> roles;
    public User(){
        this.roles=new ArrayList<>();
    }
    public User(String uid,String name){
        this.name=name;
        this.uid=uid;
        this.roles=new ArrayList<>();
    }
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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    @Override
    public String toString(){
        return "【用户】用户id= "+ this.uid+"  姓名:"+this.name;
    }
}
