package com.lzlgdx.test.test0802;

import java.util.Date;
import java.util.Scanner;

// 出租车计费
public class HomeWork {
    public static void main(String[] args) {
        //基本里程费
        //获取系统当前时间
        Date date   = new Date();
        int hours = date.getHours();
        System.out.println("系统当前时间：  "+hours+"时");
        //等待时间和里程数
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入等待时间");
        int waitHours = scanner.nextInt();
        System.out.println("输入里程数");
        int path = scanner.nextInt();
        //基本费用
        double money=0;
        if(hours>=7&&hours<=23){
            if(path>=0&&path<=3000){
                System.out.println("收取起步价10元");
            }else if(path>3000){
                int temple = (path - 3000) % 1000 == 0 ? (path - 3000) /1000: (path - 3000)/1000 + 1;
                money=10+temple*2;
                System.out.println("收取基本费用为"+money);
            }
        }else {
            if(path>=0&&path<=3000){
                System.out.println("收取起步价12元");
            }else if(path>3000){
                int temple = (path - 3000) % 1000 == 0 ? (path - 3000) /1000: (path - 3000)/1000 + 1;
                money=10+temple*2.3;
                System.out.println("收取基本费用为"+money);
            }
        }
        //空驶费
        double idleCharge=0.00;
        if(path>15000){
            idleCharge=(path-15000)/1000;
        }

        System.out.println("空时费为："+idleCharge);
        //等待费
        double waitMoney = (waitHours / 5) * 2;

        System.out.println("等待费为："+waitMoney);

        //总计费
        double moneySum=money+idleCharge+waitMoney;
        System.out.println("收取总费用为："+moneySum);
    }
}
