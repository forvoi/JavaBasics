package com.lzlgdx.day0808;

import com.lzlgdx.day0811.Cell;

import java.util.Arrays;
import java.util.Date;

//引用类型数组
public class Demo01 {

    public static void main(String[] args) {
        String[] arr = new String[3];//null
        System.out.println(arr);//地址信息
        System.out.println(Arrays.toString(arr));
        //        [Ljava.lang.String;@4eec7777
//                [null, null, null]

        Date[] arr1 = new Date[3];
        Date d1 = new Date();
        arr1[0]=d1;
        arr1[1]=new Date();
        arr1[2]=new Date();
        Cell[] cells = new Cell[4];
        cells[0]=new Cell(0,4);
        cells[1]=new Cell(1,3);
        cells[2]=new Cell(1,4);
        cells[3]=new Cell(1,5);

        System.out.println(cells);//[Lcom.lzlgdx.day0807.Cell;@41629346
        System.out.println(cells[0]);//com.lzlgdx.day0811.Cell@404b9385

    }
}
