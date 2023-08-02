package com.lzlgdx.day0802;

import java.util.Scanner;

//逻辑运算符的演示
public class Demo01 {
    public static void main(String[] args) {
        //逻辑与运算符 &&
      /*  int score = 70;
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
*/
        //短路现象
 /*       int i=100,j=200;
        boolean b1=(i>j) && (i++>100);//条件1为false，条件2不执行
        System.out.println(b1);
        System.out.println(i);
        boolean b2=(i<j) && (i++>100);//条件1为true，条件2执行
        System.out.println(b2);
        System.out.println(i);

        //逻辑或的短路现象
        int m=100,n=200;
        boolean b3 = m > 0 || n++ > 200;
        System.out.println(b3);//b3=true
        System.out.println(n);//n=200
*/


/*


        //赋值运算符

        //字符转连接加号
        //情况1：
        System.out.println(100+'A');
        System.out.println(100+90.5);//190.5
        System.out.println('0'+'1');//48+49=97
        //情况2：
        System.out.println((int)' ');
        System.out.println("0"+1);
        System.out.println("0"+'a');
        System.out.println(' '+100+200);
        System.out.println(" "+100+200);
        System.out.println(100+200+" ");


        //三目运算符
        int a=100;
        int b=200;
        int number = a > b ? 1 : -1;
        System.out.println(number);
*/


        //判断c的值，如果c的值大于0，输出正数
        //如果c的值等于0，输出“零"，如果c的值小于0，输出”负数“
       /* int c=-10;
        String s = c > 0 ? "正数" : c < 0 ? "负数" : "零";
        System.out.println(s);
*/
        //；练习：输入三个整数，使用三目运算符，计算三个整数中的最大值并输出。
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("输入三个数");
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            int i3 = scanner.nextInt();
            int max = i1 > (i2 > i3 ? i2 : i3) ? i1 : (i2 > i3 ? i2 : i3);
            System.out.println("最大值：" + max);
        }
    }
}
