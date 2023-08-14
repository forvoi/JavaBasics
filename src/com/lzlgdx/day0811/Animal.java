package com.lzlgdx.day0811;

//动物-抽象
public  abstract class Animal {
    public void set(){}
    public abstract void shout();
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("喵喵喵。。。。。。");
    }
}
//狗对象
class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("汪汪汪。。。。。。");
    }
    //set不是抽象方法，选择性重写
}
