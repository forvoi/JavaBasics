package com.lzlgdx.day0811;
//格子对象
public class Cell {
    //成员变量
    public int row;//行
    public int col;//列
    //成员方法
    //下落的行为
    //左移的行为
    //右移的行为
    public Cell(){}
    public Cell(int row, int col){

        this.row = row;
        this.col = col;
    }
    public void drop(){
        row++;
    }
    public void drop(int n){
        this.row+=n;
    }

    public void moveLeft(){
        col--;
    }
    public void moveLeft(int n){
        this.col-=n;
    }
    public void moveRight(){
        col++;
    }
    public void moveRight(int n){
        col+=n;
    }
    public void printCellInfo(){
        String s = row+","+col;
        System.out.println(s);
    }


}
