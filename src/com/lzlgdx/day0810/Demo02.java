package com.lzlgdx.day0810;

//父类的引用指向子类的对象
public class Demo02 {

    public static void main(String[] args) {

//        情况1：实例化的是父类对象，声明的类型也是父类的对象类型
//        Aoo aoo=new Aoo();
//        aoo.a=3;//aoo引用可以访问Aoo类中的成员变量
//        aoo.say();//aoo引用吗可以访问Aoo中的成员方法
//        aoo.b;//编译错误


//        情况2：实例化子类对象，声明的类型也是子类的对象类型
        Sub sub = new Sub();
////        子类可以引用访问父类的成员变量和方法
        sub.b=3;
        sub.show();
//
        sub.a=4;
        sub.say();

//        情况3：实例化子类对象，声明的类型是父类对象
//        向上造型


        Aoo sub1 = new Sub();
//        向上造型后，sub1可以引用访问父类的成员变量
        sub1.a=1;
        sub1.say();

//        但是可以访问子类重写父类的方法
//        sbu1.b=2;//编译错误
//        sub1.show();//编译错误


    }
}

class Aoo {//父类
    public int a;//成员变量

    public Animal getAnimal(){
        return null;
    }

    public double getMoney(double money){
        return 3.14;
    }
    //    成员方法
    public void say() {
        System.out.println("父类Aoo..say...");
    }
}


class Sub extends Aoo {//子类
    public int b;//成员变量

    public double getMoney(double money){
        return 3.145678;
    }

    @Override
    public Cat getAnimal() {
        return null;
    }

    //成员方法
    public void show() {
        System.out.println("子类Sub...show...");
    }
    @Override
    public void say(){
        System.out.println("重写了父类的say方法");
    }
}


//父类 animal
class Animal{

}

//子类cat
class Cat extends Animal{

}
class Dog{

}
