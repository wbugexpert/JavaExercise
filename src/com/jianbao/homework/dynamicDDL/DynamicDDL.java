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
        String[] sql_list=sql.split(";");
        for(String s : sql_list) {
            //System.out.println(s);
            new DatabaseOperation().execute(s);
        }
    }
}
/*
这里有个问题，PreparedStatement似乎不能同时执行两条语句，当我的User类deleteBefore参数设置为true的时候，多生成了一条删除表的语句，就会报语法错误。查询了很多资料，没找到解决方案，只好在传入的时候将字符串分割成单个语句。
 */
