package com.jianbao.codecopy.chapter1;

/**
 * 实现字符串到Integer的安全转换
 */
public class SafeTransformString2Int {
    public static void main(String[] args)throws Exception{
        String str="98899991";
        String regex="\\d+";
        if(str.matches(regex)){
            System.out.println("【字符串转数字】"+Integer.parseInt(str));
        }else {
            System.out.println("【ERROR】转换失败！");
        }
    }
}
