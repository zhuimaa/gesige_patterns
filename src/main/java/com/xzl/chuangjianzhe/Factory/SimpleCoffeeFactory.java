package com.xzl.chuangjianzhe.Factory;
//简单咖啡工厂类
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String value){
        Coffee coffee=null;
         if("american"==value){
             coffee=new AmericanCoffee();
         }else if("latte"==value){
             coffee=new LatteCoffee();
         }else{
             throw new RuntimeException("没有所点咖啡");
         }
         return coffee;
        }

}
