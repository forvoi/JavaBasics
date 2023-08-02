package com.lzlgdx.day0802;
//逻辑运算符的演示
public class Demo01 {
    public static void main(String[] args) {
        //逻辑与运算符 &&
        int score = 70;
        boolean result = score > 60 && score < 90;
        System.out.println(result);
        //逻辑或运算符 ||
        boolean flag=true;

        //逻辑非 ！
        int age=30;
        boolean f1=age>18;
        System.out.println(f1);
        System.out.println(!f1);
        System.out.println(!(age>18));

        //短路现象
        int i=100,j=200;
        boolean b1=(i>j) && (i++>100);//条件1为false，条件2不执行
        System.out.println(b1);
        System.out.println(i);
        boolean b2=(i<j) && (i++>100);//条件1为true，条件2执行
        System.out.println(b2);
        System.out.println(i);

    }
}
