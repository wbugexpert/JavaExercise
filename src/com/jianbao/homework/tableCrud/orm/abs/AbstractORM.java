package com.jianbao.homework.tableCrud.orm.abs;

import com.jianbao.homework.tableCrud.orm.BaseORM;
import com.jianbao.homework.tableCrud.orm.DatabaseConnection;

import java.sql.*;
import java.util.List;

public abstract class AbstractORM<T> implements BaseORM<T> {
    public AbstractORM(boolean flag) {
        if(flag){
            this.connection = new DatabaseConnection();
        }
    }

    public boolean add() {
        try{
            PreparedStatement ptmt=this.connection.getConnection().prepareStatement(this.getAddSQL());
            this.setAddPreparedStatement(ptmt);
            return ptmt.executeUpdate()>0;
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try{
                this.connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
    public boolean update() {
        try{
            PreparedStatement ptmt=this.connection.getConnection().prepareStatement(this.getUpdateSQL());
            this.setUpdatePreparedStatement(ptmt);
            return ptmt.executeUpdate()>0;
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try{
                this.connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
    public boolean remove() {
        try{
            PreparedStatement ptmt=this.connection.getConnection().prepareStatement(this.getRemoveSQL());
            this.setRemovePreparedStatement(ptmt);
            return ptmt.executeUpdate()>0;
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try{
                this.connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
    public T get() {
        try{
            PreparedStatement ptmt=this.connection.getConnection().prepareStatement(this.getGetSQL());
            this.setGetPreparedStatement(ptmt);
            ResultSet rs=ptmt.executeQuery();
            return (T)this.handleGetResultSet(rs);
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try{
                this.connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
    public List<T> find() {
        try{
            PreparedStatement ptmt=this.connection.getConnection().prepareStatement(this.getFindSQL());
            this.setFindPreparedStatement(ptmt);
            ResultSet rs=ptmt.executeQuery();
            return (List<T>) this.handleListResultSet(rs);
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try{
                this.connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

    public abstract String getAddSQL();
    public abstract String getUpdateSQL();
    public abstract String getRemoveSQL();
    public abstract String getGetSQL();
    public abstract String getFindSQL();
    public abstract void setAddPreparedStatement(PreparedStatement ptmt) throws SQLException;
    public abstract void setUpdatePreparedStatement(PreparedStatement ptmt) throws SQLException;
    public abstract void setRemovePreparedStatement(PreparedStatement ptmt) throws SQLException;
    public abstract void setGetPreparedStatement(PreparedStatement ptmt) throws SQLException;
    public abstract void setFindPreparedStatement(PreparedStatement ptmt) throws SQLException;
    public abstract Object handleGetResultSet(ResultSet rs)throws SQLException;
    public abstract Object handleListResultSet(ResultSet rs)throws SQLException;
    private DatabaseConnection connection=null;
}
