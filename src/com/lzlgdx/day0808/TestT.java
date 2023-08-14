package com.lzlgdx.day0808;

import com.lzlgdx.day0811.O;
import com.lzlgdx.day0811.S;
import com.lzlgdx.day0811.T;

//启动测试T
public class TestT {
    public static void main(String[] args) {
//        调用无参构造
        T t = new T();
        t.printInfo();
        System.out.println("--------------------------------");
//        调用带参构造
        T t1 = new T(2, 4);
        t1.printInfo();

        System.out.println("下落一次");
        System.out.println("--------------------------------");
        t1.drop();
        t1.printInfo();

        System.out.println("下落6次");
        System.out.println("--------------------------------");
        t1.drop(6);
        t1.printInfo();
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        O o1 = new O(1,1);

        o1.printInfo();
        System.out.println("下落一次");
        System.out.println("--------------------------------");
        o1.drop();
        o1.printInfo();
        System.out.println("下落6次");
        System.out.println("--------------------------------");
        o1.drop(6);
        o1.printInfo();

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        S s1 = new S(1,1);

        s1.printInfo();
        System.out.println("下落一次");
        System.out.println("--------------------------------");
        s1.drop();
        s1.printInfo();
        System.out.println("下落6次");
        System.out.println("--------------------------------");
        s1.drop(6);
        s1.printInfo();
    }
}
