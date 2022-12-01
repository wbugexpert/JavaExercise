package com.jianbao.homework.dynamicDDL.util;

import com.jianbao.homework.dynamicDDL.po.User;

import java.sql.JDBCType;
import java.util.Map;

public class CreateUtil {
    private CreateUtil(){}
    public static String createDDL(Class<?> clazz) throws Exception{
        StringBuffer sql = new StringBuffer() ;
        TableBean tableBean = AnnotationParseUtil.handle(clazz);
        if (tableBean.isBeforeDelete()) {   // 在执行之前进行数据表的删除
            sql.append("DROP TABLE IF EXISTS " + tableBean.getName() + "; \n") ;
        }
        sql.append("CREATE TABLE " + tableBean.getName() + "( \n") ;
        String primary = null ; // 保存主键信息
        for (Map.Entry<String, TableBean.ColumnBean> entry : tableBean.getColumns().entrySet()) {
            if (entry.getValue().getLength() == -1) {
                sql.append("    " + entry.getKey() + "    " + JDBCType.valueOf(entry.getValue().getType()) + ", \n");
            } else {
                sql.append("    " + entry.getKey() + "    " + JDBCType.valueOf(entry.getValue().getType()) + "("+entry.getValue().getLength()+") ,\n");
            }
            if (entry.getValue().isPrimary()) {
                primary = "    CONSTRAINT " + entry.getValue().getPrimaryConstraintName() + "PRIMARY KEY (" + entry.getKey() + ")\n";
            }
        }
        if (primary != null) {
            sql.append(primary).append(") engine=INNODB ;") ;
        }
        return sql.toString() ;
    }
}
