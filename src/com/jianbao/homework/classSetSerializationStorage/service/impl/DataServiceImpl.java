package com.jianbao.homework.classSetSerializationStorage.service.impl;

import com.jianbao.homework.classSetSerializationStorage.service.DataService;
import com.jianbao.homework.classSetSerializationStorage.vo.Privilege;
import com.jianbao.homework.classSetSerializationStorage.vo.Role;
import com.jianbao.homework.classSetSerializationStorage.vo.User;

import java.io.*;
import java.util.Map;

public class DataServiceImpl implements DataService {
    @Override
    public void store(Object object) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(OBJECT_FILE));
        oos.writeObject(object);
        oos.close();
    }

    @Override
    public Object load() throws IOException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(OBJECT_FILE));
        try{
            Object obj=ois.readObject();
            return obj;
        }catch (ClassNotFoundException e){
            return null;
        }finally {
            ois.close();
        }
    }

    @Override
    public void getInstanceByUser() throws Exception {
        Map<String,Object> map=(Map<String, Object>) this.load();
        User user =(User)map.get("jianbao-1");
        System.out.println(user);
        for(Role role : user.getRoles()){
            System.out.println("\t|- "+role);
            for(Privilege pri : role.getPrivileges()){
                System.out.println("\t\t|- "+pri);
            }
        }

    }

    @Override
    public void getInstanceByRole() throws Exception {
        Map<String,Object> map=(Map<String, Object>) this.load();
        Role role=(Role) map.get("user");
        System.out.println(role);
        for( User user :role.getUsers()){
            System.out.println("\t|- "+user);
        }
        for(Privilege pri : role.getPrivileges()){
            System.out.println("\t|- "+pri);
        }

    }

    @Override
    public void getInstanceByPrivilege() throws Exception {
        Map<String,Object> map=(Map<String, Object>) this.load();
        Privilege privilege=(Privilege) map.get("user:edit");
        System.out.println(privilege);
        System.out.println("\t|- "+privilege.getRole());
        for(User user:privilege.getRole().getUsers()){
            System.out.println("\t\t|- "+user);
        }
    }
}
