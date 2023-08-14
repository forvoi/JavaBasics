package com.lzlgdx.day0814;

//测试内部类
public class TestInner {
    //创建外部类outer
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();

        //创建内部类
//        Inner inner=new Outer.Inner()
//        Outer.Inner inner = new Outer().new Inner(5);
//        inner.timeInc();
        //创建静态内部类
        Outer.Inner1 n1=new Outer.Inner1();
        n1.method1();
    }
}
