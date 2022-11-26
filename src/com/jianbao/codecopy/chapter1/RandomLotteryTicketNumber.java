package com.jianbao.codecopy.chapter1;
import java.util.Arrays;
import java.util.Random;

/**
 * 有一种“36选7”的彩票，购买者可以在36个数字中自行选择，也可以直接将数字生成交由机器完成，实现这一生成机制。
 */
class LotteryTicket {
    private int index;
    private int[] data;
    private Random random=new Random();
    public LotteryTicket(){
        this.data=new int[7];
    }
    public void create(){
        while(this.index<this.data.length){
            int code=this.random.nextInt(37);
            if(this.isExist(code)){
                this.data[this.index++]=code;
            }
        }
    }
    private boolean isExist(int code){
        if(code==0)return false;
        for(int tmp : this.data){
            if(tmp==code){
                return false;
            }
        }
        return true;
    }
    public int[] getData(){
        Arrays.sort(this.data);
        return this.data;
    }
}
public class RandomLotteryTicketNumber {
    public static void  main(String[] args)throws Exception{
        LotteryTicket lotteryTicket=new LotteryTicket();
        lotteryTicket.create();
        for(int tmp:lotteryTicket.getData()){
            System.out.print(tmp+"、");
        }
    }
}
