package com.lzlgdx.day0807;

import java.util.Arrays;
import java.util.Scanner;

//练习题
public class Home01 {
    public static void main(String[] args) {
        //输入班级人数
        Scanner sc=new Scanner(System.in);
        System.out.println("输入班级人数:");
        int num = sc.nextInt();
        //定义数组,用于存储学生姓名和成绩
        String[] names = new String[num];
        int[] scores = new int[num];
        //使用循环读取姓名和成绩，并存储到数组中
        for (int i = 0; i < num;i++){
            System.out.println("请输入第"+(i+1)+"个学生姓名");
            names[i] = sc.next();
            System.out.println("请输入第"+(i+1)+"个学生成绩");
            scores[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(scores));
        int totalScore=0;//总得分
        int avgScore=0;//平均分
        //假设第一个学生的成绩是最高分
        int maxScore=scores[0];//最高分
        String maxName=names[0];
        int minScore=1;//最低分
        for(int i=1;i<num;i++){
            //计算总分
            totalScore=totalScore+scores[i];
            //计算最高分
            if(maxScore<scores[i]){
                maxScore=scores[i];
                maxName=names[i];
            }
        }
        System.out.println("总分"+totalScore);
        System.out.println("平均分"+totalScore/num);
        System.out.println(maxScore);
        System.out.println(maxName);


    }
}
