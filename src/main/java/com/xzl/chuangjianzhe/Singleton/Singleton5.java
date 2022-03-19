package com.xzl.chuangjianzhe.Singleton;

import java.io.Serializable;

//静态内部类方式实现懒汉式
//静态内部类单例模式是实例由内部类创建，JVM在加载外部类的过程中是不会加载静态内部类的。
//只有内部类的属性，方法被调用时才会加载静态内部类，并初始化其静态属性，属性被static修饰只会实例化一次，并且严格保证实例化顺序
public class Singleton5 implements Serializable {
    private Singleton5() {}
  //静态内部类
    private static class SingletonHolder{
        //内部类中声明并初始化外部类对象
      private static final Singleton5 INSTANCE=new Singleton5();
  }
//提供公共访问方式
    public static Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
