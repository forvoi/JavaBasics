package com.lzlgdx.day0811;
//接口语法
public class InterfaceDemo {
    public static void main(String[] args) {

        Koo koo = new Koo();
        koo.a();
        koo.b();
        Inter2 t2 = new Koo();//向上造型
        t2.a();
        t2.b();
    }
}



//定义一个接口-演示接口的基本语法
interface Inter1{
    static final int NUM=10;

    public abstract void show();
    //接口中全是抽象方法，全是常量
    //在接口中修饰常量的public static final可以省略
    int AGE=30;
    double PI=3.1415926535;
    //在接口中修饰方法的public abstract可以省略
    void test();

    int getAge();
    //错误的写法
//    int A;没有初始化
//    void test1(){}抽象方法，不能带方法体


}

//演示接口被实现的句法演示
interface Inter2{
    void a();//省略了public abstract
    public abstract void b();
}
//类  实现  接口
class Koo implements Inter2{
    @Override
    public void a() {
        System.out.println("Koo....a......");
    }

    @Override
    public void b() {

        System.out.println("Koo....b......");
    }
}


//演示继承类实现接口的语法
interface Inter3{
    void a();

}
interface Inter4{
    void b();
}

abstract class Loo{
//    void c();编译错误
    public abstract void c();
}

//让Moo继承Loo，实现inter3和inter4
class Moo extends Loo implements Inter3,Inter4{
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }
}


//接口与接口之间的继承演示
interface Inter5{
    void a();
}

interface Inter6 extends Inter5,Inter7{
    void b();
}
//class Noo implements Inter5{
//    @Override
//    public void a() {
//
//    }
//}
interface Inter7{}
class Noo implements Inter6{
    public Noo() {
        super();
    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}