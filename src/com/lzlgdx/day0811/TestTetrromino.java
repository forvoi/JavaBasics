package com.lzlgdx.day0811;
//测试图形
public class TestTetrromino {
    public static void main(String[] args) {
        T t = new T();
//
//        t.printInfo();
//        System.out.println("--------------------------------");
//
        printWall(t);


//        System.out.println("--------------------------------");
        t.drop();
        printWall(t);
//        t.printInfo();
    }


//    分装出一个输出墙体的方法
    public static void printWall(Tetromino tt) {
        boolean b=true;
        Cell[] cells=tt.cells;
        for(int i=0; i<15; i++){
            for(int j=0; j<15;j++){
                for(Cell cell:cells){
                    if(cell.row==i&&cell.col==j){
                        System.out.print("*");
                        b=false;
                    }
                }
                if(b){
                    System.out.print("-");
                }else {
                    b=true;
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
