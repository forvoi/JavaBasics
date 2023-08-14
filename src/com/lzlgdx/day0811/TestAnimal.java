package com.lzlgdx.day0811;

//测试animal
public class TestAnimal {
    public static void main(String[] args) {
        //Animal是抽象类 不能实例化
        //Animal am1=new Animal();
        //创建cat对象
        Cat am2=new Cat(){};
        am2.shout();
        am2.set();
    }

}
