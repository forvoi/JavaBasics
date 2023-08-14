package com.lzlgdx.day0811;
//static关键字修饰成员变量
//static关键字修饰方法-->静态方法
public class StaticDemo {
    public static void main(String[] args) {
        //实例化Aoo
        Aoo a1 = new Aoo();
        a1.show();
        Aoo a2 = new Aoo();
        a2.show();

        //调用成员变量和静态变量
        System.out.println("a="+Aoo.b);//建议
        System.out.println(a1.b);//不建议
        System.out.println(a2.b);//不建议
       // System.out.println(Aoo.a);//编译错误
        System.out.println(a1.a);
        System.out.println(a2.a);
        Aoo.study();
        Aoo.test1();
    }
}

class Aoo{
    public int a;//成员变量
    public static int b;//静态变量
    public Aoo() {
        a++;
        b++;
    }
    public void show(){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void test1(){

    }
    public static void study(){
//         静态方法不能访问非静态成员变量
//        a=10;
//         静态方法可以访问静态变量
        b = 20;
        System.out.println(b);
        int b1 = Aoo.b;
        test1();
    }
}
