package com.lzlgdx.day0801;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

//float类型和double类型的演示
public class Demo02 {
    public static void main(String[] args) {
        //1.浮点类型通常使用double类型
        double pi=3.14;
        System.out.println(pi*10);//31.400000000000002

        //2.浮点类型直接量的两种写法
        //方式一：通常写法
        double d1=125.0;
        System.out.println(d1);//125.0
        //方式二：科学计数法
        double d2=1.25E2;//1.25*10^2
        System.out.println(d2);//125.0

        //3.float类型
//        float f1=3.14; //编译错误
        //3.14直接量默认是double类型，f1是float类型
        float f2=3.14f; //ok,直接量后面必须加F

        //4.舍入误差问题
        double money=3.0;
        double price=2.9;
        System.out.println(money-price);
        //0.10000000000000009
        System.out.println(money-price+1);
        //1.1
        //使用BigDecimal完成浮点数的精确运算
        Random random = new Random();
        Date d = new Date();
        BigDecimal bd1 = new BigDecimal(String.valueOf(money));
        BigDecimal bd2 = new BigDecimal(String.valueOf(price));
        System.out.println(bd1.subtract(bd2));
        //减法计算 结果是0.1，精确结果
    }
}
