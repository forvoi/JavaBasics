package com.lzlgdx.day0801;

import java.util.Random;

//演示基本类型间的转换
public class Demo05 {
    public static void main(String[] args) {
      /*  int a=100;
        int b=200;
        //自动类型转换，自动将a+b的结果由int类型转换为long类型
        long c=a+b;
        System.out.println(c);//300
        long m1=1024l;
        //强制类型转换，此情况强转没有风险
        int m2=(int)m1;
        System.out.println(m1);
        System.out.println(m2);


        long n1=1024l*1024*1024*4;
        System.out.println(n1);//4294967296
        System.out.println(Long.toBinaryString(n1));
        int n2=(int)n1;
        //此强转有风险，要谨慎
        System.out.println(n2);

        double pi=3.14159265354645465465;
        float f1=(float) pi;
        //精度损失
        System.out.println(f1);//3.1415927

        Random rand=new Random();*/
/*


        //2.数值运算时的自动转换情况
        int a1=800;
        int b1=599;
        int c1=a1-b1;
        System.out.println(c1);//201
        double d1=599.0;
        //运算时，a1为int类型，d1为double类型
        //自动类型转换：800.0-599.0=201.0
        double e1=a1-d1;
        System.out.println(e1);


        //计算80除以100的结果
        double result=80/100;  //0-->0.0
        System.out.println(result);

        double result1=80.0/100;//80.0/100.0
        System.out.println(result1);

*/


        //（3）Byte char short转换int的情况
        byte b1=100;
        byte b2=13;
        //运算时转换为int类型再运算
        int i = b1 + b2;
        byte i1 = (byte)(b1 + b2);
        System.out.println(i);
        System.out.println(i1);
        char c1='A';
        char c2 = 'B';
        int c3 = c1 + c2;
        char c4= (char)(c1 + c2);
        System.out.println(c3);//65+66=131
        System.out.println(c4);//空白


    }
}
