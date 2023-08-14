package com.lzlgdx.test.big;
//猜字母

import java.util.Arrays;
import java.util.Scanner;

/**
 * 要猜的字母是26个大写字母，随机生成的不重复的5个字母
 * 提示内容：猜对了xx个字符，xx个字符的位置
 */
public class Homework01 {
    /**
     * 启动类
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        //计算机输入一个字符数组
        Scanner sc = new Scanner(System.in);
        char[] inputRandom;

        System.out.println("<GuseeingGame>游戏开始,请输入你所猜的5个字母序列（exit--退出游戏）");
        int[] result;
        int counter = -1;
        do {
            char[] random;
            //判断重复
            do {
                random = getChars();
            } while (random == null);
            String inputString = sc.next();
            //输入五个字母或者退出游戏
            if (inputString.equals("exit")) {
                System.out.println("退出游戏");
                break;
            }
            inputRandom = inputString.toCharArray();
            //打印验证
            System.out.println(Arrays.toString(random));
            System.out.println(Arrays.toString(inputRandom));
            //调用结果判断
            result = getResult(random, inputRandom);
            if (inputString.length() !=5) {
                System.out.println("输入数量错误，重新输入");
                continue;
            }
            //得分调用
            counter++;
            getOnput(result, counter);
        } while (result[0] != result[1] || result[0] == 0);
    }

    /***
     * 生成五个随机字母
     * @return 字符集
     */
    public static char[] getChars(){
        char[] randomChars = new char[5];
        int[] counter = new int[5];

        for (int i = 0; i < 5; i++) {
            randomChars[i] = (char) (Math.random() * (91 - 65) + 65);
            counter[i] = randomChars[i];
        }
        Arrays.sort(counter);
        for (int i = 0; i < counter.length - 1; i++) {
            if (counter[i] == counter[i + 1]) {
                System.out.println("随机数有重复");
                return null;
            }
        }
        return randomChars;
    }
    /***
     * 提示内容：猜对了xx个字符，xx个字符的位置
     * @param chars 输入的字符数组
     * @return 返回字符串
     */
    public static int[] getResult(char[] chars, char[] chars1) {
//        int[] result = new int[2];
        //定义两个返回值num1.num2
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars1[j]) {
                    num1++;
                    if (i == j) {
                        num2++;
                    }
                }
            }
        }
        return new int[]{num1, num2};
    }

    public static void getOnput(int[] num, int counter) {
        //定义得分
        int score=500-10*counter;
        if(num[0]==5&&num[1]==5){
            System.out.println("恭喜你猜对了！你的得分是："+score);
        }else{
            System.out.println("你猜对了"+num[0]+"个字符，其中"+num[1]+"个字符的位置正确！"+"已经猜了"+(counter+1)+"次(exit--退出游戏)");
        }
    }
}
