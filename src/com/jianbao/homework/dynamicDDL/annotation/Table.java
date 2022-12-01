package com.jianbao.homework.dynamicDDL.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    public String name();//表名称
    public boolean deleteBefore() default false;//描述是否在每次执行之前进行表的删除
}
