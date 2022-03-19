package com.xzl.principles.demo;

public class Client {
    public static void main(String[] args) {
        //创建搜狗输入法对象
        JuheSkin input=new JuheSkin();
        //创建皮肤对象
        Defalut skin=new Defalut();
        XzlSkin skin2=new XzlSkin();
        //将皮肤设置到输入法中
        input.setSkin(skin);
        //显示皮肤
        input.display();
        //将皮肤设置到输入法中
        input.setSkin(skin2);
        //显示皮肤
        input.display();

    }
}
