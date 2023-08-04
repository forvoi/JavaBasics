package com.lzlgdx.day0803;

import java.util.Scanner;

//循环结构
public class Demo04 {
    public static void main(String[] args) {
       /* //1.while循环
        int i=0; //起始条件
        while(i<10){ //结束条件
            System.out.println("你好，王淇铭"+(i+1));
            i++; //循环变量的改变
            if(i==6){
                break; //跳出循环
            }
        }*/

        //2.do... while循环
//        int m=0;//起始条件
//        do {
//            System.out.println("王淇铭是夯客"+(m+1));
//            m++; //循环变量的改变
//        }while(m<10);//结束条件

        //从控制台输入一个数字密码，如果密码不对，一直输出，如果密码正确，结束。
//        Scanner sc=new Scanner(System.in);
//        int pwd;
//        do{
//            System.out.println("请输入密码：");
//            pwd=sc.nextInt();
//        }while(pwd!=95217710);


        //3.for循环
//        for(int i=1;i<10;i++){
//            System.out.println("你好"+(i+1));
//        }

        //练习：计算输出如下的结果
        //1+2+3+4+5+...100;
//        int sum=0;
//        for (int n=1;n<=100;n++){
//            sum+=n;
//        }

        //特殊写法：
//        int i=1;
//        for(;i<=100;i++){
//            sum+=i;
//        }

//        int i=1;
//        for(;i<=100;){
//            sum+=i;
//            i++;
//        }
//        System.out.println("结果为"+sum);//5050


        //for循环的特殊写法3；
//        for(int i=1,j=6;i<100&&j<10;i++,j++){
//            System.out.println(i+j);
//        }

        //break和continue的区别
        for(int i=1;i<=10;i++){
            if(i==6){
//                break;
                continue;
            }
            System.out.println(i);
        }
    }
}
