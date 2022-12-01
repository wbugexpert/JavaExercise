package com.jianbao.homework.classSetSerializationStorage.service;

import java.io.File;
import java.io.IOException;

public interface DataService {
    public static final File OBJECT_FILE=new File("./src/com/jianbao/homework/classSetSerializationStorage/resources/object.service");
    public void store(Object object) throws IOException;
    public Object load() throws IOException;
    public void getInstanceByUser() throws Exception;
    public void getInstanceByRole() throws Exception;
    public void getInstanceByPrivilege() throws Exception;
}
