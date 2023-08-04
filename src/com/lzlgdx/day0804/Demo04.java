package com.lzlgdx.day0804;

import java.util.Arrays;

//数组的语法演示
public class Demo04 {

    public static void main(String[] args) {
        //1.数组的定义
//        int[] arr1=new int[7]; //ok
//        //编译错误，数组定义必须指定大小
////        int[] arr2=new int[];//编译错误
//        //语法上没有错误，但不建议这样写
//        int arr3[]=new int[10];


        //2.关于数组的初始化
        //方式一：数组在创建后没有具体的值，但是会有默认的初始值
//        int[] arr1=new int[7]; //0 0 0 0
//        double[] arr2=new double[7]; //0.0  0.0  0.0
//        boolean[] arr3=new boolean[7]; //false  false false  false
//        String[] arr4=new String[7];
//        for(int i=0;i<arr1.length;i++){
//            System.out.println(arr3[i]);
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr4));
        //数组使用new的方式创建以后，数组中有默认值
        //byte short int long 类型的数组默认值是0
        //float double类型的数组默认是0.0
        //char类型的数组默认值是‘、u0000’
        //boolean类型的数组默认值是false
        //除了8种基本类型以外的其他类型数组默认值是null



        //方式二：
        //可以在数组声明的同时对数组直接初始化内容
//        int[] arr5={1,2,5,6,7,8,9,10,11};
//        String[] arr6={"2","nihao","薛斌鹏"};
//        System.out.println(Arrays.toString(arr5));
//        System.out.println(Arrays.toString(arr6));
//
//
//
//        //方式三：
//        int[] arr8=new int[]{1,2,2};
//
//
//        //先声明一个数组
//        int[] arr9;
//        arr9=new int[10];
////        arr9={10,34,4,67};  //error
//        arr9=new int[]{56,43,434  ,344};
//

        //3.数组的访问
        //1.求数组的长度  数组名.length
//        int[] arr1=new int[5];//0 0 0 0 0
//        System.out.println(arr1.length);//5
//
//
//        int[] arr2={100,200,300,400};
//        System.out.println(arr2.length);//4
//
//
//        //2.通过下标来访问数组中的内容
//        int[] arr4={10,200,30,40,50,60};
////        System.out.println(arr4[6]);//ArrayIndexOutOfBoundsException数组下标越界异常
//
//        //
//        int temple=0;
//        temple=arr4[1];
//        arr4[1]=arr4[2];
//        arr4[2]=temple;
//
//        System.out.println(Arrays.toString(arr4));
//
//
//        //数字的遍历
//        int[] arr5={100,200,300,400};
//        System.out.println(Arrays.toString(arr5));
//        //通过循环的方式将数组arr5中的内容遍历
//        for(int i=0;i<arr5.length;i++){
//            System.out.println(arr5[i]);
//        }
//
//        System.out.println("____________________________");
//
//        //将数组arr5中的内容倒序输出
//        for(int i=arr5.length-1;i>=0;i--){
//            System.out.println(arr5[i]);
//        }


        //数组的复制
        //1.通过自己循环遍历的方式
//        int[] arr1={2,5,7,9,1};
//        int[] arr2=new int[arr1.length];//声明一个数组
//        for(int i=0;i<arr1.length;i++){
//            arr2[i]=arr1[i];
//        }
//        System.out.println(Arrays.toString(arr2));

//        int[] arr={2,3,4,6,8};
//        int[] arr1=new int[arr.length];
//        System.out.println("复制前"+Arrays.toString(arr1));
//        //00000
//        System.arraycopy(arr,0,arr1,0,arr.length);
//        System.out.println("复制后："+Arrays.toString(arr1));
//
//
//        //3.目标数组=Arrays。copyOf(源数组，长度);
//        int[] arr2 = Arrays.copyOf(arr, arr.length);
//        System.out.println(Arrays.toString(arr2));
//
//        int[] arr4=Arrays.copyOf(arr1,8);
//        System.out.println(Arrays.toString(arr4));



    }
}
