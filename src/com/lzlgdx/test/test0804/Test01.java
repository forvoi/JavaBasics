package com.lzlgdx.test.test0804;

/**
 * *
 * ***
 * *****
 * *******
 */
public class Test01 {

    public static void main(String[] args) {
        for (int i = 1;i<5;i++) {
            //输出空格
            for(int m=3;m>=i;m--) {
                System.out.print(" ");
            }
            //输出*
            for (int n = 1;n<i*2;n++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1;i<5;i++) {
            //输出空格
            for(int m=1;m<=i;m++) {
                System.out.print(" ");
            }
            //输出*
            for (int n = 5;n>i*2-2;n--) {
                System.out.print("*");
            }
            System.out.println();
        }
//
    }
}
