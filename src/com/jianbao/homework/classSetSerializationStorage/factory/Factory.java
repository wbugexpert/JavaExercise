package com.jianbao.homework.classSetSerializationStorage.factory;

import com.jianbao.homework.classSetSerializationStorage.service.DataService;
import com.jianbao.homework.classSetSerializationStorage.service.impl.DataServiceImpl;

public class Factory {
    private Factory(){

    }
    public static DataService getDataServiceInstance(){
        return new DataServiceImpl();
    }
}
