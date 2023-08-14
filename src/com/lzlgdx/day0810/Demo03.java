package com.lzlgdx.day0810;
//super关键字的语法
public class Demo03 {
    public static void main(String[] args) {
//实例化Doo类
        Doo doo = new Doo();


        doo.eat(6);
        doo.study();

    }
}


class Coo{//父类
//    成员变量
    public int a;
//    构造方法
    public Coo(){
        System.out.println("父。。。。无参构造");
    }
    public Coo(int a){
        this.a = a;
        System.out.println("父类。。。有参构造");
    }

//    成员方法
    public void study(){
        System.out.println("父类。。。学习。。。");
    }
}


class Doo extends Coo{//子类
    public int b;//子类的成员变量
//    构造方法
    public Doo(){
        super(3);
//        System.out.println(super.a = 3);
        System.out.println("子类。。。无参构造");
    }

//    成员方法
    public void eat(int a) {
        System.out.println(a);
        System.out.println("子类。。。。吃。。。");
    }
    @Override
    public void study() {
        super.study();
    }
}