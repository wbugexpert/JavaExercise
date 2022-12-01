package com.jianbao.homework.classSetSerializationStorage.vo;

import java.io.Serializable;

public class Privilege implements Serializable {
    private String pid;
    private String title;
    private Role role;
    public Privilege(){

    }
    public Privilege(String pid,String title){
        this.pid=pid;
        this.title=title;
    }
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    @Override
    public String toString(){
        return "【权限】权限id= "+ this.pid+"  姓名:"+this.title;
    }
}
