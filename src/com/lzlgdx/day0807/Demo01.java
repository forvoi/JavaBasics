package com.lzlgdx.day0807;

public class Demo01 {
    //二维数组
        public static void main(String[] args) {
            //二维数组的初始化1
            int[][] numbers=new int[3][4];
            //可以先制定行数，可以先确定二维数组中有几个一维数组，具体每个一维数组的内容可以先不确定
            int[][] numbers2=new int[4][];
            //二维数组的初始化2
            int[][] numbers1={{1,3},{2,4,5},{3,4,5},{4,5,5},{5,5,5}};
            //求数组的大小
            System.out.println(numbers1.length);
            //输出第一行的一维数组长度
            System.out.println(numbers1[0].length);
            //输出指定二维数组数据
            System.out.println(numbers1[1][1]);
            //遍历数组
            for(int i=0;i<numbers1.length;i++){
                for (int j=0;j<numbers1[i].length;j++){
                    System.out.print(numbers1[i][j]+"");
                }
            }

            //可以先制定行数，可以先确定二维数组中有几个一维数组，具体每个一维数组的内容可以先不确定
            int[][] numbers3=new int[4][];
            //\//
            //要提前创建每一行的一维数组,否则报空指针异常
            numbers3[0]=new int[4];
            numbers3[1]=new int[4];
            numbers3[2]=new int[4];
            numbers3[3]=new int[4];
            //
            //
            //提前放内容
            for(int i=0;i<numbers3.length;i++){
                for (int j=0;j<numbers3[i].length;j++){
                    System.out.print(numbers3[i][j]+"");
                }
            }





        }
    }

