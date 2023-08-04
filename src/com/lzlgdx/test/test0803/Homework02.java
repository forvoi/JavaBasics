package com.lzlgdx.test.test0803;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机加法运算程序。
 * 运行程序，依次提示输出10道数字加法题目，
 * 可以从控制台输入答案。每答对一道继续下一道。
 * 每一道题答对或者答错要给出提示，10道题结束后，系统计算出总得分，并输出。
 */
public class Homework02 {

    public static void main(String[] args) {

        Random random=new Random();
        Scanner sc=new Scanner(System.in);

        //定义两个随机数number1，number2
        int number1,number2,answer;
        //定义键盘结果
        int sum;
        //定义分数
        int grade=0;
        for(int i=1;i<=10;) {

            //系统随机获得两个随机数
            number1=random.nextInt(1,10);
            number2=random.nextInt(1,10);
            //显示数字
            System.out.println(number1+"+"+number2);
            answer=number1+number2;
            sum=sc.nextInt();
            if(sum==answer){
                grade+=10;
                i++;
            }

        }
        System.out.println("得分为："+grade);


    }


}
