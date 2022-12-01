package com.jianbao.homework.classSetSerializationStorage.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Role implements Serializable{
    private String rid;
    private String title;
    private List<Privilege> privileges;
    private List<User> users;
    public Role(){
        this(null,null);
    }
    public Role(String rid,String title){
        this.rid=rid;
        this.title=title;
        this.privileges=new ArrayList<>();
        this.users=new ArrayList<>();
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    @Override
    public String toString(){
        return "【角色】角色id= "+ this.rid+"  姓名:"+this.title;
    }
}
