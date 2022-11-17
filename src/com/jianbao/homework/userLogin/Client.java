package com.jianbao.homework.userLogin;

import com.jianbao.homework.userLogin.main.LoginMain;

import java.io.IOException;

/**
 * 完成系统登录程序，可以通过初始化参数方式配置用户名和密码。
 * 如果用户没有输入用户名和密码，则提示输入用户名和密码；
 * 如果用户输入了用户名但是没有输入密码，则提示用户输入密码。
 * 判断用户名是否为jianbao，密码是否为jianbao，
 * 如是，则提示登陆成功；如不是，显示登陆失败信息。
 * 用户再次输入用户名和密码，连续3次输入错误后自动退出。
 */
public class Client {
    public static void main(String args[]) throws Exception {
        new LoginMain(args);
    }
}
