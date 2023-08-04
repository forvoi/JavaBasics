package com.lzlgdx.day0804;
//循环的嵌套
public class Demo01 {
    public static void main(String[] args) {

        /*\
        * **********
         **********
         **********
         **********
         **********
         **********
         */
//        for(int i=0; i<7;i++){
//            //列
//            for (int j=0; j<i+1; j++) {
//                System.out.print("*");
//            }
//            //换行
//            System.out.println();
//        }


        //打印99乘法口诀表
        for(int i=1; i<10;i++){
            for (int j=1; j<i+1; j++) {
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
