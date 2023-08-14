package com.lzlgdx.day0811;
//四格拼板 该类作为七个图形的的共同父类
//七个图形都是由4个格子拼接而成
public class Tetromino {
//    成员变量
    public Cell[] cells;
//    构造方法
    public Tetromino() {
        cells = new Cell[4];
    }
//    成员方法
//    下落的行为
    public void drop(){
        for(Cell cell : cells){
            cell.drop();
        }
    }
    public void drop(int n){
        for(Cell cell: cells){
            cell.drop(n);
        }
    }
//    左移的行为
    public void moveLeft(){
        for(Cell cell:cells){
            cell.moveLeft();
        }
    }

    public void moveLeft(int n){
        for(Cell cell:cells){
            cell.moveLeft(n);
        }
    }

//    右移的行为
    public void moveRight(){
        for(Cell cell:cells){
            cell.moveRight();
        }
    }

    public void moveRight(int n){
        for(Cell cell:cells){
            cell.moveRight(n);
        }
    }

//    输出图形坐标信息的行为
    public void printInfo(){
        for(Cell cell:cells){
            cell.printCellInfo();
        }
    }
//输出墙体

}
