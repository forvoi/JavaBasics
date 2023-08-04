package com.lzlgdx.day0804;

import java.util.Arrays;

//冒泡排序
public class Demo05 {
    public static void main(String[] args) {
        int[] arr={89,24,65,4};
        System.out.println("排序前："+ Arrays.toString(arr));
        //排序前89 24 65 4
//        int temple;
////        int min;
//        for (int i=0; i<arr.length-1; i++) {
//            //每一轮中两个数的比较
//            //i=0 3次比较
//            //i=1 2次比较
//            //i=2 1次比较
//            for(int j=0;j<arr.length-1-i;j++) {
////                min=arr[i];
//                if(arr[j]>arr[j+1]){
//                    temple=arr[j+1];
//                    arr[j+1]=arr[j];
//                    arr[j]=temple;
//                }
//            }
//        }
//        System.out.println("排序后："+Arrays.toString(arr));
//

        //sort排序
        Arrays.sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));
    }
}
