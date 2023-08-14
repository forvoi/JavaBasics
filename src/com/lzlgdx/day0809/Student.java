package com.lzlgdx.day0809;
//学生对象
public class Student extends Person{
//    成员变量
//    public String name;//姓名
//    public int age;//年龄
    public int score;//成绩


//    成员方法
//    吃的行为
    @Override
    public void eat(){


    }
//    学习的行为
    public void study(){

        System.out.println(score);
        System.out.println(name);
    }
}
