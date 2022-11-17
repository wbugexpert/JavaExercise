package com.jianbao.homework.programInternationalization;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 编写程序，实现国际化程序，通过命令行输入国家的代号，例如，1表示中国，2表示美国。根据输入代号不同调用不同的资源文件来显示信息。
 */
public class ProgramInternationalization {
    public static void main(String[] args)throws Exception {
        Scanner input=new Scanner(System.in);
        Locale loc;
        ResourceBundle resourceBundle;
        int flag= input.nextInt();
        if (flag == 1) {
            System.out.println("选择：语言：简体中文 ， 国家：中国。");
            loc = Locale.CHINA;
        } else if (flag == 2) {
            System.out.println("Select:Language:English , Country:America");
            loc = Locale.US;
        } else {
            System.out.println("输入指令错误，无法识别指定国家地区，已自动选择系统默认地区。");
            loc = Locale.getDefault();
        }
        resourceBundle = ResourceBundle.getBundle("com.jianbao.homework.programInternationalization.resources.Message", loc);
        System.out.println(resourceBundle.getString("welcome.info"));
        System.out.println(resourceBundle.getString("className.info"));
        System.out.println("-------------------------");
        input.close();
    }
}
