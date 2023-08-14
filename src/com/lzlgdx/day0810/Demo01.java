package com.lzlgdx.day0810;
//继承中的构造方法
public class Demo01 {
    public static void main(String[] args) {

        Foo foo = new Foo(5);

        System.out.println("--------------------------------");
        Goo goo = new Goo();
    }
}

//外部类
//父类
class Foo{
    public int value;//成员变量
//    无参参构造方法
//    public Foo() {
//        System.out.println("Foo无参构造");
//    }

//    有参构造
    public Foo(int value) {
        this.value = value;
        System.out.println("Foo的有参构造");
    }
}

//子类
class Goo extends Foo {
    //    成员变量
    public int num;

    //    添加一个无参构造方法
    public Goo() {
        super(5);//默认调用，一定要写在代码第一行，否则有错。
        System.out.println("Goo无参构造");
    }
}