package com.xzl.chuangjianzhe.Singleton;

import java.io.*;

//破坏单例模式
//序列化方式，将对象以序列化方式先输出，然后读取序列化文件生成对象，此时可生成多个且都是不一样的
public class Destory {
    public static void main(String[] args) throws Exception {
//writeObject2File();
readObjectFromFile();
        readObjectFromFile();


    }

    //从文件中读取数据
    public static void readObjectFromFile() throws Exception{
        //创建对象输入流对象
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("/Users/enlighten/Documents/test.txt"));
       //读取对象
        Singleton5 instance=(Singleton5) in.readObject();
        System.out.println(instance);
        in.close();
    }

    //从文件中写数据(对象)
    public static void writeObject2File() throws Exception{
        //1.获取singletong对象
        Singleton5 instance=Singleton5.getInstance();
        //创建对象输出流对象
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("/Users/enlighten/Documents/test.txt"));
       //3.写对象
      oos.writeObject(instance);
      //关闭输出流
        oos.close();

    }
}
