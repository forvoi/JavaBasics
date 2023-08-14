package com.lzlgdx.day0814;

import java.util.Scanner;

//启动类测试工商银行
public class TestUnionPay {
    public static void main(String[] args) {
//        //创建工商银行实现类ICBCImpl
//        ICBCImpl icbc = new ICBCImpl(1.1,"123456");
//        double money = icbc.getMoney();
//        String pwd = icbc.getPwd();
//        System.out.println(money+" , "+pwd);
//        icbc.toString();

        //创建工商银行实现类ICBCImpl
        ICBCImpl icbc = new ICBCImpl(1000,"123456");
        System.out.println(icbc);
        //卡内余额为1000，设置卡密码为123456
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入密码：");
        String inputPwd = sc.next();
        //判断密码是否正确
        if(icbc.checkPwd(inputPwd)){
            //密码正确
            //取钱
            System.out.println("请输入你取款的金额");
            double num = sc.nextDouble();
            if(icbc.drawMoney(num)){
                System.out.println("取钱成功，查看余额："+icbc.getMoney());
            }else{
                System.out.println("取钱失败，查看余额："+icbc.getMoney());

            }

        }else{
            //密码不正确
            System.out.println("密码错误");
        }
        icbc.getMoney();
        System.out.println(icbc);
    }
}
