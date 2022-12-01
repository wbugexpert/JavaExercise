package com.jianbao.homework.dynamicDDL.util;

import com.jianbao.homework.dynamicDDL.annotation.Column;
import com.jianbao.homework.dynamicDDL.annotation.Primary;
import com.jianbao.homework.dynamicDDL.annotation.Table;
import com.jianbao.homework.dynamicDDL.exception.NoPersistenceException;

import java.lang.reflect.Field;
import java.sql.JDBCType;

public class AnnotationParseUtil {
    private AnnotationParseUtil(){}

    /**
     * 实体类结构解析
     * @param clazz 指定的实体类
     * @throws NoPersistenceException 非持久类异常
     * @return 解析结果
     */
    public static TableBean handle(Class<?> clazz)throws NoPersistenceException{
        Table tableAnnotation=clazz.getAnnotation(Table.class);
        if(tableAnnotation==null){
            throw new NoPersistenceException(clazz.getName()+"非持久类，无法执行！");
        }
        TableBean tableBean=new TableBean(tableAnnotation.name(),tableAnnotation.deleteBefore());
        System.out.println("【1】表名: " + tableAnnotation.name()+" ,是否先删除后创建： "+tableAnnotation.deleteBefore());
        for(Field field:clazz.getDeclaredFields()){
            Column columnAnnotation=field.getAnnotation(Column.class);
            if(columnAnnotation!=null){
                TableBean.ColumnBean columnBean=new TableBean.ColumnBean(columnAnnotation.name(),columnAnnotation.type(),columnAnnotation.length());
                System.out.println("【2】列名： "+ columnAnnotation.name()+" ,类型： "+ JDBCType.valueOf(columnAnnotation.type())+" 长度： "+columnAnnotation.length());
                Primary primaryAnnotation=field.getAnnotation(Primary.class);
                if(primaryAnnotation!=null){
                    columnBean.setPrimary(true);
                    columnBean.setPrimaryConstraintName(primaryAnnotation.name());
                    System.out.println("\t|- 【约束名称】"+primaryAnnotation.name());
                }
                tableBean.addColumn(columnBean);
            }
        }
        return tableBean;
    }
}
