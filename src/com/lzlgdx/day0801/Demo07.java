package com.lzlgdx.day0801;

import java.util.Scanner;

//运算符
public class Demo07 {
    public static void main(String[] args) {
        //1.算术运算符
       /* int m=5;
        System.out.println(m/2);
        System.out.println(m%2);
        //定义n的取值为0-10
        int n=0;
        //通过计算获取输出的结果是0 1 0 1
        System.out.println(0&2);
        System.out.println(1&2);
        System.out.println(2&2);
        System.out.println(3&2);
        System.out.println(4&2);
        System.out.println(5&2);
        System.out.println(6&2);
        System.out.println(7&2);
        System.out.println(8&2);
        System.out.println(9&2);
        System.out.println(10&2);*/


       /* int n1=0;
        //练习：定义一个三位整数，分别求个位十位百位
        Scanner scanner = new Scanner(System.in);

        int a= scanner.nextInt();
        System.out.println(a%10+a/10%10+a/100%10);*/

/*

        int a=1;
        //让a的值加1
       */
/* a=a+1;
        System.out.println(a);*//*

        int b=a++;//先使用，后自加
        //1.先确定“a++”的值
        //2.a自加
        //3.将“a++”的值赋值给a;
        System.out.println(b);
        System.out.println(a);
        int c=++a;//先自加，后使用
        System.out.println(c);
        System.out.println(a);

        //面试题
        int x=5;
        int y=6;
        int z=y+ --x*y++ +y;
        System.out.println(z);

        int p=3;
        int q=p++ + ++p;
        System.out.println(q);
        System.out.println(p);
*/


        //2.关系运算符
        int x=5;
        int y=3;
        System.out.println(x>y);
        System.out.println(x<y);
        System.out.println(x==y);
        System.out.println(x>=y);
        System.out.println(x<=y);
        System.out.println(x!=y);
        //判断变量y是否是偶数
        System.out.println(y % 2 == 0);
    }
}
