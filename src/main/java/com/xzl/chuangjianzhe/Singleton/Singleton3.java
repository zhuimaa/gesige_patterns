package com.xzl.chuangjianzhe.Singleton;
//线程不安全懒汉式
//加大粒度锁
public class Singleton3 {
    private Singleton3(){}
    private static Singleton3 instance;

    public synchronized  static Singleton3 getInstance(){
        if(instance==null){
        instance=new Singleton3();
        }
        return instance;
    }
}
