package com.lzlgdx.day0811;


//俄罗斯方块 T型
public class T extends Tetromino {
//    1成员变量
//    格子数组，用于存放4个格子对象构建的图形
//    public Cell[] cells;
//    2构造方法
//    无参构造0,0开始构建
    public T(){
        this(0,0);
    }

    public T(int row,int col){
//        cells=new Cell[4];
        cells[0]=new Cell(row,col);
        cells[1]=new Cell(row,col+1);
        cells[2]=new Cell(row,col+2);
        cells[3]=new Cell(row+1,col+1);

    }

//    //3成员方法
//    //下落的行为
//    public void drop(){
//        //从数组cells中取出4个格子对象，让四个格子对象分别下落
//        for (Cell c : cells) {
//            c.drop();
//        }
//    }
//    //一次下落n格
//    public void drop(int n){
//        for (Cell c : cells) {
//            c.drop(n);
//        }
//    }
//
//    //    输出图形的坐标信息
//    public void printInfo(){
//        for (Cell c : cells) {
//            c.printInfo();
//
//        }
//    }


    //重写printInfo方法
    @Override
    public void printInfo() {
        System.out.println("I am T图形");

        super.printInfo();
        //套娃
    }
}

