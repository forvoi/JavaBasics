package com.lzlgdx.test.test0804;

import java.util.Arrays;
import java.util.Scanner;

//要求从控制台输入一个班级的班级人数，根据班级人数再从控制台输入对应的学生姓名和成绩，并将姓名和成绩分别保存到两个数组中。
//存储成功后，计算全班同学的总分，平均分，最高分，
//最高分和最低分对应的学生的姓名
public class Homework {
    public static void main(String[] args) {
        //控制台输入班级人数、学生姓名、班级
        System.out.println("请输入班级人数：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //定义数组：学生姓名、所在班级、成绩
        String[] student = new String[number];
//        String[] class1=new String[number];
        Double[] grade = new Double[number];

        for (int i = 0; i < number; i++) {
            System.out.println("请输入第" + (i + 1) + "位学生的姓名和成绩");
            student[i] = sc.next();
            grade[i] = sc.nextDouble();
        }

        //定义全班的总分sumGrade，avgGrade
        double sumGrade = 0.00, avgGrade, maxGrade;
        for (int i = 0; i < number; i++) {
            sumGrade += grade[i];
        }
        avgGrade = sumGrade / number;

        while (true) {
            for (int i = 0; i < grade.length - 1; i++) {
                //排序student和Grade类
                for (int j = 0; j < grade.length - 1 - i; j++) {
                    if (grade[j] > grade[j + 1]) {
                        double temple = grade[j + 1];
                        grade[j + 1] = grade[j];
                        grade[j] = temple;
                        String temple1 = student[j + 1];
                        student[j + 1] = student[j];
                        student[j] = temple1;
                    }
                }
            }
//        Arrays.sort(grade);
            System.out.println("班级总分为：" + sumGrade);
            System.out.println("班级平均分为：" + avgGrade);
            System.out.println("班级最高分为：" + grade[grade.length - 1]);
            System.out.println("最高分对应的学生姓名为：" + student[student.length - 1]);
            System.out.println("最低分对应的学生姓名为：" + student[0]);
        }
    }
}
