package com.lzlgdx.day0731;

//Java中的基本数据类型
public class Demo02 {
    public static void main(String[] args) {
        //1.整数类型
        //byte和short类型
        byte b1 = 3;
        byte b2 = 127;
        //byte b3 = 128; //编译错误，超出了byte的表示范围
        short s1 = 128;
        short s2 = 32767;
        //short s3 = 32768; //编译错误，超出了short的表示范围

        //int类型
        //-1000是直接量，直接量默认是int类型，i1变量声明的就是int类型
        int i1 = -1000;
        //编译错误，100亿超出了范围
        //int i2 = 10000000000;
        long l1 = 1000000000;

        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.MAX_VALUE); //2147483647

        System.out.println(Integer.toHexString(100000));
        //100000 --> 186a0
        //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
        //0 1 2 3 4 5 6 7 8 9 a b c d e f
        System.out.println(Integer.toHexString(10));

        //Int类型的两种赋值方式
        //给i3赋值10万
        int i3 = 100000;//方式一： 十进制写法
        int i4 = 0X186a0;//方式二：十六进制写法
        System.out.println(i3);
        System.out.println(i4);

        //练习：给变量i4 i5 i5赋值为15
        int i5 = 15;
        int i6 = 0Xf;
        System.out.println(i5);
        System.out.println(i6);


        //(2)整数类型的除法运算取整
        int i7=5/3;
        System.out.println(i7); //1

        //(3)Int类型运算时要防止溢出的发生
        int a=2147483647;
        long al=(long)a+1;
        System.out.println(al);

        long l10=100;
        int l11=(int)l10+1;
        System.out.println(l11);

    }
}
