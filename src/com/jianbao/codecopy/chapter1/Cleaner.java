package com.jianbao.codecopy.chapter1;

/**
 * 本类主要用Cleaner实现对象回收
 */
/**
 * 写到一半发现java.lang.ref.Cleaner这个回收类是JDK9开始引入的，我是JDK8，用不了，抄一下代码。
 */
/*
import java.lang.ref.Cleaner;

class Program implements Runnable{
    public Program(){
        System.out.println("【构造】用心写了一个没什么用的程序。");
    }
    public void exec(){
        System.out.println("【运行】电脑嫌我写的程序太垃圾，我跪在地上求它帮我运行一下，它最后勉强同意了。");
    }
    @Override
    public void run(){
        System.out.println("【析构】电脑跑完了我的程序，迫不及待地回收了所有资源。");
    }
}


class ThreadCleaner implements AutoCloseable{
    private static final Cleaner cleaner= Cleaner.create();
    private Cleaner.Cleanable cleanable;
    public ThreadCleaner(Program program){
        this.cleanable = cleaner.register(this,program);
    }
    @Override
    public void close() throws Exception{
        this.cleanable.clean();
    }

}

public class Cleaner {
    public static void main(String[] args) throws Exception{
        Program program=new Program();
        try(ThreadCleaner bc=new ThreadCleaner(program)){
            program.exec();
        }catch (Exception e){

        }
    }
}
*/
