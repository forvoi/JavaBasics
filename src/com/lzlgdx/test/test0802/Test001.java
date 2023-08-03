package com.lzlgdx.test.test0802;

import java.util.Scanner;

//控制台输入一个年份，判断年份
public class Test001 {
    public static void main(String[] args) {
        System.out.println("按要求输入一个年份");
        Scanner sc=new Scanner(System.in);
        int year = sc.nextInt();

        if ((year%4==0 && year%100!=0)||year%400==0){
            System.out.println("year"+"是闰年");
        }else {
            System.out.println("year"+"是平年");
        }
    }
}
