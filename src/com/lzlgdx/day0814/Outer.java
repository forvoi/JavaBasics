package com.lzlgdx.day0814;
//外部类
public class Outer {
    private int time;//私有的成员变量
    //静态变量，final变量，常量

    private  Inner inner;

    private static int a;//私有的静态变量
    //构造方法，成员方法，静态方法，final方法，抽象方法，static代码块

    private static Inner1 inner1;

    public  Outer(){
//        在外部类中无法直接使用内部类的成员变量和方法
//        age=100;
//        InnerInc();
//        调用内部类的成员变量和方法
        inner=new Inner();
        inner.age++;
        inner.timeInc();
    }

    //定义一个方法
    public void show(){
        time++;
        System.out.println("show...."+time);
        a++;//成员变量可以访问静态成员变量
        System.out.println("a=+a");
    }

    public static void show1(){
        //tima++;编译错误
        a++;
    }
//    static{}//类加载之前，构造方法之前
    //成员内部类

    public class Inner{
        public int age;

        private int time;

        //内部类中的方法
        public void timeInc(){
            time++;
            System.out.println("timeInc......."+time);
            System.out.println("timeInc......."+age);
        }

        public Inner(){}

        public Inner( int time){
            this.time=time;
            System.out.println("Inner........"+time);
            show();
        }


    }
//    静态内部类
    public static class Inner1{
        //成员方法
        public void method1(){
            //time++;//静态内部类不能访问非静态成员变量和方法(因为没有static修饰)
            //show();
            a++;
            show1();
            //静态内部类中可以直接访问外部类中的静态变量和静态方法

        }
    }
}
