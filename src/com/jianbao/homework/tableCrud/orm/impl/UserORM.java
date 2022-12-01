package com.jianbao.homework.tableCrud.orm.impl;

import com.jianbao.homework.classSetSerializationStorage.vo.User;
import com.jianbao.homework.tableCrud.orm.BaseORM;
import com.jianbao.homework.tableCrud.orm.abs.AbstractORM;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserORM extends AbstractORM<UserORM> implements BaseORM<UserORM> {
    public UserORM(){
        super(false);
    }
    public UserORM(String uid, String name, String note) {
        super(true);
        this.uid = uid;
        this.name = name;
        this.note = note;
    }

    @Override
    public String getAddSQL() {
        return "insert into user(uid,name,note) values(?,?,?)";
    }

    @Override
    public String getUpdateSQL() {
        return "update user set name=?,note=? where uid=?";
    }

    @Override
    public String getRemoveSQL() {
        return "delete from user where uid=?";
    }

    @Override
    public String getGetSQL() {
        return "select uid,name,note from user where uid=?";
    }

    @Override
    public String getFindSQL() {
        return "select uid,name,note from user";
    }

    @Override
    public void setAddPreparedStatement(PreparedStatement ptmt) throws SQLException {
        ptmt.setObject(1,this.uid);
        ptmt.setObject(2,this.name);
        ptmt.setObject(3,this.note);
    }

    @Override
    public void setUpdatePreparedStatement(PreparedStatement ptmt) throws SQLException {
        ptmt.setObject(1,this.name);
        ptmt.setObject(2,this.note);
        ptmt.setObject(3,this.uid);
    }

    @Override
    public void setRemovePreparedStatement(PreparedStatement ptmt) throws SQLException {
        ptmt.setObject(1,this.uid);
    }

    @Override
    public void setGetPreparedStatement(PreparedStatement ptmt) throws SQLException {
        ptmt.setObject(1,this.uid);
    }

    @Override
    public void setFindPreparedStatement(PreparedStatement ptmt) throws SQLException {

    }

    @Override
    public Object handleGetResultSet(ResultSet rs) throws SQLException {
        UserORM user=null;
        if(rs.next()){
            user=new UserORM();
            user.uid=rs.getString(1);
            user.name=rs.getString(2);
            user.note=rs.getString(3);
        }
        return user;
    }

    @Override
    public Object handleListResultSet(ResultSet rs) throws SQLException {
        List<UserORM> all =new ArrayList<>();
        while (rs.next()){
            UserORM user=new UserORM();
            user.uid=rs.getString(1);
            user.name=rs.getString(2);
            user.note=rs.getString(3);
            all.add(user);
        }
        return all;
    }

    @Override
    public String toString() {
        return "【用户表】" +"uid=" + uid + ", name=" + name + ", note=" + note ;
    }

    private String uid;
    private String name;
    private String note;
}
