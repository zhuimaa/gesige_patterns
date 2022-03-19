package com.xzl.chuangjianzhe.Singleton;
//静态代码块饿汉式
public class Singleton2 {
    private Singleton2() {}

    private static Singleton2 instance;

    //在静态代码块中进行赋值
    static{
        instance=new Singleton2();
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}
