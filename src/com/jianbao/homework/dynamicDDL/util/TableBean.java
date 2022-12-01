package com.jianbao.homework.dynamicDDL.util;

import com.jianbao.homework.dynamicDDL.annotation.Column;

import java.util.LinkedHashMap;
import java.util.Map;

public class TableBean {
    private String name;//表名称
    private boolean beforeDelete;//是否先删除后创建
    private Map<String,ColumnBean>columns=new LinkedHashMap<>();
    public static class ColumnBean{
        private String name;//列名称
        private int type;//数据类型
        private int length;//长度
        private boolean primary;//是否为主键
        private String primaryConstraintName;//约束名称
        public ColumnBean(String name,int type,int length){
            this.name=name;
            this.type=type;
            this.length=length;
        }
        public String getName() {
            return name;
        }
        public int getType() {
            return type;
        }
        public int getLength() {
            return length;
        }
        public boolean isPrimary() {
            return primary;
        }
        public void setPrimary(boolean primary) {
            this.primary = primary;
        }

        public String getPrimaryConstraintName() {
            return primaryConstraintName;
        }

        public void setPrimaryConstraintName(String primaryConstraintName) {
            this.primaryConstraintName = primaryConstraintName;
        }
    }
    public TableBean(){}
    public TableBean(String name,boolean beforeDelete){
        this.name=name;
        this.beforeDelete=beforeDelete;
    }

    public String getName() {
        return name;
    }

    public boolean isBeforeDelete() {
        return beforeDelete;
    }

    public Map<String, ColumnBean> getColumns() {
        return columns;
    }

    public void addColumn(ColumnBean columnBean){
        this.columns.put(columnBean.name, columnBean);
    }
}
