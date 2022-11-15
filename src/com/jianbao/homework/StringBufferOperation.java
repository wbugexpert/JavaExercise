package com.jianbao.homework;

/**
 * 定义一个StringBuffer类对象，然后通过append()方法向对象中添加26个小写字母。要求每次只添加一个，共添加26次，然后逆序输出，并且可以删除前5个小写字母。
 */
public class StringBufferOperation {
    public static void main(String[] args)throws Exception {
        StringBuffer string=new StringBuffer();
        for(int i=0;i<26;i++)
        {
            string.append((char)('a'+i));
        }
        string.reverse();
        System.out.println(string);
        System.out.println(string.delete(0,5));
    }
}
