package com.lzlgdx.day0811;
//fianl关键字的使用
public class FinalDemo {
}

/**
 * fianl修饰变量
 * 1.修饰成员变量；
 *   1.1声明的同时进行初始化（变量a）
 *   1.2先声明变量，在构造方法中完成初始化
 * 2.修饰局部变量；在一个方法中定义的变量，使用前声明  有两种方式进行初始化
 *   2.1在使用之前初始化即可
 *  final修饰的无论是成员变量，还是局部变量，初始化之后都不可以再次改变。
 *
 */
class Coo{
    public  final int a=1;
    public final int b;
    public int c;
    public Coo(){
        b=10;
    }
    public void show(){
        final int age;
        age=10;
        System.out.println(age);
//        不可以修改final修饰的变量
    }
//    a=100;
}
