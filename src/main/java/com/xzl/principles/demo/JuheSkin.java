package com.xzl.principles.demo;
//搜狗输入法
public class JuheSkin {
    private AbstaractSkin skin;
    public void setSkin(AbstaractSkin skin){
        this.skin=skin;
    }
    public void display(){
        skin.display();
    }
}
