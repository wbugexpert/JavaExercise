package com.jianbao.homework.userLogin.impl;

import com.jianbao.homework.userLogin.UserLogin;

public class UserLoginImpl implements UserLogin {
    private String uname;
    private String upassword;
    public UserLoginImpl(String uname,String upassword){
        this.uname=uname;
        this.upassword=upassword;
    }
    @Override
    public boolean login(){
        return "jianbao".equals(this.uname)&&"jianbao".equals(this.upassword);
    }
}
