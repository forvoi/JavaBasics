package com.lzlgdx.test.test0802;

import java.security.Key;
import java.util.Scanner;

//个人所得税
public class Homework02 {
    public static void main(String[] args) {
        //从控制台输入月实际收入S
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入月实际收入");
            int S = sc.nextInt();
            System.out.println("从控制台输入月实际收入" + S);
            //定义个人税起征点P
            int P = 3500;
            //定义月应纳税所得额K
            int K;
            K = S - P;
            //定义级数为kn，税率为fn
//        int kn,fn;
            double tax = 0.00;
            if (K < 0) {
                System.out.println("无税");
            } else if (K <= 1500) {
                tax = K * 0.03;
            } else if (K > 1500 && K <= 4500) {
                tax = 1500 * 0.03 + (K - 1500) * 0.10;
            } else if (K > 4500 && K <= 9000) {
                tax = 1500 * 0.03 + 3000 * 0.10 + (K - 4500) * 0.20;
            } else if (K > 9000 && K <= 35000) {
                tax = 1500 * 0.03 + 3000 * 0.10 + 4500 * 0.20 + (K - 9000) * 0.25;
            } else if (K > 35000 && K <= 55000) {
                tax = 1500 * 0.03 + 3000 * 0.10 + 4500 * 0.20 + 26000 * 0.25 + (K - 35000) * 0.30;
            } else if (K > 55000 && K <= 80000) {
                tax = 1500 * 0.03 + 3000 * 0.10 + 4500 * 0.20 + 26000 * 0.25 + 20000 * 0.30 + (K - 55000) * 0.35;
            } else if (K > 80000) {
                tax = 1500 * 0.03 + 3000 * 0.10 + 4500 * 0.20 + 26000 * 0.25 + 20000 * 0.30 + 25000 * 0.35 + (K - 80000) * 0.45;
            }

            //个人所得税税额
            System.out.println("个人所得税为" + tax);
        }
    }

}
