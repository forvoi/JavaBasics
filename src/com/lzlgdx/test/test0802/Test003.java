package com.lzlgdx.test.test0802;

import java.util.Scanner;

//控制台三个整数，找出最大值
public class Test003 {
    public static void main(String[] args) {
        System.out.println("输入三个整数");
        Scanner sc=new Scanner(System.in);
        System.out.println("输入第一个整数");
        int a = sc.nextInt();
        System.out.println("输入第二个整数");
        int b = sc.nextInt();
        System.out.println("输入第三个整数");
        int c = sc.nextInt();
        //临时变量
        int max=0;
//        if(a>b){
//            max=a;
//        }else{
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }

        if(a>b){
            if(a>c){
                max=c;
        }else {
                max=c;
            }
        }
            else {
            if(b>c){
                max=b;
            }else{
                max=c;
            }
        }

        System.out.println("输出最大值为"+max);
    }
}
