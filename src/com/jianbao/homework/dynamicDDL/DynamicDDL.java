package com.jianbao.homework.dynamicDDL;

import com.jianbao.homework.dynamicDDL.po.User;
import com.jianbao.homework.dynamicDDL.util.AnnotationParseUtil;
import com.jianbao.homework.dynamicDDL.util.CreateUtil;

/**
 * 定义一任意的简单Java类，并可以基于此简单的Java类的结构生成数据库创建脚本。
 */
public class DynamicDDL {
    public static void main(String[] args)throws Exception{
        String sql=CreateUtil.createDDL(User.class);
        System.out.printf("【"+sql+"】\n");
        new DatabaseOperation().execute(sql);
    }
}
