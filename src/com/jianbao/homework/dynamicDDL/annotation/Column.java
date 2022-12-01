package com.jianbao.homework.dynamicDDL.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    public String name();//列名称
    public int type();//列的类型
    public int length()default -1;//长度
}
