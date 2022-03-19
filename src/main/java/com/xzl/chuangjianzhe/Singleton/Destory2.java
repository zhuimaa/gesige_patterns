package com.xzl.chuangjianzhe.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//反射破坏单例模式
//除了枚举方式都可以破坏
public class Destory2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取singleton字节码对象
        Class clazz=Singleton5.class;
        //获取无参构造方法
        Constructor cons=clazz.getDeclaredConstructor();
        //无参构造是私有的，要设置为true才能访问
        cons.setAccessible(true);
        //创建对象
        Singleton5 ins=(Singleton5) cons.newInstance();
        Singleton5 ins2=(Singleton5) cons.newInstance();
        System.out.println(ins==ins2);//输出false破坏了单例模式

        System.out.println("test");
    }
}
