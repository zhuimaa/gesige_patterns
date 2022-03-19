package com.xzl.chuangjianzhe.Singleton;
//双重检查单例模式(volatile解决指令重排)
public class Singleton4 {
    private Singleton4() {}
    private static volatile Singleton4 instance;

    public static Singleton4 getInstance(){
        //第一次判断
        if(instance==null){
            synchronized (Singleton4.class){
                if(instance==null){
                    instance=new Singleton4();
                }
            }
        }
        return instance;
    }

}
