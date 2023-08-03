package com.lzlgdx.day0803;
//循环结构
public class Demo04 {
    public static void main(String[] args) {
       /* //1.while循环
        int i=0; //起始条件
        while(i<10){ //结束条件
            System.out.println("你好，王淇铭"+(i+1));
            i++; //循环变量的改变
            if(i==6){
                break; //跳出循环
            }
        }*/

        //2.do... while循环
        int m=0;//起始条件
        do {
            System.out.println("王淇铭是夯客"+(m+1));
            m++; //循环变量的改变
        }while(m<10);//结束条件
    }
}
