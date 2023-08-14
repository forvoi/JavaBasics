package com.lzlgdx.day0807;

import com.lzlgdx.day0811.Cell;

public class TestCell {
    public static void main(String[] args) {
        //实例化cell类
        Cell cell = new Cell();
        //通过引用cell可以访问Cell类中的成员变量和方法
        System.out.println(cell.col);
        System.out.println(cell.row);
        cell.moveLeft();
        cell.moveLeft();
        cell.drop();
        System.out.println(cell.col);
        System.out.println(cell.row);
    }
}
