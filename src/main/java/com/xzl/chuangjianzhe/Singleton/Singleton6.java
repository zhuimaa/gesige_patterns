package com.xzl.chuangjianzhe.Singleton;
//枚举类实现单例模式，是极力推荐的，因为枚举类是线程安全的，且只会加载一次
//而且枚举单例是唯一一种不会被破坏的单例模式。
//属于饿汉式
public enum Singleton6 {
   INSTANCE;
}
