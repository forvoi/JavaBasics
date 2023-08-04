package com.lzlgdx.test.test0803;
//猜数字游戏

import java.util.Random;
import java.util.Scanner;

/**
 * 运行程序，该程序产生一个1-100之间的随机数
 * 从控制台去输入一个数字去猜，共10次机会
 * 如果猜大了，提示“你猜大了，再猜”
 * 如果猜小了，提示“你猜小了，再猜”
 * 如果猜对了，提示“恭喜你猜对了”，游戏结束；
 * 如果10次机会用完了，游戏结束
 */
public class Homework01 {
    public static void main(String[] args) {
        //控制台输入随机数
        System.out.println("系统生成一个1-100随机数");
        Random random=new Random();
        int inNumber=random.nextInt(100);//   [0,100)
//        System.out.println(inNumber);

        System.out.println("玩家手动输入一个数字");
        Scanner sc=new Scanner(System.in);
//        int outNumber=sc.nextInt();

        int tip=0;
        for(int i=1; i<=10;i++){

            int outNumber=sc.nextInt();
            if(outNumber==inNumber){
                System.out.println("恭喜你，猜对了");
                tip=i;
                break;
            } else if (outNumber>inNumber) {
                System.out.println("你猜大了，再猜！你还有"+(10-i)+"机会。");
                tip=i;
            } else if (outNumber<inNumber) {
                System.out.println("你猜小了，再猜！你还有"+(10-i)+"机会。");
                tip=i;
            }else{
                System.out.println("输入数据错误");
                tip=i;
            }
        }
        if(tip==10){
            System.out.println("机会用完游戏结束");
        }

    }
}
