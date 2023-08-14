package com.lzlgdx.day0811;
//static块
public class StaticDemo1 {
    public static void main(String[] args) {
        //实例化Boo类
        //Boo.java-->Boo.class 加载  new Boo
        Boo boo = new Boo();
        Boo boo1 = new Boo();
        System.out.println(Joo.MAX_AGE);
        System.out.println(Joo.AGE);


        double pi = Math.PI;

    }
}
class Boo{
    //static块
    static {
        //在类加载期间，只执行一次
        System.out.println("load。。。boo.class");
    }
    //无参构造
    public Boo(){
        System.out.println("无参构造。。。");
    }
}


/**
 * final修饰方法：final修饰的方法不可以被重写
 */
class Doo{//父类
    public void show(){

    }


    public final void study(){

        System.out.println("study");

    }
}

class Eoo extends Doo{//子类
    //重写show方法


    @Override
    public void show() {
        super.show();
    }
}


 final class Foo{//该类不能被继承
     }
//class Goo extends Foo{
//
//}

class Hoo{}
final class Ioo extends Hoo{

}
//Ioo不能做父类但可以做子类

/**
 * static final修饰变量--常量
 */
class Joo{
    public static final int AGE=100;
    public static final int MAX_AGE=90;
    public Joo() {
//        AGE=1000;
//        常量不可以在修改
    }
}