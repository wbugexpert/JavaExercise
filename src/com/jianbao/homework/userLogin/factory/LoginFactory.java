package com.jianbao.homework.userLogin.factory;

import com.jianbao.homework.userLogin.UserLogin;
import com.jianbao.homework.userLogin.impl.UserLoginImpl;

public class LoginFactory {
    private LoginFactory(){}
    public static UserLogin getLoginInstance(String uname,String upassword){
        return new UserLoginImpl(uname,upassword);
    }
}
