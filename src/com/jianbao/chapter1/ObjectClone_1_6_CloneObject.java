package com.jianbao.chapter1;

/**
 * 本类主要实现对象克隆
 */

class Emp implements Cloneable{
    private String ename;
    private String job;
    public Emp(String ename,String job){
        this.ename=ename;
        this.job=job;
    }
    @Override
    public String toString(){
        return "【Emp - "+super.toString()+"】姓名： "+this.ename+"  职位："+this.job;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class ObjectClone_1_6_CloneObject{
    public static void main(String[] args) throws Exception{
        Emp empA=new Emp("尖宝","学生");
        Emp empB=(Emp)empA.clone();
        System.out.println(empA);
        System.out.println(empB);
    }
}
