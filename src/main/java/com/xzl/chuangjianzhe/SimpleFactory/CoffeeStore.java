package com.xzl.chuangjianzhe.SimpleFactory;

public class CoffeeStore {
    public Coffee orderCoffee(String str) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        //调用生产咖啡的方法
        Coffee coffee = factory.createCoffee(str);
        coffee.addsugar();
        coffee.addMilk();
        return coffee;
    }
}
