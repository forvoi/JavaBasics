package com.lzlgdx.test.test0803;

import java.util.Scanner;

//判断年月时间--switch语句
public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入一个年份和月份");
        Scanner sc=new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();

        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("该年该月为31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("该年该月为30天");
                break;
            case 2:
                if((year%4==0) && year%100!=0||year%400==0){
                    System.out.println("该年该月为29天");
                }else{
                    System.out.println("该年该月为28天");
                }
        }
    }
}
