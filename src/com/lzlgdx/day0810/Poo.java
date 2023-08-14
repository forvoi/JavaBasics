package com.lzlgdx.day0810;
//访问修饰符
 class Demo {

    public static void main(String[] args) {
        Poo poo = new Poo();
        poo.a=10;
        poo.b=10;
        poo.c=10;
//        poo.d=10;//编译错误
    }
}


public class Poo{
    public int  a;
    protected int b;
    int c;
    private int d;
    public void a(int a){
        a=10;
        b=10;
        c=10;
        d=10;//编译错误，子类不调用父类的private方法
    }
}


class Qoo extends Poo{
    public void a(int a){
        a=10;
        b=10;
        c=10;
//        d=10;//编译错误，子类不调用父类的private方法
    }
}

class Woo{

    public void Woo(){
        Poo poo = new Poo();
        poo.a=10;
        poo.b=10;
        poo.c=10;
//        poo.d=10;//编译错误，同类中不能访问私有
    }

}