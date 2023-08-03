package com.lzlgdx.test.test0802;

import java.util.Scanner;

//控制台输入年份月份
public class Test004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("按要求输入年份");
        int year = sc.nextInt();
        System.out.println("按要求输入月份");
        int month = sc.nextInt();
//        int [] m1={1,3,5,7,8,10,12};
//        int [] m2={4,6,9,11};
        if ((year%4==0) && year%100!=0||year%400==0){
            if(month==2){
                System.out.println("有29天");
            }else if(month>=1&&month<=12&& month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                System.out.println("有31天");
            }else if(month>=1&&month<=12 &&month==4||month==6||month==9||month==11){
                System.out.println("有30天");
            }else {
                System.out.println("输入有误");
            }
        }else {
            if(month==2){
                System.out.println("有28天");
            }else if(month>=1&&month<=12 &&month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                System.out.println("有31天");
            }else if(month>=1&&month<=12&& month==4||month==6||month==9||month==11){
                System.out.println("有30天");
            }else {
                System.out.println("输入有误");
            }
        }
    }
}
