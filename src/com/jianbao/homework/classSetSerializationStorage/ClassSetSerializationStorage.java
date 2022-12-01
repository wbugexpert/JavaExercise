package com.jianbao.homework.classSetSerializationStorage;

import com.jianbao.homework.classSetSerializationStorage.factory.Factory;
import com.jianbao.homework.classSetSerializationStorage.service.DataService;
import com.jianbao.homework.classSetSerializationStorage.vo.Privilege;
import com.jianbao.homework.classSetSerializationStorage.vo.Role;
import com.jianbao.homework.classSetSerializationStorage.vo.User;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 利用类集实现以下数据表结构的映射转换，并将转换后的对象信息保存在文件之中，要求实现如下查询功能：
 *
 * 可以根据一个用户找到该用户对应的所有角色,以及每一个角色对应的所有权限信息；
 * 可以根据一个角色找到该角色下的所有权限，以及拥有此角色的全部用户信息；
 * 可以根据一个权限找到具备此权限的所有用户信息。
 * 【图片见课本P201】
 */
public class ClassSetSerializationStorage {
    private static DataService dataService;
    static {
        dataService= Factory.getDataServiceInstance();
        try{
            dataService.store(init());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args)throws Exception{
        System.out.println("---------【1】根据用户查找对应信息-------------------------");
        dataService.getInstanceByUser();
        System.out.println("---------【2】根据角色查找对应信息-------------------------");
        dataService.getInstanceByRole();
        System.out.println("---------【3】根据权限查找对应信息-------------------------");
        dataService.getInstanceByPrivilege();
    }
    public static Map<String, Object>init(){
        Map<String,Object> map=new HashMap<>();
        User userA = new User("jianbao-1","尖宝1");
        User userB = new User("jianbao-2","尖宝2");
        User userC = new User("jianbao-3","尖宝3");
        Role roleA=new Role("user","用户管理");
        Role roleB=new Role("backup","系统备份");
        Privilege privilegeA=new Privilege("user:add","增加用户");
        Privilege privilegeB=new Privilege("user:edit","修改用户");
        Privilege privilegeC=new Privilege("user:delete","删除用户");
        Privilege privilegeD=new Privilege("user:select","查询用户");
        Privilege privilegeE=new Privilege("backup:all","全量备份");
        Privilege privilegeF=new Privilege("backup:inc","增量备份");
        Privilege privilegeG=new Privilege("backup:recover","备份恢复");

        roleA.getPrivileges().add(privilegeA) ;
        roleA.getPrivileges().add(privilegeB) ;
        roleA.getPrivileges().add(privilegeC) ;
        roleA.getPrivileges().add(privilegeD) ;
        roleB.getPrivileges().add(privilegeE) ;
        roleB.getPrivileges().add(privilegeF) ;
        roleB.getPrivileges().add(privilegeG) ;
        privilegeA.setRole(roleA);
        privilegeB.setRole(roleA);
        privilegeC.setRole(roleA);
        privilegeD.setRole(roleA);
        privilegeE.setRole(roleB);
        privilegeF.setRole(roleB);
        privilegeG.setRole(roleB);
        userA.getRoles().add(roleA) ;
        userA.getRoles().add(roleB) ;
        userB.getRoles().add(roleA) ;
        userC.getRoles().add(roleB) ;
        roleA.getUsers().add(userA) ;
        roleA.getUsers().add(userB) ;
        roleB.getUsers().add(userA) ;
        roleB.getUsers().add(userC) ;
        map.put(userA.getUid(), userA);
        map.put(userB.getUid(), userB);
        map.put(userC.getUid(), userC);
        map.put(roleA.getRid(), roleA);
        map.put(roleB.getRid(), roleB);
        map.put(privilegeA.getPid(), privilegeA);
        map.put(privilegeB.getPid(), privilegeB);
        map.put(privilegeC.getPid(), privilegeC);
        map.put(privilegeD.getPid(), privilegeD);
        map.put(privilegeE.getPid(), privilegeE);
        map.put(privilegeF.getPid(), privilegeF);
        map.put(privilegeG.getPid(), privilegeG);
        return map;
    }

}
