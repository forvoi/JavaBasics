package com.lzlgdx.day0801;
//基本数据类型--long类型
public class Demo01 {

    public static void main(String[] args) {
        //long 类型的取值范围
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        //long类型的直接量写法
//        long a=10000000000;//编译错误
//        long b=10000000000l;//正确写法
//        long c=1000;//正确写法
        //直接量超出了int的范围，必须在直接两个后面加l，如果没有超出int的范围，可以不加

        //(3)long类型参与运算
        //计算1光年的传播距离 光速299792458m/s
        //不使用long类型运算
        int dis1=1*365*24*60*60*299792458;
        System.out.println(dis1);//1144840960
        long dis2=1*365*24*60*60*299792458;
        System.out.println(dis2);//1144840960
        long dis3=1*365*24*60*60*299792458l;
        System.out.println(dis3);
        //9454254955488000

        //(4)long类型表示时间
        //jdk提供的该方法，返回1970年1月1日零点到此时此刻所经历的毫秒数
        long time= System.currentTimeMillis();
        System.out.println(time);

    }
}
