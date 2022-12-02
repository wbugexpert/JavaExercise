package com.jianbao.experiment.e1.phoneBook;

import java.util.Scanner;

public class service {
    private Scanner input = new Scanner (System.in);
    PhoneBookMap phoneBook=new PhoneBookMap();
    public service(){
        select();
    }
    public void add() {
        System.out.printf("请输入姓名：\n");
        String name=input.nextLine();
        System.out.printf("请输入电话号码：\n");
        String tel=input.nextLine();
        phoneBook.add(name,tel);
    }
    public void remove() {
        System.out.printf("请输入姓名：\n");
        String name=input.nextLine();
        phoneBook.remove(name);
    }
    public void find() {
        System.out.printf("请输入姓名：\n");
        String name=input.nextLine();
        phoneBook.find(name);
    }
    public void display() {
        phoneBook.display();
    }
    public void select() {
        System.out.println("------------------------菜单栏----------------------");
        System.out.println("-------------------【1】增加联系人信息------------------");
        System.out.println("-------------------【2】删除联系人信息------------------");
        System.out.println("-------------------【3】查看联系人信息------------------");
        System.out.println("-------------------【4】显示所有联系人------------------");
        System.out.println("-------------------【5】退出程序---------------------");
        int op=input.nextInt();
        input.nextLine();
        switch (op){
            case 1:
                add();
                break;
            case 2:
                remove();
                break;
            case 3:
                find();
                break;
            case 4:
                display();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("无效指令，重新输入！");
        }
        select();
    }
}
