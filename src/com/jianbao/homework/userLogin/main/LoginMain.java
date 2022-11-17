package com.jianbao.homework.userLogin.main;

import com.jianbao.homework.userLogin.UserLogin;
import com.jianbao.homework.userLogin.exception.MaxTryCountException;
import com.jianbao.homework.userLogin.factory.LoginFactory;
import com.jianbao.homework.userLogin.impl.UserLoginImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LoginMain {
    private String args[];
    private String userName;
    private String userPassword;
    private int count=0;
    private static final BufferedReader KEYBOARD_INPUT = new BufferedReader(new InputStreamReader(System.in)) ;
    public LoginMain(String args[])throws Exception{
        this.args=args;
        while (true){
            if(this.count>=3){
                throw new MaxTryCountException("尝试次数超限，系统退出！");
            }
            this.handle();
            UserLogin userLogin= LoginFactory.getLoginInstance(this.userName,this.userPassword);
            if(userLogin.login()){
                System.out.println("【SUCCESS】欢迎你，尖宝！");
                break;
            } else  {
                System.out.println("【ERROR】登陆失败，用户名和密码不匹配！");
                this.count++;
            }
        }
    }
    public void handle()throws IOException{
        if(this.args.length==0){
            System.out.println("请输入用户名");
            this.userName=KEYBOARD_INPUT.readLine();
            System.out.println("请输入密码");
            this.userPassword=KEYBOARD_INPUT.readLine();
        } else if (this.args.length==1) {
            this.userName=args[0];
            System.out.println("请输入密码");
            this.userPassword=KEYBOARD_INPUT.readLine();
        } else if (this.args.length==2) {
            this.userName=args[0];
            this.userPassword=args[1];
        }
    }
}
