package com.jianbao.homework.tableCrud;

import com.jianbao.homework.tableCrud.orm.BaseORM;
import com.jianbao.homework.tableCrud.orm.impl.UserORM;

/**
 * 现在假设有图6-35所示的数据表，要求通过代码实现数据表的CURD操作。
 *
 * DROP DATABASE jianbao;
 * CREATE DATABASE jianbao CHARACTER SET UTF8;
 * CREATE TABLE user (
 *     uid    VARCHAR(50),
 *     name   VARCHAR(30),
 *     note   TEXT,
 *     CONSTRIANT pk_uid PRIMARY KEY (uid)
 * ) engine=INNODB;
 * 【图片6-35见课本P230】
 */
public class TableCrud {
    public static void main(String[] args)throws Exception{
        System.out.println(new UserORM("10086","尖宝","jianbao.com").add());
        System.out.println(new UserORM("100860","尖宝尖宝","jianbao.com").add());
        System.out.println(new UserORM("10086",null,null).get());
        System.out.println(new UserORM("10086","尖宝爱你","jianbao.com").update());
        System.out.println(new UserORM("10086",null,null).get());
        System.out.println(new UserORM(null,null,null).find());
        System.out.println(new UserORM("10086",null,null).remove());
    }
}
