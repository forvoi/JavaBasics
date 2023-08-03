package com.lzlgdx.test.test0802;

import java.util.Scanner;

//柜台收银
public class Test002 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("按要求输入商品的单价");
        Double price = sc.nextDouble();
        System.out.println("按要求输入商品的数量");
        Double number = sc.nextDouble();
        System.out.println("按要求输入付钱的金额");
        Double money = sc.nextDouble();
        //需要花费的金额
        Double temple=price*number;
        //最终消费
        Double consumption=0.00;
        //找零
        Double giveMoney;

        if(temple>=500.00){
            consumption=temple*0.8;
            giveMoney=money-consumption;
        }else{
            consumption=temple;
            giveMoney=money-consumption;
        }

        if (giveMoney>=0.00){
            System.out.println("消费"+consumption);
            System.out.println("找零"+giveMoney);
        }else {
            System.out.println("消费0");
            System.out.println("还差"+(0-giveMoney));
        }



    }
}
