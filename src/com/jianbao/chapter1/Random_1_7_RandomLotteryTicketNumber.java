package com.jianbao.chapter1;
import java.util.Arrays;
import java.util.Random;

/**
 * 本类主要实现36选7彩票的自动选号
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
public class Random_1_7_RandomLotteryTicketNumber{
    public static void  main(String[] args)throws Exception{
        LotteryTicket lotteryTicket=new LotteryTicket();
        lotteryTicket.create();
        for(int tmp:lotteryTicket.getData()){
            System.out.print(tmp+"、");
        }
    }
}
