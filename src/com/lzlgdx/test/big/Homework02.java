package com.lzlgdx.test.big;
//五子棋游戏

import java.util.Scanner;

/**
 * 绘制棋盘
 * 黑白双方落子
 * 判断重复落子功能
 * 判断胜利
 */
public class Homework02 {
    public static void main(String[] args) {

        //显示棋盘
        char[][] chars = drawChessboard();
        displayBoard(chars);
        //黑方落子
        Scanner sc = new Scanner(System.in);
        boolean condition;
        boolean role=false;
        int row,col;
        while(true) {
            do {
                if(!role) {
                    System.out.println("轮到黑方落子");
                }else{
                    System.out.println("轮到白方落子");
                }
                row = sc.nextInt();
                col = sc.nextInt();
                if(row >=20||col >=20||row < 0||col < 0) {
                    System.out.println("输入错误，重新输入");
                    break;
                }
                condition = dropBlack(role,row, col, chars);
                if(condition){
                    role=!role;
                }
            } while (!condition);
            //显示棋盘
            displayBoard(chars);
            //判断输赢
            boolean winning = winning(row, col, chars);
            if(winning){
                break;
            }
        }

    }

    /**
     * 定义棋盘
     * @return 棋盘
     */
    public static char[][]  drawChessboard(){
        char[][] chessBoard=new char[20][20];
        //定义100*100的棋盘
        for (int i = 0; i <20;i++){
            for (int j = 0; j <20;j++){
                chessBoard[i][j] ='*';
            }
        }
        return chessBoard;
    }

    /**
     * 显示棋盘
     * @param chars Character
     */
    public static void displayBoard(char[][] chars){
        for(int i = 0; i <chars[1].length+1; i++){
            System.out.print(i+"\t");
        }
        System.out.println();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(i+1+"\t");
            for (int j = 0; j < chars[i].length; j++){
                System.out.print(chars[i][j]+"\t");
            }
            System.out.println();
        }
    }

    /**
     * 落子
     * @param i i
     * @param j j
     * @param chars chars
     * @return true||false
     */
    public static boolean dropBlack(boolean role,int i, int j,char[][] chars){
        if(chars[i-1][j-1]=='*'){
            if(!role){
                chars[i-1][j-1] ='@';
            }else{
                chars[i-1][j-1] ='O';
            }
            return true;
        }
        else{
            System.out.println("提示：该位置已经有子,重新下子");
            return false;
        }
    }
    /**
     * 核心算法，代码冗余，待优化
     * @param i i
     * @param j j
     * @param chars chars
     * @return true胜利 false继续落子
     */
    public static boolean winning(int i, int j, char[][] chars) {
        //竖向
        int col = 0;
        int col1 = 0;
        //横向
        int row = 0;
        int row1 = 0;
        //左斜向
        int left = 0;
        int left1 = 0;
        //右斜向
        int right = 0;
        int right1 = 0;
        //竖着赢
        for (int m = -5; m < 4; m++) {
            if (i + m >= 0 && i + m < 20) {
                if (chars[i + m][j - 1] == '@') {
                    col++;
                } else {
                    col = 0;
                }
                if (chars[i + m][j - 1] == 'O') {
                    col1++;
                } else {
                    col1 = 0;
                }
            }
            if (col == 5 || col1 == 5) {
                break;
            }
        }
        //横着赢
        for (int m = -5; m < 4; m++) {
            if (j + m >= 0 && j + m < 20) {
                if (chars[i - 1][j + m] == '@') {
                    row++;
                } else {
                    row = 0;
                }
                if (chars[i - 1][j + m] == 'O') {
                    row1++;
                } else {
                    row1 = 0;
                }
            }
            if (row == 5 || row1 == 5) {
                break;
            }
        }
        //左斜着
        for (int m = -5; m < 4; m++) {
            if (i + m >= 0 && j + m >= 0 && i + m < 20 && j + m < 20) {
                if (chars[i + m][j + m] == '@') {
                    left++;
                } else {
                    left = 0;
                }
                if (chars[i + m][j + m] == 'O') {
                    left1++;
                } else {
                    left1 = 0;
                }
            }
            if (left == 5 || left1 == 5) {
                break;
            }
        }
        //右斜着
        for (int m = -5; m < 4; m++) {
            if (i + m >= 0 && j - m >= 0 && i + m < 20 && j - m < 20) {
                {
                    if (chars[i + m][j - m] == '@') {
                        right++;
                    } else {
                        right = 0;
                    }
                    if (chars[i + m][j - m] == 'O') {
                        right1++;
                    } else {
                        right1 = 0;
                    }
                }
                if (right1 == 5 || right == 5) {
                    break;
                }
            }
        }
            if (col == 5 || row == 5 || right == 5 || left == 5) {
                System.out.println("黑方赢了,游戏结束");
                return true;
            } else if (col1 == 5 || row1 == 5 || right1 == 5 || left1 == 5) {
                System.out.println("白方赢了,游戏结束");
                return true;
            } else {
                System.out.println("继续落子！");
                return false;
            }
    }
}
