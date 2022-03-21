package com.xzl.chuangjianzhe.Factory_method;



public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory){
        this.factory=factory;
    }
    //点咖啡
    public Coffee orderCoffee() {
Coffee coffee=factory.createCoffee();
coffee.addsugar();
coffee.addMilk();
return coffee;
    }
}
