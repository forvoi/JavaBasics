package com.lzlgdx.day0811;

//s型
public class S extends Tetromino {
    //    成员变量
//    格子数组，用来存放四个格子对象构建的图形
//    public Cell[] cells;

    //    构造方法
//    无参构造，0,0开始构建
    public S(){
        this(0,0);
    }
    public S(int row, int col){
//        cells = new Cell[4];
        cells[0] =new Cell(row+1,col);
        cells[1] =new Cell(row,col+1);
        cells[2] =new Cell(row+1,col+1);
        cells[3] =new Cell(row,col+2);

    }
//    成员方法

//    //    下落的行为
//    public void drop(){
//        //从数组cells中取出4个格子对象，让四个格子对象分别下落
//        for (int i=0;i<cells.length;i++){
//            cells[i].drop();
//        }
//    }
//    //    下落的多个行为
//    public void drop(int n){
//        //从数组cells中取出4个格子对象，让四个格子对象分别下落
//        for (int i=0;i<cells.length;i++){
//            cells[i].drop(n);
//        }
//    }
//
//    public void moveLeft(){
//        for(int i=0;i< cells.length;i++){
//            cells[i].moveLeft();
//        }
//    }
//    public void moveLeft(int n){
//        for(int i=0;i< cells.length;i++){
//            cells[i].moveLeft(n);
//        }
//    }
//    public void moveRight(){
//        for(int i=0;i< cells.length;i++){
//            cells[i].moveRight();
//        }
//    }
//    public void moveRight(int n){
//        for(int i=0;i< cells.length;i++){
//            cells[i].moveRight(n);
//        }
//    }
//    public void printInfo(){
//        for(int i=0;i< cells.length;i++){
//            cells[i].printInfo();
//        }
//    }
}
