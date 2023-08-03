package com.lzlgdx.test.test0802;

import java.util.Scanner;

//输入三个数
public class Test005 {
    public static void main(String[] args) {
        System.out.println("按要求输入三个数");
        Scanner sc=new Scanner(System.in);
        System.out.println("按要求输入第一个整数");
        int a = sc.nextInt();
        System.out.println("按要求输入第二个整数");
        int b = sc.nextInt();
        System.out.println("按要求输入第三个整数");
        int c = sc.nextInt();

        int min=0;
        int max=0;
        int mid=0;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        if (c>max){
            max=c;
        }



        if(a<b){
            min=a;
        }else{
            min=b;
        }
        if (c<min){
            min=c;
        }

        if(max!=a&&min!=a){
            mid=a;
        } else if (max!=b&&min!=b){
            mid=b;
        } else {
            mid=c;
        }

        System.out.println("排序为"+min+" "+mid+" "+max);
    }
}
