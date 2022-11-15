package com.jianbao.chapter1;

/**
 * 本类主要实现模拟自动释放网络资源
 */

interface IMessage extends AutoCloseable{
    public void send(String msg);
}

class NetMessage implements IMessage{
    public NetMessage(){
        System.out.println("【连接】连接远程服务器，创建消息的发送通道...");
    }
    @Override
    public void send(String msg){
        System.out.println("【发送】"+msg);
    }
    @Override
    public void close(){
        System.out.println("【关闭】网络消息发送完毕，断开服务器连接...");
    }
}
public class AutoCloseableInterface1_2_TestDemo {
    public static void main(String[] args)throws Exception{
        //这种自动close()的调用必须放在try..catch结构中
        try(NetMessage message=new NetMessage()){
            message.send("托管平台：www.github.com");
        }catch (Exception e){

        }
    }
}

