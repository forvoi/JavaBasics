package com.lzlgdx.day0802;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//分支结构--if语句
public class Demo02 {
    public static void main(String[] args) {
        //1.if语句结构

   /*
        int num=6;
        //判断num是否是偶数，如果是偶数输出，否则什么也不做。
        if(num%2==0) {
            System.out.println(num+"是偶数");
        }else{System.out.println(num+"不是偶数");}

        */


        //if语句{}省略问题
//        int m = 0;
//        if (m < 2) {
//            System.out.println(m);
//            System.out.println("hello");
//            System.out.println("小于2...");
//        }


        //判断num是奇数还是偶数
//        int num=10;
//        if(num%2==0) {
//            System.out.println(num+"是偶数");
//        }else{System.out.println(num+"不是偶数");}
//


        //if语句的嵌套问题
        //案例：学校举行运动会，百米赛跑在10s内的学生
        //     有资格进入决赛，根据性别分别进入男子组和女子组
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入你的成绩");
//        double score=sc.nextDouble();
//        System.out.println("请输入你的性别");
//        String gender=sc.next();
//        if(score<=10){//10秒以内
//            if(gender.equals("男")){
//                System.out.println("进入男子组");
//            }else {
//                System.out.println("进入女子组");
//            }
//        }else {
//            System.out.println("淘汰");
//        }


        //3.if...else if..else语句结构
        /**
         * 成绩小于0或大于100，成绩有误；
         * 成绩在[90-100]之间，成绩A优秀
         * 成绩在[80-90]之间，成绩B良好
         * 成绩在[60-80]之间，成绩C及格
         * 成绩在[0-60]之间，成绩D不及格
         *
         */
//        int score=100;
//        if(score<0||score>100){
//            System.out.println("成绩不合法");
//        }else if (score>=90&&score<=100){
//            System.out.println("成绩A优秀");
//        }else if (score>=80&&score<90){
//            System.out.println("成绩B良好");
//        }else if (score>=60&&score<80){
//            System.out.println("成绩C及格");
//        }else {
//            System.out.println("成绩D不及格");
//        }

        Date date=new Date();
        long time = date.getTime();
        System.out.println(time);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));



    }
}
