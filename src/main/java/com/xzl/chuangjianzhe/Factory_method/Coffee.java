package com.xzl.chuangjianzhe.Factory_method;
//抽象咖啡类
public abstract class Coffee {
    public abstract  String getName();

     public void addsugar(){
         System.out.println("加糖");
     }
     public void addMilk(){
         System.out.println("加奶");
     }

}
